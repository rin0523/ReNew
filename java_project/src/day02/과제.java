package day02;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/*카페에 제출
		 * 정수 2개와 연산자 하나를 입력받아 두 정수의 연산을 출력
		 * 연산자는 + - * / %
		 * ex)
		 * 3 2 + => 3+2=5
		 * 6 3 / => 6 /3 = 2
		 * 만약 연산자의 종류가 다른 연산자가 들어오면 잘못된 입력 
		 * */
	

		
		Scanner scan = new Scanner (System.in); 
		 System.out.println(" 정수 두개 입력.");
		 int num = scan.nextInt();
		 int num2 = scan.nextInt();
		 System.out.println("연산자 입력(+ - * / %)");
		 char ch = scan.next().charAt(0); // 한글자 입력받기

		switch (ch) {
		case '+': System.out.println(num + "+" +num2+ "=" + (num + num2)); break;
		case '-': System.out.println(num + "-" + num2 + "=" + ( num-num2 ));break; 
		case '*': System.out.println(num + "*"+ num2 + "=" + (num*num2) );break;
		case '/': System.out.println(num + "/" + num2 + "=" + (num/num2));break;
		case '%': System.out.println(num + "%" + num2 + "=" +(num%num2) );break;
		default :System.out.println("잘못된 입력"); break; 
		
		} scan.close();
		
		
	
		
	}

}
