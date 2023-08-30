package day03;

public class For01 {

	public static void main(String[] args) {
		/* 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * for, while, do~while 
		 * - for,while문은 동작방식이 같음 
		 *    => 조건에 맞지 않으면 한번도 실행 안될 수 있음
		 * - do~ while문은 동작방식이 조금 다르다
		 *    => 조건에 맞지 않아도 무조건 한번은 실행 
		 *    
		 *  for(1 초기화 ; 2 5 8 조건식 ; 4 7 증감식) {
		 *  3 6 실행문; 
		 *  }
		 *  
		 * - 초기화 : 조건식이나 실행문에서 사용할 변수를 초기화 : 생략가능 
		 *           처음 한번만 실행
		 * - 조건식 : 반복문의 반복을 결정하는 식(true => 반복) : 생략가능
		 * - 증감식 : 조건식에서 사용되는 변수를 증가 / 감소시켜 반복횟수를 조절          
		 * */
		
		//1~10까지 출력하는 예제
		//초기화 : i변수 사용 int i = 1 ;
		//조건식 : 10이 될 때 까지 => i <= 10 ;
		//증감식 : i가 1씩 증가 => i++; (i = i +1) 
		//실행문 : i 출력 
		
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
 		System.out.println(); //줄바꿈용
 		System.out.println("----------------");
 		
 		
 		
 		
		//10부터 1까지 출력하는 예제
 		
 		for(int i=10; i>=1; i--) { //10 >= 1
 			System.out.print(i+" ");
 		} 
 		System.out.println(); //줄바꿈용
 		System.out.println("----------------");
 		
 		
 		//2부터 10 까지 짝수만 출력 예제
 		for(int i = 2; i<=10; i=i+2) {
 			System.out.print(i +" ");
 		}
 		
 		System.out.println(); //줄바꿈용
 		System.out.println("----------------");
 		
 		//1~20까지 중 짝수만 출력 예제
 		//if문을 사용하여 조건에 맞는 자료만 출력
 		
 		for (int i= 1; i<=20; i++) {
 			if (i % 2 == 0 ) {
 				System.out.print(i + " "); 
 			} 
 		}
 		
 		System.out.println(); //줄바꿈용
 		System.out.println("----------------");
 		
 		//1부터 10까지 홀수만 출력/ 짝수일 때는 짝수는 pass라는 문구 출력
 		
 		for (int i=1; i<=10; i++) {
 			if ( i % 2 == 0) {
 				System.out.println("pass");
 			}else {
 				System.out.println(i);
 			}
 		} 
 		
 		System.out.println(); //줄바꿈용
 		System.out.println("----------------");
 		
 		// 1부터 10까지 합계 출력
 		// 초기화 : 1부터, 조건식: 10까지, 증감식 : 1씩 증가
 		// 실행문 : 누적 더하기 
 		// 실행 후 출력  
 		// 지역변수 () {생성    소멸} 
 		
 		int sum = 0;
 		for(int i = 1; i<=10; i++) {
 			sum= sum + i; // sum = 0+1+2+3+4+5+6+7+8+9+10 
 		} System.out.print(sum);
 		
 		System.out.println(); //줄바꿈용
 		System.out.println("----------------");
 		
 		
 		//1부터 10까지 짝수의 합과 홀수의 합을 출력
 		/* for 1부터, 10까지 1씩 증가하여 값을 비교
 		 * if 짝수인지 판단 => 짝수의 합계
 		 *    홀수인지 판단 => 홀수의 합계
 		 * for문 종료 후 => 출력
 		 * */
 		
 		int num = 0;
 		int num2 = 0;
 		for (int i= 1; i<=10; i++) {
 			if (i % 2 ==0 ) {
 				//짝수 합계를 누적
 				num= num + i;
 			}else {
 				num2=num2+i;
 			}
 		} 
 		System.out.println("짝수합:" + num);
 		System.out.println("홀수합:" + num2);
 		
 		
 		
 	
 		
 		
	}
}


