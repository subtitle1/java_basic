package example_11_02_transaction.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import example_11_02_transaction.vo.Order;
import example_11_02_transaction.vo.OrderItem;

public class OrderDao {

	/**
	 * 주문번호로 사용할 시퀀스 값을 반환한다.
	 * @param connection 커넥션 객체
	 * @return
	 * @throws SQLException
	 */
	public int getOrderNo(Connection connection) throws SQLException {
		int orderNo = 0;
		String sql = "select foodorder_seq.nextval as order_no from dual";
		
		PreparedStatement pstmt = connection.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		rs.next();
		orderNo = rs.getInt("order_no");
		
		rs.close();
		pstmt.close();
		
		return orderNo;
	}
	
	/**
	 * 주문정보를 전달받아서 저장한다.
	 * @param order 주문정보
	 * @param connection 커넥션 객체
	 * @throws SQLException
	 */
	public void insertOrder(Order order, Connection connection) throws SQLException {
		String sql = "insert into tb_sample_food_orders "
				   + "(order_no, customer_no, order_total_price)"
				   + "values (?, ?, ?) ";
		
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, order.getNo());
		pstmt.setInt(2, order.getCustomer().getNo());
		pstmt.setInt(3, order.getTotalPrice());
		pstmt.executeUpdate();
		
		pstmt.close();
	}
	
	/**
	 * 주문식품정보를 테이블에 저장한다
	 * @param orderItem 주문식품정보
	 * @param connection 커넥션 객체
	 * @throws SQLException
	 */
	public void inserOrderItem(OrderItem orderItem, Connection connection) throws SQLException {
		String sql = "insert into tb_sample_food_order_items "
				   + "(order_no, food_no, food_amount) "
				   + "values (?, ?, ?) ";
		
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, orderItem.getOrderNo());
		pstmt.setInt(2, orderItem.getFood().getNo());
		pstmt.setInt(3, orderItem.getAmount());
		pstmt.executeUpdate();
		
		pstmt.close();
	}
}
