package week10;

public class GameEx {
	public static void main(String[] args) {
		LOL lol = new LOL("롤", 13.0); 
		Tetris tetris = new Tetris("테트리스", 12.5);
		SuperMario mario = new SuperMario("슈퍼마리오", 15.1);
		
		lol.start();
		lol.lolDesc();
		System.out.println();
		
		tetris.start();
		tetris.tetrisDesc();
		System.out.println();
		
		mario.start();
		mario.marioDesc();
	}
}
