package example_11_02_transaction.app;
import static utils.KeyboardUtil.*;

import example_11_02_transaction.service.FoodService;

public class App {
	
	private FoodService foodService = new FoodService();

	public void 주문하기() {
		// 고객 번호, 상품번호, 구매수량을 입력받아서 음식 주문 처리하기
		System.out.print("고객번호 입력: ");
		int customerNo = readInt();
		
		System.out.print("상품번호 입력: ");
		int foodNo = readInt();
		
		System.out.print("구매수량 입력: ");
		int amount = readInt();
		
		foodService.order(customerNo, foodNo, amount);
		System.out.println("### 주문이 완료되었습니다.");
	}
	
	public static void main(String[] args) throws Exception {
		
		App app = new App();
		app.주문하기();
	}
}
