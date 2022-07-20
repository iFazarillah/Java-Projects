package interactive_EduGame;

public class Main {

	public static void main(String[] args) {
		Game egSession = new EduGame();

		GameUser session = new GameUser(egSession);

		while (true) {
			session.startEduGame();
		}

	}

}
