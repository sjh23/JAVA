package week12;

public class VolumeEx {
	public static void main(String[] args) {
		//익명 구현 객체
		//구현 클래스 선언없이 바로 구현객체를 생성
		//인터페이스 변수 = new 인터페이스() {  ...  };
		Volume vol = new Volume() {

			@Override
			public void volumeUp(int level) {
				System.out.println("익명객체 볼륨을 올립니다 : " + level);
			}

			@Override
			public void volumeDown(int level) {
				System.out.println("익명객체 볼륨을 내립니다 : " + level);
			}
			
		};
		
		vol.volumeUp(5);
		vol.volumeDown(3);
		
		Volume vol2 = new Volume() {
			
			@Override
			public void volumeUp(int level) {
				
			}
			
			@Override
			public void volumeDown(int level) {
				
			}
		};
	}
}
