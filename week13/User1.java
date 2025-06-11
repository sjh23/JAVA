package week13;

public class User1 extends Thread {
	Calculator calc;
	
	public void setCalc(Calculator calc) {
		this.calc = calc;
		//스레드 이음 변경
		setName("User1");
		
	}
	
	//작업 스레드에서 실행할 내용 선언 => run() 재정의
	@Override
	public void run() {
		try {
			calc.setMemory(100);
		} catch (InterruptedException e) { }
	}
}
