package day02;

import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
		/*국어, 영어, 수학 점수를 입력받아서
		 * 합계, 평균, 평가를 출력
		 * 평가는 평균이 90이상이면 A 
		 * 평균이 80이상이면 B
		 * 평균이 70 이상이면 c 
		 * 
		 * 입벽값이 0보다 작거나 100보다 크면 잘못된 값
		 * */

		
		 Scanner scan = new Scanner (System.in);
		 
		int kor= scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		 if(kor <0|| kor> 100) {
			 System.out.println("잘못되었습니다");
				}
		 if (eng<0|| eng>100) {
			 System.out.println("잘못되었습니다.");}
	
	     if (math<0|| math>100) {
	    	 System.out.println("잘못되었습니다");
	    
	     }
	     
	     int sum = kor + eng+math;
	     
	     double avg = sum /3;
	     
	     System.out.println("합계 :" +sum+ ", 평균:"+avg);
	     
	     char ch = 'D';
	     
	     if (avg>=90) {
	    	System.out.println("평가: " +"A");
	    	 } else if (avg>=80){
	    		 System.out.println("평가:" +"B");}
	    	 else if (avg>=70){System.out.println("평가:" + "C");}
	    	 else {System.out.println("평가: "+ "D ");} 
	     }
	

	scan.close();	
}


	    	 
		
		 
		 
		 
	 
	      
		
	


