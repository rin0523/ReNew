package day09;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		//클래스 객체 생성(2명)
		//값을 입력 후 정보출력
		

		
		Student s1= new Student();
		s1.setName("홍길동");
		s1.setAge("23");
		s1.setPhone("010-1234-5678");
		s1.setAddr("주안동");
		s1.stuPrint();
		
		Student s2 = new Student();
		s2.setName("김길동");
		s2.setAge("25");
		s2.setPhone("010-9876-5432");
		s2.setAddr("구월동");
		s2.stuPrint();
		
				
				
				
		/*
		 * Scanner scan = new Scanner(System.in); System.out.println("이름");
		 * s3.setName(scan.next()); System.out.println("나이"); s3.setAge(scan.next());
		 * System.out.println("번호"); s3.setName(scan.next()); System.out.println("주소");
		 * s3.setAddr(scan.next()); s3.stuPrint();
		 * 
		 * 
		 * 
		 * scan.close();
		 */
	
	
	
		
		
	}

}


//클래스 생성
//학생 클래스 생성
//이름, 나이, 전화번호, 주소
//출력
//이름 (나이) 전화번호


	class Student{
		//멤버변수
		private String name;
		private int age;
		private String phone;
		private String addr;
		
		//생성자 위치
		//생성자 오버로딩 가능
		//생성자 오버로딩 조건
		//- 매개변수 개수가 다르거나, 매개변수 유형이 다르거나..
		public Student() {} //컴파일러가 자동으로 제공하는 생성자
		
	  
		
		
		
		public Student(String name, int age, String phone, String addr) {
			//생성자 호출
			//생성자 호출 - 반드시 첫줄에서만 가능
			//
			//this(name,age);
			this.name=name;
			this.age=age;
			this.phone=phone;
			this.addr=addr;
		}
	
		public void stuPrint() {
			System.out.println(name+"("+age+")"+phone);
			
		}

	

		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public String getPhone() {
			return phone;
		}


		public void setPhone(String phone) {
			this.phone = phone;
		}


		public String getAddr() {
			return addr;
		}


		public void setAddr(String addr) {
			this.addr = addr;
		}
		
		
	}
	
	

