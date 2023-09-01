package day11;


public class EzencomputerMain {

	public static void main(String[] args) {
		
		Ezen e= new Ezen("홍길동:  ", " 990101 ",24, "010-1111-1111", "인천");
		
		
		e.EzenStudent();
	     

		
		
		System.out.println("----------------------------");
		
	
		e.EzenAcademy();
	
		e.EzenCourse("java", "6개월");
		 
			System.out.println("----------------------------");
		 
			
	Ezen e2= new Ezen("김영이:  ", " 990101 ",24, "010-1111-1111", "인천");
	e2.EzenCourse("html", "2개월");
	e2.EzenCourse("java", "6개월");
	e2.EzenStudent();
		
			
		/* 학생클래스를 담을 수 있는 배열을 생성 후
		 * 5명의 학생을 등록
		 * 홍길동, 김영이, 유재석, 박명수, 노홍철
		 * */
					
	
	Ezen[]stu = new Ezen[7];
		stu[0]= new	Ezen("길동", "990101", 25, "2222", "인천");
		stu[1]= new	Ezen("영이", "990101", 25, "2222", "서울");
		stu[2]= new	Ezen("재석", "990101", 25, "2222", "서울");
		stu[3]= new	Ezen("명수", "990101", 25, "2222", "서울");
		stu[4]= new	Ezen("홍철", "990101", 25, "2222", "인천");
		stu[5]= e2;
		stu[6]=e;
		stu[0].EzenCourse("DB", "1개월");
		stu[1].EzenCourse("html","2개월");
		stu[1].EzenCourse("java", "6개월");

	
		System.out.println("----------------------------");
		
		
		/* 학생 이름으로 검색 => 모든정보 출력
		 *지점정보로 검색 => 학생정보만 출력
		 *+)과목을 수강하는 학생만 검색 =>학생정보, 수강정보 출력
		 * */
			
		
		
		
		
	/*	String searchName = "홍길동";
		for(int i=0; i<stu.length; i++) {
			if (stu[i].getName().equals(searchName)) {
			e.EzenAcademy();
			}
         
		}*/
		
		String searchName="홍길동";
		System.out.println(searchName=" 님의 정보------");
		for (int i=0; i<stu.length; i ++) {
			if(stu[i].getName().equals(searchName)) {
				stu[i].EzenAcademy();
				stu[i].Ezen();
				stu[i].EzenStudent();
				cnt++;
			
			}
		}  if(cnt==0) {
			System.out.println("검색 이름이 없습니다.");       
			}
		
		System.out.println("--------------------");
		
		
		String searchBranch="인천";
		System.out.println(searchBranch+ "지점의 학생정보 출력------" );
		//향상된 for문은 완성된 배열에서만 사용가능. set은 불가능 (get만 가능)
		for(Ezen ez : stu) {
			if (e.getBranch().equals(searchBranch)) {
				e.EzenStudent();
			}
		
		}
		
		System.out.println("--------------------");
		
		String searchCourse="java";
		System.out.println(searchCourse+ "과목의 수강기록--------");
		for(Ezen ez : stu) {
			for (int i=0; i<e.getCnt(); i++) {
				if (e.getCourse()[i].equals(searchCourse)) {
					e.EzenStudent();
					System.out.println("----------------");

				}
			}
		}
	
			
				
			}


			
			
			
			
			
			
			
			
	
	
		
		
		
		
		
			
	}

	
