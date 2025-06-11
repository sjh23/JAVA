package week12;

public class Audio implements RemoteControl {
	//구현 클래스
	private int volume;
	private int memoryVol;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("현재 Audio 볼륨 : " + volume);
	}
	
	//일반적으로 무음처리 현재 볼륨을 저장
	//무음 해제할 때 원래 볼륨으로 복원
	
	@Override
	public void setMute(boolean mute) {
		if (mute) {
			System.out.println("Audio 무음 처리...");
			this.memoryVol = this.volume;
			setVolume(MIN_VALUE);
		}else {
			System.out.println("Audio 무음 해제~");
			setVolume(memoryVol);
		}
	}
}
