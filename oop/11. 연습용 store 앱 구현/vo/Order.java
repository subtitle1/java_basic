package example_11_02_transaction.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private int no;					
	private Customer customer; // 고객 번호 말고 고객 객체를 넣은 이유: 번호 외 다른 정보도 볼 수 있게 하도록
							   // 테이블의 외래키로 설정되어 있는 곳은 이렇게 객체 자체를 필드로 넣어주는 게 맞다
	private int totalPrice;
	private String status;
	private Date createdDate;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public List<OrderItem> getItems() {
		return items;
	}
	
	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}

	@Override
	public String toString() {
		return "Order [no=" + no + ", customer=" + customer + ", totalPrice=" + totalPrice + ", status=" + status
				+ ", createdDate=" + createdDate + ", items=" + items + "]";
	}
}
