package day03;

import java.util.Scanner;

public class yyy {

	public static void main(String[] args) {
		
		
		//야구게임 (day 8 과제)
		//1. 입력을 위한 스케너 열기
			Scanner scan = new Scanner (System.in);
			
		//2. 변수 선언 
			int comNum[] = new int [3];// 컴퓨터 배열
			int myNum[] = new int [3]; //user 배열
			int count = 0; // 게임 횟수 출력용 변수  
			
		//3. 컴퓨터가 결정한 3가지 숫자들 중복되지 않게 추출
		for (int i =0; i<comNum.length; i++) {
			comNum [i] = (int) (Math.random()*9)+1;
			for (int j=0; j<i; j++) {
				if (comNum[i] == myNum[j]) {
				i--; 
				break; //for(j)구문을 빠져나감
				}
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
		
	
		
		System.out.println("야구게임 시작 > ");
		System.out.println("컴퓨터가 숫자를 결정하였습니다.");
		
		//4. 사용자 숫자 입력받기
		
		
		while(true) {
			int s=0;
			int b=0;
			System.out.println("숫자입력(1~9, 숫자3개) > ");
			
		
			for (int i =0; i<myNum.length ; i ++) {
				myNum[i]= scan.nextInt();
				
			}
			count++; //게임 횟수 카운트 증가
			
			//5. 숫자 비교
			for(int i=0; i<comNum.length; i++ ) {//컴퓨터 넘버 기준
				for(int j=0; j<myNum.length; j++) {//사용자 넘버 기준
					//스트라이크 기준 자리와 숫자가 일치
					if (comNum[i] == myNum[j] && i == j) {
					s++;
					
				} else if (comNum[i] == myNum[j] && i!=j) {
					b++; 
				}
			}
		}
			
			//출력
			if(s==0 && b==0) {
				System.out.println("OUT ");
			}else {
				System.out.println(s + " s " + b + "b");
				System.out.println("게임 횟수 " + count);
			}

			
			if (s==3) {
				System.out.println("정답");
				System.out.println("게임 횟수 " + count );
				break; // while 구문 벗어남.
			}
			
			
	}

		scan.close(); 
		
	}
	
}