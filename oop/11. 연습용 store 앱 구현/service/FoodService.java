package example_11_02_transaction.service;

import java.sql.Connection;
import java.sql.SQLException;

import example_11_02_transaction.dao.CustomerDao;
import example_11_02_transaction.dao.FoodDao;
import example_11_02_transaction.dao.OrderDao;
import example_11_02_transaction.vo.Customer;
import example_11_02_transaction.vo.Food;
import example_11_02_transaction.vo.Order;
import example_11_02_transaction.vo.OrderItem;
import utils.ConnectionUtil;

public class FoodService {
	
	private OrderDao orderDao = new OrderDao();
	private FoodDao foodDao = new FoodDao();
	private CustomerDao customerDao = new CustomerDao();
	
	public void order(int customerNo, int foodNo, int amount) {
		
		// try문 안에 있는 모든 insert, select, update 작업들이 하나의 트랜잭션이어야 하기 때문에
		// dao에서 connection을 만들지 않고 이 곳에서 하나로 묶는다
		Connection connection = null;
		try {
			connection = ConnectionUtil.getConnection();								// 새로운 트랜잭션 시작
			connection.setAutoCommit(false); // insert 실행 시마다 auto commit 되기 때문에 그 기능을 끈다
											 // 직접 commit, 혹은 rollback을 해야만 실행문이 반영된다
			// 1. food_seq 시퀀스에서 주문번호 획득하기
			int orderNo = orderDao.getOrderNo(connection);
			System.out.println("### 새로운 주문번호가 획득되었습니다.");						// 트랜잭션 안에서 조회작업 실행
			
			// 2. 식품번호에 해당하는 식품정보를 조회한다.
			Food food = foodDao.selectFood(foodNo, connection);
			System.out.println("### 주문할 식품번호에 대한 식품정보가 획득되었습니다.");			// 트랜잭션 안에서 조회작업 실행
			// 모든 vo 객체에 toString을 재정의했기 때문에 어떤 부분에서 오류가 났는지 쉽게 찾을 수 있음
			
			// 2. 고객번호에 해당하는 고객정보를 조회한다.
			Customer customer = customerDao.selectCustomer(customerNo, connection);
			System.out.println("### 주문하는 고객의 상세정보가 획득되었습니다.");					// 트랜잭션 안에서 조회작업 실행
			
			// 3. Order 객체를 생성하고, 주문정보(주문번호, 주문자, 총 구매금액)을 저장하고, 테이블에 저장시킨다.
			Order order = new Order();
			order.setNo(orderNo);							 // 주문번호 저장
			order.setCustomer(customer);					// 고객정보가 포함된 Customer 객체 저장
			order.setTotalPrice(food.getPrice() * amount);  // 총구매가격 저장
			orderDao.insertOrder(order, connection);		// 주문정보 테이블에 저장
			System.out.println("### 주문정보(주문번호, 고객번호, 총 구매금액)를 저장하였습니다.");	// * 트랜잭션 안에서 저장작업 실행
			
			// 4. OrderItem객체를 생성하고, 주문상품정보(주문번호, 식품번호, 구매수량)을 저장하고, 테이블에 저장시킨다.
			OrderItem orderItem = new OrderItem();
			orderItem.setOrderNo(orderNo);					// 주문번호 저장
			orderItem.setFood(food);						// 주문식품번호를 포함하고 있는 food 객체 저장
			orderItem.setAmount(amount);					// 주문수량 저장
			orderDao.inserOrderItem(orderItem, connection);	// 주문식품정보 테이블에 저장
			System.out.println("### 주문식품정보(주문번호, 식품번호, 구매수량)을 저장하였습니다.");	// * 트랜잭션 안에서 저장작업 실행
			
			// 5. 총 구매금액의 1%에 해당하는 포인트를 계산한다.
			int depositPoint = (int)(food.getPrice() * amount * 0.01);
			System.out.println("적립포인트: " + depositPoint);
			
			// 7. 조회된 고객정보의 포인트를 변경하고 테이블에 저장시킨다.
			customer.setPoint(customer.getPoint() + depositPoint);
			customerDao.updateCustomer(customer, connection);	// 포인트가 변경된 고객정보를 업데이트한다
			System.out.println("### 적립포인트를 저장하였습니다.");							// * 트랜잭션 안에서 변경작업 실행
			
			// 8. 식품정보의 재고를 구매수량만큼 감소시키고, 테이블에 저장시킨다.		
			food.setStock(food.getStock() - amount);
			foodDao.updateFood(food, connection);				// 재고수량이 변경된 음식정보를 업데이트한다
			System.out.println("### 상품의 재고수량을 변경하였습니다.");						// * 트랜잭션 안에서 변경작업 실행
			
			// 9. 모든 데이터베이스 엑세스 작업이 오류없이 완료되면 수행했던 모든 작업을 데이터베이스에 반영시킨다
			connection.commit();														// 트랜잭션 안에서 실행한 작업을 DB에 반영
			System.out.println("### 모든 작업의 실행결과를 데이터베이스에 반영시켰습니다.");		// 트랜잭션 종료
			
		} catch (Exception e) {
			try {
				// 10. 데이터베이스 엑세스 작업 중 오류가 발생하면 수행했던 모든 작업의 데이터베이스 반영을 취소시킨다.
				connection.rollback();													  // 트랜잭션 안에서 실행했던 작업 모두 취소
				System.out.println("### 오류가 발생해서 모든 작업의 데이터베이스 반영을 취소합니다."); // 트랜잭션 종료
			} catch (SQLException ex) {
				
			}
			
			throw new RuntimeException("데이터베이스 엑세스 작업 오류", e);
			
		} finally {
			// finally : 정상종료/오류 발생과 상관없이 무조건 실행해야 하는 코드를 작성한다
			// 주로 사용했던 리소스를 반환하는 코드가 위치한다
			try {
				// 11. 데이터베이스와 연결된 커넥션을 닫는다
				if (connection != null) {
					connection.close();
				}
				
			} catch (SQLException e) {
				
			}
		}
	}
}
