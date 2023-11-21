package boardJDBC;

import java.util.List;
import java.util.Scanner;

public class BoardController {

	private Scanner scan;
	private Service svc; // -> 아직 만든거 아님
	private boolean flag;

	public BoardController() {
		scan = new Scanner(System.in);
		svc = new BoardServiceImpl();
		flag = true;
		printMenu();
	}

	private void printMenu() {
		while (flag) {
			System.out.println("--게시판--");
			System.out.println("1.글쓰기|2.글목록보기|3.글상세보기");
			System.out.println("4.글수정|5.글삭제|6.종료");
			System.out.println(">>메뉴선택 : ");
			int menu = scan.nextInt();

			switch (menu) {
			case 1:
				write();
				break;
			case 2:
				list();
				break;
			case 3:
				detail();
				break;
			case 4:
				modify();
				break;
			case 5:
				delete();
				break;
			default:
				flag = false;
				break;
			}
		}

	}

	private void delete() {
		System.out.println("삭제 글 번호>");
		int bno = scan.nextInt();

		int isOk = svc.delete(bno);
		System.out.println("글 삭제 " + ((isOk > 0) ? "성공 " : "실패"));

	}

	private void modify() {
		System.out.println("수정 글 번호 > ");
		int bno = scan.nextInt();
		System.out.println("수정 제목 이름 : ");
		scan.nextLine();
		String title = scan.nextLine();
		System.out.println("글 내용 : ");
		String content = scan.nextLine();

		BoardVO b = new BoardVO(bno, title, content);
		int isOk = svc.modify(b);
		System.out.println("글 수정" + (isOk > 0 ? "성공 " : "실패"));

	}

	private void detail() {
		System.out.println("번호>");
		int bno = scan.nextInt();
		BoardVO b = svc.detail(bno);
		System.out.println(b);

	}

	private void list() {
		List<BoardVO> list = svc.list();

		for (BoardVO b : list) {
			System.out.println(b);
		}

	}

	private void write() {
		System.out.println("제목입력");
		scan.nextLine();
		String title = scan.nextLine();
		System.out.println("작성자 입력");
		String writer = scan.nextLine();
		System.out.println("내용 입력");
		String content = scan.nextLine();

		BoardVO b = new BoardVO(title, writer, content);

		int isOk = svc.write(b);
		System.out.println("글 등록" + ((isOk > 0) ? "성공" : "실패"));

	}
	
	

}
