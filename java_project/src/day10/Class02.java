package day10;

public class Class02 {

	public static void main(String[] args) {
		/* 자동차 클래스 생성
		 * 멤버변수 : name , year, color, power, speed
		 * 메서드: 전원(on/off) , 스피드 (up/down)
		 * getter / setter 필요
		 * 생성자
		 * 
		 * */
		
		Car c= new Car("스파크", "2013", "회색");
		c.powerOn();
		//c.powerOff();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.powerOff();
		
		
		
		
	
		
	
	
	}

}



class Car{
	//멤버변수 선언
	private String name;
	private String year;
	private String color;
	private boolean power;
	private int speed;
	
	//생성자
	public Car() {}// 기본생성자
	public Car(String name, String year, String color) {
		this.name=name;
		this.year=year;
		this.color=color;
		
		
	}
	
	//메서드
	public void powerOn() {
		power = true;
		System.out.println("전원이 켜졌습니다.");
	}
	public void powerOff() {
		if (speed==0) {
			power=false;
			System.out.println("전원이 꺼졌습니다.");
		}else {System.out.println("속도를 줄여주세요.");
		}
		
	}
	
	public void speedUp() {
		if (power) {
			speed=speed+10;
			System.out.println("현재 속도: " + speed);
		}else speed=speed-10;
		System.out.println("시동부터 켜주세요.");
		
	}
	public void speedDown() {
		if(speed==0) {
			System.out.println("더이상 속도를 줄일 수 없습니다");
		}
		System.out.println("현재 속도: "+ speed);
	}
	
	
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
 
	
	
}