package day09;

public class MethodEX02 {

	public static void main(String[] args) {
		// 두 정수의 사칙연산(+ - * / %)을 처리
		
		MethodEX02 me= new MethodEX02();
		
			
			
		System.out.println(me.sum(10, 20));
		System.out.println(me.sub(10,20));
		System.out.println(me.mul(10, 20));
		System.out.println(me.div(10, 20));
		System.out.println(me.rem (10,20));
		
		int h = me.sum(10, 20); 
		
	
		
 
	}
	
	//사칙 연산의 메서드 생성 static 없이 생성 
	public int sum(int num1, int num2) {
		return num1 + num2 ;
	}
	
	public int sub (int num1, int num2) {
		return num1 - num2; 
	}
	public int mul(int num1 , int num2 ) {
		return num1 * num2; 
	}
	
	public int div(int num1, int num2) {
		return num1/num2;
	
	}
	
	public int rem(int num1, int num2) {
		return num1% num2;
	}
	}


