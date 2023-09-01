package day12;

public class product {
	
	//선생님 풀이
	
	private String name;
	private int price;
	
	
	public product() {}
	public product(String name, int price) {
		this.name=name;
		this.price=price;
	}

	
	//삽입메서드
	public void insertproduct(String name, int price) {
		this.name=name;
		this.price=price;
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
	@Override
	public String toString() {
		return " [메뉴=" + name + ", 가격=" + price + "]";
	}
	
	
	
	
	
	
	
}
