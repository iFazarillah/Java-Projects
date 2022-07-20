package interactive_EduGame;

public class GameUser {

	private Game game;

	public GameUser(Game game) {
		this.game = game;
	}

	void startEduGame() {
		this.game.gameStart();
	}

}
