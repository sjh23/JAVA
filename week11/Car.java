package week11;

public class Car {
	//필요한 속성(부품) - 필드
	//필드가 클래스 변수 => 필드의 다형성
	//String name;
	public Tire tire;
	
	public void run() {
		tire.roll();
	}
}
