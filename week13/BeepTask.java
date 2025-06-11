package week13;

public class BeepTask implements Runnable {
	//Runnable 인터페이스를 구현하는 클래스
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("삐~");
			//Thread 의 시간은 밀리초 1000밀리초 = 1초
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
	
}
