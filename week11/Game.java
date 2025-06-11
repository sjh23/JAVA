package week11;

public abstract class Game {
	private String title;
	private String version;
	
	public Game(String title, String version) {
		this.title = title;
		this.version = version;
	}
	
	//모든 자식 객체(게임)에서 필요한 메소드
	public void start() {
		System.out.println("제목 : " + title);
		System.out.println("버전 : " + version);
		System.out.println(title + "게임을 시작합니다");
	}
	
	//게임에 대한 설명이 필요
	//각각의 게임마다 설명의 내용이 다르다.
	public abstract void GameDesc();
}
