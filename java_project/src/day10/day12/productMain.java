package day12;

import java.util.Scanner;

public class productMain { // class 명 바꾸는 방법이 뭔지..

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Product1[] p = new Product1[10];
		

		

		for (int i = 0; i < p.length; i++) { // .length가 뜻하는 것은 뭔지..

			System.out.println("상품을 등록하시겠습니까?(y/n)");

			String s = scan.next();

			if (s.equals("y")) {

				System.out.println("제품의 이름을 입력해주세요");

				String menu = scan.next();

				System.out.println("가격을 입력해주세요.");

				String price = scan.next();

				p[i] = new Product1();

				p[i].printmenu(menu, price);

			} else if (s.equals("n")) {

				System.out.println("취소되었습니다");

				
				break;

			} else {

				System.out.println("잘못된 입력입니다.");

			}

		}

		for (Product1 a : p) { // 등록된 제품 리스트 출력을 어떤식으로 해야하는지 모르겠음

			if (a != null) {

				a.info();

			}

		}

		scan.close();

	}

}
