package day03;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		/* num = 6 의 약수 출력
		 * 약수 : 나누어서 떨어지는 수 
		 * 6의 약수 : 1 2 3 6
		 * 12의 약수 : 1 2 3 4 6 12 
		 * */
		
		// 6/1=0, 6/2=0, 6/3=0, 6/4=2, 6/5=1, 6/6=0
		// 1부터 num 까지 1씩 증가  
		
		//
		
		int num = 6;
		for(int i =1; i<=num; i ++) {
			if (num % i == 0 ) {
				System.out.print (i+ " ");
			}
		}
		
		
		System.out.println(); //줄바꿈용
 		System.out.println("----------------");
		
		//num 입력 받아서 그 수의 약수를 출력
		
		
		  Scanner scan = new Scanner (System.in);
			
			System.out.println("숫자를 입력하세요.");
			
			int num2 = scan.nextInt();
			
			
			for (int i = 1; i<=num2; i++ ) {
				if (num2 % i == 0 ) {
					System.out.print(i + "  ");
				}
			}
			
		
		
			scan.close();
		
			
			System.out.println(); //줄바꿈용
	 		System.out.println("----------------");
			
			
			
	}

}
