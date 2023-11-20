package word;

import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		WordManager WM= new WordManager();
		
		int menu=0;
		
		do {
			System.out.println("메뉴선택해주세요");
			System.out.println("1.단어등록|2.단어검색|3.단어수정 ");
			System.out.println("4.단어출력|5.파일로 출력|6.종료");
			menu=scan.nextInt();
          try {
				
				switch(menu) {
				
				case 1 ://등록
					WM.add(scan);
					break;
					
				case 2://검색
					WM.search(scan);
					break;
					
				case 3://수정
					WM.mod(scan);
					break;
				case 4://출력
					WM.print();
					break;
					
				case 5: //파일로 출력
					WM.filePrint();
					break;
					
				case 6:
					System.out.println("종료");
					break;
					
				default:
					System.out.println("잘못된 입력");	
					
				
				
			
			
		} while(menu!=5);
		
			
		scan.close();
		

		}

		}
		
	}
}
