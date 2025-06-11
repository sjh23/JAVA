package week13;

public class ConsumerThread extends Thread {
	private DataBox dataBox;
	
	public ConsumerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}
	
	//소비자 스레드가 처리할 작업을 run() 메소드에서 기술
	//데이터 읽기만 진행
	@Override
	public void run() {
		for (int i=1; i<=3; i++) {
			try {
				String data = dataBox.getData();
			} catch (InterruptedException e) {}
		}
	}
}
