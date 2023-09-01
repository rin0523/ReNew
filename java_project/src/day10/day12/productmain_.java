package day12;

import java.util.Scanner;

public class productmain_ {
	//선생님 풀이

	public static void main(String[] args) {
		/* 반복적으로 메뉴를 등록 프로그램
		 * */
		
		product[]p= new product[10];
		
		Scanner scan= new Scanner(System.in);

		
		char menu = 'y';
		int cnt = 0; //while에서 index를 핸들링 하기 위한 변수
		
		while(menu !='n') {
			System.out.println("상품 등록(y/n) >> ");
			menu=scan.next().charAt(0);
			
			if(menu == 'y') {
				//반복 입력
				System.out.println("상품명 > " );
				String name= scan.next();
				
				System.out.println("가격> ");
				int price = scan.nextInt();
				
				//객체를 생성해서, 메뉴와 가격을 등록=>배열 cnt번지에 추가
				//생성자 이용
				product tmp = new product(name,price);
				p[cnt]=tmp;
				
				
				
				//+ 다른 방법)메서드 이용
				 p[cnt]= new product();
				 p[cnt].insertproduct(name, price);
				 cnt++; // index 증가
				
			}else {
				//menu == 'n' 
				if (menu=='n'){
					System.out.println("상품등록 종료");
					
				}else {
					System.out.println("y/n만 가능합니다.");
				}
						
			}
		}
		
		System.out.println("--등록된 상품 리스트");
		for(int i=0; i<cnt; i++) {
			//toString
			System.out.println((i+1)+ "." + p[i]);
			
			//출력메서드르 사용한 경우
			/*
			 * System.out.print((i+1)+ "." + p[cnt]);
			 *  p[i].메서드호출;
			 */
		
		
		
		scan.close();
	}

}
}
