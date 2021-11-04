package example_11_02_transaction.vo;

public class OrderItem {

	private int orderNo;
	private Food food;
	private int amount;
	
	public OrderItem() {}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "OrderItem [orderNo=" + orderNo + ", food=" + food + ", amount=" + amount + "]";
	}
}
