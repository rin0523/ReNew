package day03;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* up/down 게임
		 * 1~50 사이의 랜덤수를 생성하여 맞추는 게임
		 * ex) 컴퓨터가 랜덤 수 생성 : 35 
		 * 입력하세요> 10 
		 * up 
		 * 입력> 20 
		 * up
		 * 입력> 40
		 * down 
		 * 
		 * */
		
		
		
		Scanner scan = new Scanner (System.in);
		int a = (int)(Math.random()*50)+1;
		
		for(;;) {
			System.out.println("1~50까지의 수를 입력하세요");
			int b =scan.nextInt();
			if (a>b) {
				System.out.println("up");
				else if (a<b){
					System.out.println("down");
					else (a=b){
						System.out.println("정답");
					}
				}
			}
		
	//야구게임 (day 8 과제)
	//1. 입력을 위한 스케너 열기
		Scanner scan = new Scanner (System.in);
		
	//2. 변수 선언
		int comNum[] = new int [3];// 컴퓨터 배열
		int myNum[] = new int [3]; //user 배열
		int count = 0; // 게임 횟수 출력용 변수
		
	//3. 컴퓨터가 결정한 3가지 숫자들 중복되지 않게 추출
	for (int i =0; i<comNum.length; i++) {
		conNum [i] = (int) (Math.random()*9)+1;
		for (int j=0; j<i; j ++) {
			i--;
			break; //for(j)구문을 빠져나감
		}
	}
		
		//출력확인용
		/*for (int tmp : conNum) {
			System.out.print(comNum[i] + " "); 
		}
		
		//lotto 메서드의 randomArray 배열과 printArray 배열을 호출
		//static 메서드는 객체 생성없이 클래스명. 메서드명()으로 호출이 가능. 
		
		System.out.println();
		Lotto.randomArray(comNum);
		lotto.printArray(comNum);
		
		//static이 아닌 경우, 객체를 생성하여 객체명. 메서드명() 호출가능. 
		Lotto l = new Lotto(); // 객체 생성
		l.randomArray(comNum);
		l.printArray(comNum);*/
	
	System.out.println(" 야구게임 시작 > ");
    syso
	
		
		
	
	
		
		
		  
		   
		   
		   
		   scan.close();
	
	
	
	
	
}
   
		
		   
		   
		   
		
		
		
		
		

	
       


