package week13;

public class RamenEx {
	public static void main(String[] args) {
		//작업 스레드 생성 및 실행
		RamenCooker guest1 = new RamenCooker("홍길동");
		guest1.start();
		
		RamenCooker guest2 = new RamenCooker("이순신");
		guest2.start();
		
		RamenCooker guest3 = new RamenCooker("강감찬");
		guest3.start();
	}
}
