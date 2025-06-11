package week13;

public class BeepThread extends Thread {
	@Override
	public void run() {
		//작업 스레드에서 수행할 명령문을 선언
		for (int i = 0; i < 5; i++) {
			System.out.println("삐~");
			//Thread 의 시간은 밀리초 1000밀리초 = 1초
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
		}
	}
}
