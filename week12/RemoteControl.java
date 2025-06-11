package week12;

public interface RemoteControl {
	//인터페이스 선언
	//필드 선언 => 상수필드(public static final)
	//반드시 초기화가 필요
	int MAX_VALUE = 10;
	int MIN_VALUE = 0;
	
	
	//모든 구현객체에서 사용하는 기능(메소드)을 모아 놓은 것
	//인터페이스에서 구현된 메소드는 실행문이 없는 추상 메소드
	//public abstract 를 생략해도 컴파일 과정에서 자동으로 생성
	
	void turnOn();
	
	//기능 추가 => 추상 메소드 => 구현 클래스에서 반드시 재정의
	void turnOff();
	void setVolume(int volume);
	
	//새로운 기능이 추가
	//default 메소드로 선언 => 기존 구현 클래스에는 영향을 주지 않는다
	//default 메소드는 반드시 실행문을 포함해야함
	//접근제한자 default 와는 다름
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무은 처리합니다.");
			setVolume(MIN_VALUE);
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 매소드 선언
	//구현 객체가 없어도 인터페이스 이름으로 호출이 가능한 메소드
	static void changeBattery() {
		//실행문이 포함되어야 함
		System.out.println("리모컨 건전지를 교환 합니다.");
	}
	
}



