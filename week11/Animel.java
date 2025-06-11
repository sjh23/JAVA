package week11;

public abstract class Animel {
	//추상클래스 => 객체 생성 불가
	//상속은 가능
	public String Kind;
	
	//모든 동물에 동일하게 적용
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//모든 동물은 소리를 낸다.
	//모든 동물느 모두 다른 소리르 낸다.
	//자식클래스에서 반드시 재정의 해야 함.
	//추상메소드 => 실행문이 없음, 메소드 형태만 선언
	public abstract void sound();
}
