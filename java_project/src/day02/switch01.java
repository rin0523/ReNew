package day02;

public class switch01 {

	public static void main(String[] args) {
		/*switch문 : 값에 따라 케이스를 달리주는 형식
		 * 
		 * switch (변수 / 식) {
		 * case 값 1 : 실행문 1; break;
		 * case 값 2 : 실행문 2 ; break;
		 * case 값 3 : 실행문 3; break;
		 * default : 나머지 실행문;
		 * }
		 * break; switch 문으로 빠져나갈때 사용
		 * */
		
		int num = 1 ;
		switch(num) {
		case 1:
			System.out.println("num는 1입니다.");break;
		case 2: 
			System.out.println("num는 2입니다. "); break;
		case 3 :
			System.out.println("num는 3입니다."); break;
			default:
			System.out.println("잘못된 입력입니다."); 
			
		}

		
		//1~6까지의 수를 랜덤으로 추출하여 "주사위 : 1칸 전진" 출력 
		// (0*6) +1 ~ (1*6) +1 => 1~6까지
		int 주사위 = (int)(Math.random()*6)+1;
	
		
		switch(주사위) {
		case 1:
			System.out.println("주사위: 1칸 전진"); break;
		case 2 :
			System.out.println("주사위 : 2칸 전진");break;
		case 3: 
			System.out.println("주사위 : 3칸 전진 ");break;
		case 4:
			System.out.println("주사위 : 4칸 전진 ");break;
		case 5:
			System.out.println("주사위 : 5칸 전진 ");break;
		case 6:
			System.out.println("주사위 : 6칸 전진 ");break;
			
		default : System.out.println("잘못된 주사위 값");
			
			
		}
		
		
		
	}

}
