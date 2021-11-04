package example_11_02_transaction.vo;

public class Food {

	private int no;
	private String name;
	private int price;
	private int stock;
	private String onSale;
	private Category category;
	
	public Food() {}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getOnSale() {
		return onSale;
	}

	public void setOnSale(String onSale) {
		this.onSale = onSale;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Food [no=" + no + ", name=" + name + ", price=" + price + ", stock=" + stock + ", onSale=" + onSale
				+ ", category=" + category + "]";
	}
}
