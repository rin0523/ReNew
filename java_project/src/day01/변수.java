package day01;

public class 변수 {

	public static void main(String[] args) {
		/* 변수 선언
		 * 자료형(타입) 변수명:
		 * 
		 * 변수 선언+초기화
		 * 자료형(타입)변수명 = 값;
		 * */
		int num=123; //선언+초기화
        System.out.println(num);
        
        //system.out.println=> sysout+ctrl+space
        System.out.println();//줄바꿈
        
       // int num=456; // 중복선언 불가능
        
        num=456;//= 대입연산자 앞의 변수에 뒤에 있는 값을 저장(덮어쓰기)
        System.out.println(num);
        
        int num1=78, num2=45, num3=89; // 같은 자료형에서는 가능
        
        num1=789; 
        System.out.println(num1);
        
        //8개의 기본 자료형은 지역변수 범위(scope) {   }
        
        //명령어 {} 
        int a=0;
        if (true) {
        	a = 10; 
        	System.out.println(a);
        }
       System.out.println(a); 
       
       //한글자만 저장 가능 char ch =''; 
       char ch = 'a'; //"a"는 에러임 //""=>문자열(String) /''=>한글자(char)
       double dou=3.0;
       byte b=1;
       boolean boo=true; //true, false 로만 저장가능
       
       // float/ long 자료형은 접미사를 반드시 붙여야 인식됨. 
       // float(f F) long (l L) (소문자 대문자 상관없음. L은 주로 대문자 사용)
       float f= 1.2f; 
       long l = 1L;
       
       num2= 010; // 8진수로 인식 (0~7까지 8=> 10) 
       num3= 0x10;//16진수 인식(0~15(ABCEDF)까지 16=>10)
       
       // + - * / % (나머지) 
       
       //국어점수(kor). 영어점수(eng). 수학점수(math)의 변수를 선언하고,
       //값을 입력하여, 세 점수의 합을 콘솔에 출력
       
       int kor= 50;
       int eng= 50;
       int math=50;
       int sum =kor+eng+math;
       System.out.println("국어, 영어, 수학점수 합계: " +sum); //+ 연결연산자
       System.out.println("합계:"+ (kor+eng+math)); 
       
       
      
       
       
       
    		   
       
      
        }
        
	}


