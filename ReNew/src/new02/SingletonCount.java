package new02;

import java.util.Calendar;

class Counter {
	// 싱글톤 객체로 생성

	private static Counter instance;
	private int count;

	// 생성자를 통한 객체 생성을 막기 위해 생성자를 private 설정
	private Counter() {}
	
	public static Counter getinstance() {
		if(instance==null) {
			instance= new Counter();
		}
		return instance;
	}

	public int countMethod() {
		count++;
		return count;
	}
}

public class SingletonCount {

	public static void main(String[] args) {
		//counter 객체 두개 생성 
		Counter c1= Counter.getinstance();
		Counter c2= Counter.getinstance();
		System.out.println(c1.countMethod()); //1
		System.out.println(c2.countMethod()); //2 
		System.out.println(c1.countMethod()); //3
		System.out.println(c1.countMethod()); //4
		System.out.println(c2.countMethod()); //5
		
		Calendar c= Calendar.getInstance();
		int year= c.get(Calendar.YEAR);
		System.out.println(year);

	}

}
