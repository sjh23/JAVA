package week11;

public class Tetris extends Game {

	public Tetris(String title, String version) {
		super(title, version);
	}

	@Override
	public void GameDesc() {
		System.out.println("테트리스는 퍼즐 게임으로 소련의 개발자가 처음 디자인한 게임이다.");
	}

}
