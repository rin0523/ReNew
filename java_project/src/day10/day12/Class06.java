package day12;

public class Class06 {

	public static void main(String[] args) {
		
		EzenStudent es= new EzenStudent("인천", " 홍길동", "자바","1111");
		//객체를 출력하면 자동으로 toString 메서드를 호출
		System.out.println(es);
		
		EzenStudent es1= new EzenStudent();
		System.out.println(es1);
		

	}

}


/* 멤버변수 : 지점, 이름, 반, 전화번호
 * 메서드:출력(print메서드) =>toString메서드
 * 생성자
 * getter/setter
 * */

/* 객체를 초기화 하는 방법 : 기본값(null,0), 명시적 초기값, 초기화 블럭, 생성자
 * 1. 명시적 초기화 : 멤버변수의 선언과 동시에 초기값을 명시
 * 2. 초기화 블럭 : {} 멤버변수를 초기화
 * 3. 생성자:객체를 초기화 하는 방법
 * 초기화 우선순위
 * 기본값 -> 명시적 초기값->초기화블럭->생성자
 * 
 * */




 class EzenStudent{
	 
	 //멤버변수
	 private String branch="인천";
	 private String name="미상";
	 private String clas;
	 private String phone;
	 
	 
	 {
		 //초기화 블럭
		 branch="incheon";
		 clas="미정";
		 
	 }
	 
	 //생성자
	 public EzenStudent() {}
	 public EzenStudent(String branch, String name, String clas, String phone) {
		 this.branch=branch;
		 this.name=name;
		 this.clas=clas;
		 this.phone=phone;
		 
	 }
	 

	//메서드
	 
	 
	 
	 public void Ezen() {
		 System.out.println(branch+","+name+","+clas+","+phone);
		 
	 }
	
	 
	 @Override //(중요****)
	public String toString() {
		return "EzenStudent [branch=" + branch + ", name=" + name + ", clas=" + clas + ", phone=" + phone + "]";
	}
	 
	 
	 
	 
	 
	 
	//getter/setter
	 public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	 
	 
	 
	 
	 
 }