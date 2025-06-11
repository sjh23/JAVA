package week13;

public class BeepThreadEx {
	public static void main(String[] args) throws InterruptedException {
		//main 에소드 => main 스레드
		
		//작업 스레드 생성 및 실행
		BeepThread thread = new BeepThread();
		thread.start();
		
		//main 에서 하는 작업
		for (int i = 0; i<5; i++) {
			System.out.println("***");
			Thread.sleep(1000);
		}
	}
}
