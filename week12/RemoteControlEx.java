package week12;

public class RemoteControlEx {
	public static void main(String[] args) {
		//구현 클래스를 이용해서 구현객체 생성
		Audio audio = new Audio();
		TV tv = new TV();
		
		//생성된 구현객체를 이용해서 메소드 호출
		audio.turnOn();
		audio.setVolume(5);
		audio.setMute(true);
		audio.setMute(false);
		audio.turnOff();
		
		System.out.println("---");
		
		tv.turnOn();
		tv.setVolume(15);
		tv.setMute(true);
		tv.setMute(false);
		tv.turnOff();
		System.out.println("---");
		
		//인터페이스 다중 구현객체
		SmartTV smart = new SmartTV();
		smart.turnOn();
		smart.setVolume(5);
		smart.search("네이버");
		smart.setMute(true);
		smart.setMute(false);
		smart.turnOff();
		
		
		System.out.println("---");
		System.out.println("리모컨의 최대 볼륨 : " + RemoteControl.MAX_VALUE);
		System.out.println("리모컨의 최소 볼륨 : " + RemoteControl.MIN_VALUE);
		System.out.println("---");
		
		RemoteControl.changeBattery();
		
		System.out.println("\n-- 인터페이스의 다형성 --\n");
		//인터페이스 변수 <= 구현객체
		RemoteControl[] rc = new RemoteControl[3];
		rc[0] = audio;
		rc[2] = tv;
		rc[2] = smart;
	
		for(RemoteControl r : rc) {
			r.turnOn();
			r.setVolume(3);
			r.setMute(true);
			r.setMute(false);
			r.turnOff();
			System.out.println("---\n");
		}
	}
}
