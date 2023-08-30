package day10;

public class Class03 {

	public static void main(String[] args) {
		//tv 전원 on/off 
		//power
		//채널 up/down 
		//볼륨 
		

		TV t = new TV ("삼성" );
		t.ispowerOn();
		t.channelUp();
		t.channelDown();
		t.channelDown();
		t.channelDown();
		t.channelUp();
		t.channelUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volDown();
		t.volDown();
		t.volDown();
		t.isPower();
		
		
	}

}


class TV{
	//멤버변수 선언 
	/* 멤버변수 : name, power, channel, vol
	 * 메서드 : 전원, 채널up/down, vol up/down
	 * */
	private String name; //null
	private boolean power; //false
	private int vol; //0
	private int channel;//0
	
	
	//생성자
	
	public TV () {}
	
	public TV(String name) {
		this.name=name;
		
	}
		//메서드
		
		public void ispowerOn(){
			if (!power) {
			power=true;
			System.out.println("전원이 켜졌습니다");
		} else {
			power=false;
			System.out.println("전원이 꺼졌습니다.");
			}
		}
		
		//channel 상태
		public void channelUp() {
			channel++;
				System.out.println("현재 채널: " + channel);
			}	public void channelDown() {
				if (channel ==0 ) {
					channel =100;
				}else 
			channel--;
			System.out.println("현재채널: " + channel);
			}
		
		

		public void volUp() {
			//maxVol ==10;
			if (vol==10) {
				System.out.println("더이상 올릴 수 없습니다.");
			}
			vol++;
			System.out.println("현재 볼륨: "+ vol);
		}
		public void volDown() {
			vol--;
			System.out.println("현재볼륨 : " + vol);
		}

		
		//getter/setter
		
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public boolean isPower() {
			return power;
		}

		public void setPower(boolean power) {
			this.power = power;
		}

		public int getVol() {
			return vol;
		}

		public void setVol(int vol) {
			this.vol = vol;
		}

		public int getChannel() {
			return channel;
		}

		public void setChannel(int channel) {
			this.channel = channel;
		}
}
		


	



		
		




	



