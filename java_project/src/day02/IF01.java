package day02;

public class IF01 {

	public static void main(String[] args) {
		/* 조건문 : 조건식이 참일 경우, 실행하는 문
		 * if문, switch문
		 * if(조건식) { 실행문;}
		 * 실행문이 한줄일 경우 {} 생략가능
		 * 조건식은 참일 때, 실행문이 실행된다. 
		 * */

		int num = 10; 
		// num가 0보다 크면 양수 
		if (num>0) {
			System.out.println("양수");
		}
		
		//num 가 0보다 크면 양수 / 아니면 음수
		if(num>0) {
			System.out.println("양수");
		} else {
			System.out.println("음수");
			}
		
		//// num가 0보다 크면 양수 / 아니면 음수/ 0이면 0입니다.
		if(num>0) {
			System.out.println("양수");
		}else if(num==0) {
			System.out.println("0");
			} else {
				System.out.println("음수");
				}
		
		//num가 0보다 크면 양수(10보다 크면 10보다 큽니다)/ 아니면 음수 / 0이면 0입니다
		num=15;
		if (num>0) {
			System.out.println("양수");
		} if (num>10) {
			System.out.println("10보다 큽니다.");
		}else if(num<0){
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
		
		//num2 값을 저장하고, num2가 짝수인지 홀수 인지 콘솔에 찍기
		//num2 % 2 ==0
		
		int num2 = 7;
		if (num2 % 2 == 0) {
			System.out.println(num2 + ":짝수");
		} else {
			System.out.println(num2 + ":홀수" );
		}
		
		
		
	//조건 선택 연산자 => if 문으로 변경
		
		//평균이 80이상이면 결과: 합격, 아니면 결과 : 불합격 출력
		 //

		int kor = 80; int eng= 72; int math= 56;
		System.out.println(kor+eng+math);//208
		System.out.println((kor+eng+math)/3); //69 
		System.out.println((kor+eng+math)/3>=80 ? "합격" : "불합격");
		
		int avg= 69;
		if (avg>=80) {
			System.out.println("결과:"+ "합격");
		} else {
			System.out.println("결과:" + "불합격");
			}
		
		
		
	}

}
