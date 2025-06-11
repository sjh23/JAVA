package week12;

public class SmartPhone {
	//필드로 선언 할떄 필요한 이어폰을 인터페이스 변수 선언
	EarPhone earPhone;
	
	public void musicOn(EarPhone ep) {
		ep.play();
	}
	
	public void musicOff(EarPhone ep) {
		ep.stop();
	}
}
