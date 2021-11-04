package example_11_02_transaction.vo;

public class Category {

	private int no;
	private String name;
	
	public Category() {}
	public Category(int no, String name) {
		this.no = no;
		this.name = name;
	}
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
	
	@Override
	public String toString() {
		return "Category [no=" + no + ", name=" + name + "]";
	}
}
