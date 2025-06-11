package week13;

public class ProducerThread extends Thread {
	private DataBox dataBox;
	
	public ProducerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}
	
	//생산자 스레드가 처리할 작업을 run() 메소드에서 기술
	//데이터 쓰기만 진행	
	@Override
	public void run() {
		for (int i=1; i<=3; i++) {
			String data = "Data-" + i;
			try {
				dataBox.setData(data);
			} catch (InterruptedException e) { }
		}
	}
}
