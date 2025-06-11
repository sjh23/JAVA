package week13;

public class CalcEx {
	public static void main(String[] args) {
		//계산기 공유 객체 생성
		Calculator calc = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalc(calc);		//user1 : 100
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalc(calc);		//calc : 공유 객체가 됨
		user2.start();				//user2 : 50
	}
}
