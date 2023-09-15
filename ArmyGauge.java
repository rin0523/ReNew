package Project;

import java.util.Scanner;

public class ArmyGauge {
	
	
	

	private String gaugeName = " Army";
	private int gauge= 50;
	private int random;
	
	

	Army army = new Army();
	King king= new King();
	
	
	public int random() {
		int random= (int)(Math.random()*40)+31;
		return random;
	}
	
	
	
	public void changeGauge(Scanner scan) {
		int random= random();
		switch(random) {
		
		case 31: 
			army.event31();
			king.select(scan);
			if(king.isContain(random)) {
				gauge= gauge -20;
			}else {
				gauge= gauge+10;
			}
			
		case 32: 
			army.event32();
			king.select(scan);
			if(king.isContain(random)) {
				gauge= gauge +20;
			}else {
				gauge= gauge-10;
			}
		case 33: 
			army.event33();
			king.select(scan);
			if(king.isContain(random)) {
				gauge= gauge +20;
			}else {
				gauge= gauge -30;
			}
		case 34: 
			army.event34();
			king.select(scan);
			if(king.isContain(random)) {
				gauge= gauge +30;
			}else {
				gauge= gauge-10;
			}
		case 35: 
			army.event35();
			king.select(scan);
			if(king.isContain(random)) {
				gauge= gauge +20;
			}else {
				gauge= gauge+10;
			}
		case 36: 
			army.event36();
			king.select(scan);
			if(king.isContain(random)) {
				gauge= gauge -30;
			}else {
				gauge= gauge+10;
			}
		case 37: 
			army.event37();
			king.select(scan);
			if(king.isContain(random)) {
				gauge= gauge +20;
			}else {
				gauge= gauge-10;
			}
		case 38: 
			army.event38();
			king.select(scan);
			if(king.isContain(random)) {
				gauge= gauge +20;
			}else {
				gauge= gauge-30;
			}
		case 39: 
			army.event39();
			king.select(scan);
			if(king.isContain(random)) {
				gauge= gauge +10;
			}else {
				gauge= gauge-30;
			}
		case 40: 
			army.event40();
			king.select(scan);
			if(king.isContain(random)) {
				gauge= gauge +20;
			}else {
				gauge= gauge-20;
			}
		}
			
		}
			
			public void ending() {
				if(gauge<=0) {
					
					System.out.println("====================================");
					System.out.println(" 침략군이 성문까지 왔습니다!!!");
					System.out.println(" 우리에게는 이미 저들을 막을 만할 힘이 없습니다!!!! ");
					System.out.println("end...");
					System.out.println("====================================");
			
			
		}if(gauge>100) {
			System.out.println("====================================");
			System.out.println(" 쿠테타가 일어났습니다 !!!!! ");
			System.out.println(" 전권을 제게 넘기십시오! ");
			System.out.println("end...");
			System.out.println("====================================");
			
		}
	}


	
	

	
	



}
