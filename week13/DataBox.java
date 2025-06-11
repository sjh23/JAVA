package week13;

public class DataBox {
	//공유 객체를 위한 클래스
	private String data;

	public synchronized String getData() throws InterruptedException {
		// 소비자가 data 를 읽는 메소드
		// 읽을 데이터가 있는 경우에만 읽어야 함
		// 데이터가 있는지 없는지 확인
		if (this.data == null) {
			//데이터가 없는 경우 => 읽으변 안됨 => 기다려야함
			wait();
		}
		
		// 데이터가 있는 경우 => 읽으면 됨
		String returnVal = data;
		System.out.println("Consumer Thread가 읽은 데이터 : " + returnVal);
		
		// 소비자가 데이터를 읽고 나면 data 를 비워주기
		data = null;
		
		// 소비자가 데이터를 읽는 동안 생산자는 wait()
		// 생산자가 데이터를 쓸 수 있도록 깨우기 => notify()
		notify();
		
		return data;
	}

	public synchronized void setData(String data) throws InterruptedException {
		// 생산자가 data 를 쓰는 메소드
		// DataBox에 data 가 없어야만 쓸 수 있다.
		// 데이터가 있는지 없는지 확인
		if (this.data != null) {
			//데이터가 있는 경우 => 데이터를 쓰면 안됨 => 기다려야함
			wait();
		}
		
		//데이터가 없는 경우 => 쓰기 가능
		this.data = data;
		System.out.println("Prodecer Thread가 생성한 데이터 : " + data);
		
		//생산자기 데이터를 쓰는 동안, 소비자는 wait()
		//소비자가 데이터를 읽을 수 있도록 깨워야 함 => notify()
		notify();
	}
	
	
}
