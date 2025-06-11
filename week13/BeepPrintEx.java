package week13;

public class BeepPrintEx {
	public static void main(String[] args) throws InterruptedException {
		//'삐~' 소리를 출력하는 작업
		for (int i = 0; i < 5; i++) {
			System.out.println("삐~");
			//Thread 의 시간은 밀리초 1000밀리초 = 1초
			Thread.sleep(1000);
		}
		
		//'****' 출력하는 작업
		for (int i = 0; i<5; i++) {
			System.out.println("***");
			Thread.sleep(1000);
		}
	}
}
