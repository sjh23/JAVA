package week13;

public class ProdConsEx {
	public static void main(String[] args) {
		//DataBox 객체 생성
		DataBox dataBox = new DataBox();
		
		ProducerThread prod = new ProducerThread(dataBox);
		ConsumerThread cons = new ConsumerThread(dataBox);
		
		prod.start();
		cons.start();
		
		//생산자 소비자 문제할떄는 이 알고리즘 이용
	}
}
