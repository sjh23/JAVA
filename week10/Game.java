package week10;

public class Game {
	private String title;
	private double varsion;
	
	public Game(String title, double varsion){
		this.title = title;
		this.varsion = varsion;
	}

	public String getTitle() {
		return title;
	}
	
	public double getVarsion() {
		return varsion;
	}
		
	public void start() {
		System.out.println("제목 : " + title);
		System.out.println("버전 : " + varsion);
		System.out.printf("%s게임을 시작합니다\n", title);
	}
}


