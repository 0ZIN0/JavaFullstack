package quiz.E;

import myobj2.RpsGame;

public class E05_SaveAns {
	
	public static void main(String[] args) {
		RpsGame game = new RpsGame();
		
		for (int i = 0; i < 1000; i++) {
			game.play(RpsGame.SCISSORS);
		}
		game.close();
	}
	
}
