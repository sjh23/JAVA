package week13;

public class MyThreadEx {
	public static void main(String[] args) throws InterruptedException {
		//작업 스레드 생성 및 실행
		for (int i=1; i <= 100; i++	) {
			MyThread thread = new MyThread(i);
			thread.start();
			thread.join();
		}
	}
}
