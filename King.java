package Project;

import java.util.Scanner;

public class King {
	private String kingName;
	private boolean select;
	int answer;
	
//	Scanner scan = new Scanner(System.in);
	
	public King() {}
	
	//유저 이름 세팅
	public void userName(Scanner scan) {
		System.out.println("그대의 이름은 무엇인가?");
		String name = scan.next();
		setKingName(name);
		System.out.println("나의 이름은 "+kingName+"왕");
	}
	
	//그러하다/불허한다 선택
	public void printSelect(Scanner scan) {
		while(true) {
			System.out.println(" [1. 그러하라]  "+"|"+"  [2.불허한다] ");
			select(scan);
			return;
		}
	}
	
	// 1,2번 선택 메소드 (예외처리 포함)
	// 게이지 활용하실 때 select 값(매개변수) 불러오시면 됩니다. (getSelect)
	public void select(Scanner scan) {
		int selectNum1 = -1;
		int selectNum = scan.nextInt();
		if(!(selectNum==1||selectNum==2)) {
			do {
				System.out.println("답변을 선택하라.");
				selectNum1 = scan.nextInt();
			}while(!(selectNum1==1||selectNum1==2));
		}else if(selectNum==1) {
			select = true;
			return;
		}else if(selectNum==2) {
			select = false;
			return;
		}
	}
	
	public boolean isContain() {
		if(select==true) {
			return true;
		}else 
		return false;
	}
	
	
	
	
	
	/* 1. 프롤로그
	 * 당신의 이름은 무엇인가? - 이름 입력
	 * 그대가 젊은 왕인가? - 그렇다만 / 그렇진않
	 * 그럼, 내게서 왕위를 뺏어가 나를 이 지하감옥에 가두고, 영원히 나오지 못하게 한게 네놈이로군? - 그렇다 / 아니다..
	 * 어찌되었든, 앞으로는 네가 모든것을 책임져야 할거다. 있는 힘을 다하는게 좋을 걸. 이 놈이고 저 놈이고, 다 얼빠진 놈들 뿐이니까. - 누구이야기지? / 무슨이야기지?
	 * 오래 살고싶다면, 4개의 세력의 균형을 잘 유지해서, 잘 꾸려나가도록 해라. - 알겠다 / 아니된다 
	 * 망령은 왕을 말끄러미 보고는 사라졌다. 왕은 알현실로 들어갔다. */
	public void prologue(Scanner scan) {
		int next = 0;
		while(true) {
			if(next==0) {
				System.out.println("그대가 젊은 왕인가?");
				System.out.println(" [1. 그렇다만]  "+"|"+"  [2.그렇진않다] ");
				select(scan);
				next++;
			}else if(next==1) {
				System.out.println("그럼, 내게서 왕위를 뺏어가 나를 이 지하감옥에 가두고, 영원히 나오지 못하게 한게 네놈이로군?");
				System.out.println(" [1. 그렇다]  "+"|"+"  [2.아니다] ");
				select(scan);
				next++;
			}else if(next==2) {
				System.out.println("어찌되었든, 앞으로는 네가 모든것을 책임져야 할거다. 있는 힘을 다하는게 좋을 걸. 이 놈이고 저 놈이고, 다 얼빠진 놈들 뿐이니까.");
				System.out.println(" [1. 누구이야기지?]  "+"|"+"  [2.무슨이야기지?] ");
				select(scan);
				next++;
			}else if(next==3) {
				System.out.println("오래 살고싶다면, 4개의 세력의 균형을 잘 유지해서, 잘 꾸려나가도록 해라.");
				System.out.println(" [1. 알겠다]  "+"|"+"  [2.아니하겠다] ");
				select(scan);
				next++;
			}else if(next==4) {
				System.out.println("망령은 왕을 말끄러미 보고는 사라졌다. 왕은 알현실로 들어갔다.");
				return;
			}
		}
	}
	
	// getter/setter
	public String getKingName() {
		return kingName;
	}

	public void setKingName(String kingName) {
		this.kingName = kingName;
	}
	
	public boolean isSelect() {
		return select;
	}

public void setSelect(boolean select) {
		this.select = select;
	}

	//toString
	@Override
	public String toString() {
		return "나의 이름은 " + kingName+"왕";
	}

}
