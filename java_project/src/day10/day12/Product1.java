package day12;

public class Product1 {

private String name;

private String price;

private int cnt;

private String[]addmenu;
private String[]addprice;

public Product1() {}

public Product1(String name, String price, int cnt) {

this.name=name;

this.price=price;

this.cnt=cnt;

}

public void info() {

System.out.println("메뉴: "+ name + "," + "가격:" + price);

}

public void printmenu(String name, String price) {

System.out.println("메뉴:"+ name+ "가격:" + price);

}

public void add(String name, String price) {
	this.addmenu[cnt]=name;
	this.addprice[cnt]=price;
	
	System.out.println("추가메뉴:"+ name );
	System.out.println("가격: " + price);
	cnt++;
}
public String getName() {

return name;

}

public void setName(String name) {

this.name = name;

}

public String getPrice() {

return price;

}

public void setPrice(String price) {

this.price = price;

}

public int getCnt() {
	return cnt;
}

public void setCnt(int cnt) {
	this.cnt = cnt;
}




}