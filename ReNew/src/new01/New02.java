package new01;

import java.util.Scanner;

public class New02 {

	public static void main(String[] args) {
		// for문 이용하여 1~10 까지 짝수 출력

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		// 1부터 내가 입력한 수까지 5의 배수 출력

		System.out.println();
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력");
		int num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
		scan.close();
	}

}
