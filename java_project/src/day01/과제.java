package day01;

public class 과제 {

	public static void main(String[] args) {
		/* 매일 마지막 시간 과제 출제
		 * 카페에 제출
		 * 국어, 영어, 수학의 점수 합계와 평균을 출력
		 * 조건선택 연산자 이용하여
		 * 평균이 80이상이면 결과: 합격, 아니면 결과 : 불합격 출력
		 * */

		int kor = 80; int eng= 72; int math= 56;
		System.out.println(kor+eng+math);//208
		System.out.println((kor+eng+math)/3); //69 
		System.out.println((kor+eng+math)/3>=80 ? "합격" : "불합격");
		
		/* int kor =78; int eng= 45; int math=23;
		 * 지역변수는 반드시 초기화를 해야한다.
		 * int sum= 0; sum=0;
		 * double avg = 0; 
		 * sum = kor+eng+math;
		 * avg= sum/3.0 ; 
		 * system.out.println("합계:" + sum+", 평균:" +avg);
		 * system.out.println ("결과: " +(avg>= 80? "합격." : "불합격" ));
		 * 
		 * */
		
	}

	

}
