package interactive_EduGame;

import java.util.Scanner;

public class EduGame implements Game {

	private String userName;
	private int age;
	private String favShapeGame;
	private String favCountGame;
	private String selection;
	private Boolean isUserLoggedIn;
	Scanner scanner = new Scanner(System.in);
	private int num1;
	private int num2;
	private int answer;
	private int userAnswer;
	private String figure;
	private String figures;
	private String currentGame;
	private String c1 = "Addition Game";
	private String c2 = "Substraction Game";
	private String c3 = "Multiplication Game";
	private String c4 = "Division Game";
	private String s1 = "Square Game";
	private String s2 = "Triangle Game";
	private String s3 = "Rhombus Game";

	public EduGame() {
		isUserLoggedIn = false;
	}

//	used to navigate between menus and options

	@Override
	public void switchSelection() {
		System.out.print("Select > ");
		this.selection = scanner.nextLine();
		if (this.selection.equalsIgnoreCase("1")) {
			mainMenu();
		} else if (this.selection.equalsIgnoreCase("2")) {
			userProfile();
		} else if (this.selection.equalsIgnoreCase("*")) {
			logIn();
		} else if (this.selection.equalsIgnoreCase("#")) {
			logOut();
		} else if (this.selection.equalsIgnoreCase("0")) {
			System.exit(0);
		} else if (this.selection.equalsIgnoreCase("c")) {
			menuCounting();
		} else if (this.selection.equalsIgnoreCase("s")) {
			menuShapes();
		} else if (this.selection.equalsIgnoreCase("c1")) {
			additionGame();
		} else if (this.selection.equalsIgnoreCase("c2")) {
			subtractionGame();
		} else if (this.selection.equalsIgnoreCase("c3")) {
			multiplicationGame();
		} else if (this.selection.equalsIgnoreCase("c4")) {
			divisionGame();
		} else if (this.selection.equalsIgnoreCase("s1")) {
			squareGame();
		} else if (this.selection.equalsIgnoreCase("s2")) {
			triangleGame();
		} else if (this.selection.equalsIgnoreCase("s3")) {
			rhombusGame();
		} else if (this.selection.equalsIgnoreCase("f")) {
			addAsFav(currentGame);
		} else if (this.selection.equalsIgnoreCase("R")) {
			calculator();

		} else {
			System.out.println("\n================Error================\n");
			System.out.println("Wrong input! please input one of the number shows");
			System.out.println("\n================Error================\n");
			mainMenu();
		}

	}

//	to alert user login needed to access main games (Counting & Shapes games)
	public void alertLogin(String cg) {
		System.out.println("\n================EduGame================\n");
		System.out.printf("I'm sorry you can't access %s\n", currentGame);
		System.out.println("You need to log in first to play the game");
		System.out.println("\n\n----------------------------------------");
		System.out.println("[*] Log In");
		System.out.println("[1] Main Menu");
		switchSelection();

	}

//	to start the game
	@Override
	public void gameStart() {
		// TODO Auto-generated method stub
		System.out.println("\n================EduGame================\n");
		System.out.println("Hello, welcome to interactive EduGame!");
		System.out.println("You need to log in to play the game:");
		System.out.println("\n\n----------------------------------------");
		System.out.println("[1] Main Menu");
		System.out.println("[*] Log in");
		System.out.println("[#] Log out");
		System.out.println("[0] Close EduGame");
		switchSelection();

	}

//	main menu
	@Override
	public void mainMenu() {
		// TODO Auto-generated method stub
		System.out.println("\n================EduGame================\n");
		if (isUserLoggedIn) {
			System.out.printf("Hello %s, What do you want to play today? \n", userName);
		} else {
			System.out.println("Hello, let's choose~");
		}
		System.out.println("\n\n----------------------------------------");
		System.out.println("[C] Let's Counting!");
		System.out.println("[S] Let's Shapes!");
		System.out.println("[R] Calculator");
		System.out.println("[2] Profile");
		System.out.println("[*] Log In");
		System.out.println("[#] Log Out");
		System.out.println("[0] Close");
		switchSelection();

	}

//	Login menu
	@Override
	public void logIn() {
		// TODO Auto-generated method stub
		System.out.println("\n================EduGame================\n");
		if (isUserLoggedIn) {
			System.out.printf("You're already logged in as %s \n", userName);
			System.out.println("Please log out first to change user");
			System.out.println("\n\n----------------------------------------");
			System.out.println("[1] Main menu");
			System.out.println("[#] Log Out");
			System.out.println("[0] Close");
			switchSelection();

		} else {
			System.out.println("Input your data to login\n");
			System.out.print("Name : ");
			this.userName = scanner.nextLine();
			System.out.print("Age : ");
			this.age = scanner.nextInt();
			scanner.nextLine();
			this.isUserLoggedIn = true;

			System.out.printf("\n========== Let's start %s! ==========\n\n", userName);

			try { // iseng wkwk
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("error yo");
			}

			mainMenu();
		}

	}

//	logout menu
	@Override
	public void logOut() {
		// TODO Auto-generated method stub
		System.out.println("\n================EduGame================\n");
		if (isUserLoggedIn) {
			isUserLoggedIn = false;
			System.out.printf("Let's learn more next time, %s \n", userName);
			System.out.println("\t\t See you~");
			System.out.println("\n\n----------------------------------------");
			System.out.println("[1] Main menu");
			System.out.println("[0] Close EduGame");
			switchSelection();

		} else {
			System.out.println("You have not logged in to any user");
			System.out.println("\n\n----------------------------------------");
			System.out.println("[1] Main menu");
			System.out.println("[*] Log In");
			System.out.println("[0] Close EduGame");
			switchSelection();

		}

	}

//	User profile 
	@Override
	public void userProfile() {
		// TODO Auto-generated method stub
		System.out.println("\n================EduGame================\n");
		if (isUserLoggedIn) {
			System.out.printf("Name\t\t\t: %s\n", userName);
			System.out.printf("Age\t\t\t: %d years old\n", age);
			System.out.printf("Favorite Counting Game\t: %s \n", favCountGame);
			System.out.printf("Favorite Shape Game\t: %s \n", favShapeGame);
			System.out.println("\n\n----------------------------------------");
			System.out.println("[1] Main menu");
			System.out.println("[*] Log In");
			System.out.println("[#] Log Out");
			System.out.println("[0] Close");
			switchSelection();
		} else {
			System.out.println("You need to Log In to see your profile");
			System.out.println("\n\n----------------------------------------");
			System.out.println("[1] Main menu");
			System.out.println("[*] Log In");
			System.out.println("[#] Log Out");
			System.out.println("[0] Close");
			switchSelection();

		}

	}

//	Menu for counting games
	public void menuCounting() {
		System.out.println("\n================EduGame================\n");
		System.out.println("we'll learn how to count! \nWe will learn it in fun way, \nso let's choose~");
		System.out.println("\n\n----------------------------------------");
		System.out.println("[C1] Addition Game");
		System.out.println("[C2] Subtraction Game");
		System.out.println("[C3] Multiplication Game");
		System.out.println("[C4] Division Game");
		switchSelection();

	}

//	to add a game as user's favorite
	public void addAsFav(String fav) {
		System.out.println("\n================EduGame================\n");
		if (fav.equals(c1)) {
			this.favCountGame = c1;
		} else if (fav.equals(c2)) {
			this.favCountGame = c2;
		} else if (fav.equals(c3)) {
			this.favCountGame = c3;
		} else if (fav.equals(c4)) {
			this.favCountGame = c4;
		} else if (fav.equals(s1)) {
			this.favShapeGame = s1;
		} else if (fav.equals(s2)) {
			this.favShapeGame = s2;
		} else if (fav.equals(s3)) {
			this.favShapeGame = s3;
		}
		System.out.printf("You've add %s as your favourite\n", favCountGame);
		System.out.println("\n\n----------------------------------------");
		System.out.println("[1] Main Menu");
		System.out.println("[2] Profile");
		switchSelection();

	}

//	add game
	public void additionGame() {
		currentGame = c1;

		System.out.println("\n================EduGame================\n");
		if (isUserLoggedIn) {

			System.out.println("to play this game input two numbers you'd like\n");
			System.out.print("1st Number: ");
			this.num1 = scanner.nextInt();
			scanner.nextLine();
			System.out.print("2nd number :");
			this.num2 = scanner.nextInt();
			scanner.nextLine();
			System.out.println("\n\n----------------------------------------");
			System.out.printf("Ok %s now let's imagine!\n", userName);

			figure = "\uC6C3";
			figures = "";
			if (num1 == 0) {
				System.out.println("\nthere's no one at first at the park");
				System.out.println(",,,,,,,,,,,,,,,,,,,,");
			} else if (num1 == 1) {
				System.out.println("there's 1 kid at the park");
				System.out.printf(",,,,,%s,,,,\n", figure);
			} else {
				System.out.printf("there are %d kids at the park\n", num1);
				for (int i = 0; i < num1; i++) {
					figures += figure;
				}
				System.out.printf(",,,%s,,,\n", figures);
			}

			figure = "\uC6C3";
			figures = "";
			if (num2 == 0) {
				System.out.println("Then until evening no one coming to the park");
			} else if (num2 == 1) {
				System.out.println("then you come to the park");
				System.out.println("You and the other kids having fun together");
				System.out.printf(",,,%s,,,\n", (figure));
			} else {
				System.out.printf("then %d kids come to the park\n", num2);
				for (int i = 0; i < num2; i++) {
					figures += figure;
				}
				System.out.printf(",,,%s,,,\n", figures);
			}
			System.out.println("can you count how many kids having fun at the park?");
			System.out.print("Answer >");
			userAnswer = scanner.nextInt();
			scanner.nextLine();
			answer = num1 + num2;

			System.out.printf("\n\toh, your answer is %d?\n", userAnswer);
			if (userAnswer == answer) {
				System.out.printf("\tThat's correct %s!\n", userName);
			} else {
				System.out.printf("\tAlmost there %s, but it's okay\n", userName);
			}
			System.out.printf("\tif you count the kids on display there are %d kids\n", answer);

			System.out.println("\nyou're doing good, what's next?");
			System.out.println("\n\n----------------------------------------");
			System.out.println("[C1] Try again!");
			System.out.println("[F ] Add this as your fav game!");
			System.out.println("[C ] Back to counting Menu ");
			System.out.println("[1 ] Main Menu");
			switchSelection();
		} else {
			alertLogin(currentGame);

		}

	}

//	subs game
	public void subtractionGame() {
		currentGame = c2;
		String addFigure = "\u2606\u5F61";

		System.out.println("\n================EduGame================\n");
		if (isUserLoggedIn) {

			System.out.println("to play this game input two numbers you'd like\n");
			System.out.println("make sure the first number is greater than second number");
			System.out.println("and no negative numbers used");
			System.out.print("1st Number: ");
			this.num1 = scanner.nextInt();
			scanner.nextLine();
			System.out.print("2nd number :");
			this.num2 = scanner.nextInt();
			scanner.nextLine();

			figure = "\u2605";
			figures = "";
			answer = num1 - num2;

			if (num1 > num2 && num1 == 1) {
				System.out.println("\n\n----------------------------------------");
				System.out.printf("Ok %s now let's imagine!\n", userName);
				System.out.println("there's 1 star in the sky");
				System.out.printf("'''%s'''\n", figure);
			} else if (num1 > num2 && num1 > 1) {
				System.out.println("\n\n----------------------------------------");
				System.out.printf("Ok %s now let's imagine!\n", userName);
				System.out.printf("There are %d stars in the sky\n", num1);
				for (int i = 0; i < num1; i++) {
					figures += figure;
				}
				System.out.printf(",,,%s,,,\n", figures);
			} else if (num1 == 0) {
				System.out.println("\n\n----------------------------------------");
				System.out.printf("Ok %s now let's imagine!\n", userName);
				System.out.println("There is no star in the sky");
				System.out.println("'''''''''''''''''");

			} else {
				System.out.printf("Sorry %s, there's an error\n", userName);
				System.out.println("please make sure :");
				System.out.println("<1> first number is greater than second number");
				System.out.println("<2> no negative numbers\n\n");

				System.out.println("let's try again");
				subtractionGame();

			}

			figure = "'\u2605'";
			figures = "";

			if (num2 == 0) {
				System.out.println("then there's no more stars appear or falling");
			} else if (num2 == 1) {
				System.out.println("then one star is falling");
			} else if (num2 > 1) {
				System.out.printf("then %d of the %d stars is falling\n", num2, num1);
			} else {
				System.out.printf("Sorry %s, there's an error\n", userName);
				System.out.println("please make sure :");
				System.out.println("<1> first number is greater than second number");
				System.out.println("<2> no negative numbers\n\n");

				System.out.println("let's try again");
				subtractionGame();
			}

			for (int i = 0; i < num1; i++) {
				if (i < num2) {
					figures += addFigure;
				} else {
					figures += figure;
				}
			}
			System.out.println(figures);
			System.out.println("\n\nnow count the stars left on the sky");
			System.out.print("answer>");
			userAnswer = scanner.nextInt();
			scanner.nextLine();
			answer = num1 + num2;

			System.out.printf("\n\toh, your answer is %d?\n", userAnswer);
			if (userAnswer == answer) {
				System.out.printf("\tThat's correct %s!\n", userName);
			} else {
				System.out.printf("\tAlmost there %s, but it's okay\n", userName);
			}
			System.out.printf("\tif you count the stars on display there are %d stars\n", answer);

			System.out.println("\nyou're doing good, what's next?");
			System.out.println("\n\n----------------------------------------");
			System.out.println("[C2] Try again!");
			System.out.println("[F ] Add this as your fav game!");
			System.out.println("[C ] Back to counting Menu ");
			System.out.println("[1 ] Main Menu");
			switchSelection();
		} else {
			alertLogin(currentGame);

		}

	}

//	multiplication game
	public void multiplicationGame() {
		currentGame = c3;

		System.out.println("\n================EduGame================\n");
		if (isUserLoggedIn) {
			System.out.println("to play this game input two numbers you'd like\n");
			System.out.println("and no negative numbers used");
			System.out.print("1st Number: ");
			this.num1 = scanner.nextInt();
			scanner.nextLine();
			System.out.print("2nd number :");
			this.num2 = scanner.nextInt();
			scanner.nextLine();
			System.out.println("\n\n----------------------------------------");
			System.out.printf("Ok %s now let's imagine!\n", userName);

			System.out.println("your class will be having a party this afternoon");
			if (num1 == 0) {
				System.out.println("You forgot you're supposed to bring cookies for your friend");
				System.out.println("so you have 0 cookie on your hand :( ");
			} else if (num1 > 0) {
				System.out.println("you want to make cookies to share with your friends!");
				System.out.printf("each friend will have %d cookies\n", num1);

			} else {
				System.out.printf("Sorry %s, there's an error\n", userName);
				System.out.println("please make sure :");
				System.out.println("<1> no negative numbers\n\n");

				System.out.println("let's try again");
				multiplicationGame();
			}

			if (num2 == 0 && num1 == 0) {
				System.out.println("oops! apparently the party is tomorrow! ");
				System.out.println("so no one coming to the class this afternoon");
				System.out.println("you're glad you didn't prepare any cookies");
			} else if (num2 == 0 && num1 > 0) {
				System.out.println("oops! apparently the party is tomorrow! ");
				System.out.println("so no one coming to the class this afternoon");
				System.out.printf("you've made cookies but since no one is coming you can't share any");

			} else if (num2 > 0 && num1 == 0) {
				System.out.printf("there will be %d friends coming\n", num2);
				System.out.println("but since you don't make any cookies");
				System.out.println("you can't share any cookies for your firend");

			} else if (num2 > 0 && num1 > 0) {
				System.out.printf("there will be %d friends coming\n", num2);
				System.out.printf("so you need to make %d cookies\u229b for %d friends\u263a\n", num1, num2);
				System.out.println("can you count how many cookies you need to make?");

				for (int i = 0; i < num2; i++) {
					for (int j = 0; j < num1; j++) {
						System.out.print("\u229b");
					}
					System.out.print(" \u263a\n");
				}

				figure = String.valueOf(num1);
				figures = figure;
				System.out.printf("or you can count it by adding %d up %d times\n", num1, num2);
				for (int i = 1; i < num2; i++) {
					figures += " + " + figure;
				}
				System.out.println(figures + " = ?");
			} else {
				System.out.printf("Sorry %s, there's an error\n", userName);
				System.out.println("please make sure :");
				System.out.println("<1> no negative numbers\n\n");

				System.out.println("let's try again");
				multiplicationGame();
			}

			System.out.println("so how many cookies you share?");
			System.out.print("answer: ");
			userAnswer = scanner.nextInt();
			scanner.nextLine();
			answer = num1 * num2;

			System.out.printf("\n\toh, your answer is %d?\n", userAnswer);
			if (userAnswer == answer) {
				System.out.printf("\tThat's correct %s!\n", userName);
			} else {
				System.out.printf("\tAlmost there %s, but it's okay\n", userName);
			}
			System.out.printf("\tif you count the cookies on display there are %d cookies\n", answer);

			System.out.println("\nyou're doing good, what's next?");
			System.out.println("\n\n----------------------------------------");
			System.out.println("[C3] Try again!");
			System.out.println("[F ] Add this as your fav game!");
			System.out.println("[C ] Back to counting Menu ");
			System.out.println("[1 ] Main Menu");
			switchSelection();

		} else {
			alertLogin(currentGame);
		}

	}

//	random numbers, used for division game 
	public void randomNumbers() {
		int RanNum1 = (int) (Math.random() * 50 + 1);
		int RanNum2 = (int) (Math.random() * 50 + 1);

		if (RanNum1 % RanNum2 == 0) {
			this.num1 = RanNum1;
			this.num2 = RanNum2;
		} else {
			randomNumbers();
		}

	}

//	division game
	public void divisionGame() {
		currentGame = c4;
		figure = "\uC6C3";

		System.out.println("\n================EduGame================\n");
		randomNumbers();
		if (isUserLoggedIn) {
			System.out.println("in this part you need to solved a problem given");
			System.out.println("read the story carefully and good luck!");
			System.out.println("\n\n----------------------------------------");
			System.out.printf("%s, you're in sunday camp\n", userName);
			System.out.println("and teacher asked you to make lines for your group");
			System.out.printf("there are %d kids including you\n", num1);
			System.out.printf("the teacher wants each line has %d kids\n", num2);
			System.out.println("how many lines will there be?\n");
			System.out.print("Answer > ");
			userAnswer = scanner.nextInt();
			scanner.nextLine();
			answer = num1 / num2;

			System.out.printf("\n\toh, your answer is %d?\n", userAnswer);
			if (userAnswer == answer) {
				System.out.printf("\tThat's correct %s!\n", userName);
				System.out.println("let's see here:");
				System.out.printf("when you divide %d kids into lines\n", num1);
				System.out.printf("and each lines has %d kids\n", num2);
				for (int i = 0; i < answer; i++) {
					for (int j = 0; j < num2; j++) {
						System.out.print(figure);
					}
					System.out.println("\n");
				}

			} else {
				System.out.printf("\tAlmost there %s, but it's okay\n", userName);

				System.out.println("let's see here:");
				System.out.printf("when you diveide %d kids into lines\n", num1);
				System.out.printf("and each lines has %d kids\n", num2);
				for (int i = 0; i < answer; i++) {
					for (int j = 0; j < num2; j++) {
						System.out.print(figure);
					}
					System.out.println("\n");
				}
			}
			System.out.printf("\tif you count the lines there are %d lines \n", answer);

			System.out.println("\nyou're doing good, what's next?");
			System.out.println("\n\n----------------------------------------");
			System.out.println("[C4] Try again!");
			System.out.println("[F ] Add this as your fav game!");
			System.out.println("[C ] Back to counting Menu ");
			System.out.println("[1 ] Main Menu");
			switchSelection();
		} else {
			alertLogin(c4);
		}

	}

//	menus for Shape Game
	public void menuShapes() {
		System.out.println("\n================EduGame================\n");
		System.out.println("We'll learn all about shapes here~\n now let's choose the game");
		System.out.println("\n\n----------------------------------------");
		System.out.println("[S1] Square Game");
		System.out.println("[S2] Triangle Game");
		System.out.println("[S3] Rhombus Game");
		switchSelection();

	}

//	Square game
	public void squareGame() {
		currentGame = s1;

		System.out.println("\n================EduGame================\n");
		if (isUserLoggedIn) {
			System.out.println("\t\t SQUARE");
			System.out.println(
					"a square is a regular quadrilateral, \nwhich means that it has four equal sides and four equal angles ");
			System.out.println("It can also be defined as a rectangle with two equal-length adjacent sides. ");
			System.out.println("\nDo you want to see how square looks?");
			System.out.println("first let's decide on the size");
			System.out.println("pick number that greater than 1");
			System.out.print("Answer >");
			userAnswer = scanner.nextInt();
			scanner.nextLine();

			for (int i = 0; i < userAnswer; i++) {
				for (int j = 0; j < userAnswer; j++) {
					System.out.print("* ");
				}
				System.out.println("");
			}

			System.out.println("Square characterization:");
			System.out.println("<1> All four internal angles of a square are equal");
			System.out.println("<2> The central angle of a square is equal to 90°");
			System.out.println("<3> The diagonals of a square are equal and bisect each other");
			System.out.println("\n what's next?");
			System.out.println("\n\n----------------------------------------");
			System.out.println("[S1] Try again!");
			System.out.println("[F ] Add this as your fav game!");
			System.out.println("[S ] Back to Shapes Menu ");
			System.out.println("[1 ] Main Menu");
			switchSelection();

		} else {
			alertLogin(currentGame);
		}

	}

//	Triangle game
	public void triangleGame() {
		currentGame = s2;
		System.out.println("\n================EduGame================\n");
		if (isUserLoggedIn) {
			System.out.println("\t\t TRIANGLE");
			System.out.println("A triangle is a polygon with three edges and three vertices.");
			System.out.println("there are various types of triangle");
			System.out.println("We will show you two of them~");
			System.out.println("first let's decide on the size");
			System.out.println("pick number that greater than 1");
			System.out.print("Answer >");
			userAnswer = scanner.nextInt();
			scanner.nextLine();

			System.out.println("\n\tAn equilateral triangle");

			for (int i = 0; i < userAnswer; i++) {
				for (int j = userAnswer - i; j > 1; j--) {
					System.out.print(" ");
				}
				for (int k = 0; k <= i; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			System.out.println("\n\t\tA right angle triangle");

			for (int i = 1; i < userAnswer; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			System.out.println("\n what's next?");
			System.out.println("\n\n----------------------------------------");
			System.out.println("[S2] Try again!");
			System.out.println("[F ] Add this as your fav game!");
			System.out.println("[S ] Back to Shapes Menu ");
			System.out.println("[1 ] Main Menu");
			switchSelection();

		} else {
			alertLogin(currentGame);
		}

	}

//	Rhombus game~
	public void rhombusGame() {
		currentGame = s3;
		System.out.println("\n================EduGame================\n");
		if (isUserLoggedIn) {
			System.out.println("/t/tRHOMBUS");
			System.out.println("A Rhombus is a flat shape with 4 equal straight sides.");
			System.out.println("A Rhombus looks like diamond");
			System.out.println("\nLet's see how Rhombus looks like~");
			System.out.println("first let's decide on the size");
			System.out.println("pick number that greater than 1");
			System.out.print("Answer >");
			userAnswer = scanner.nextInt();
			scanner.nextLine();

			for (int i = 0; i < userAnswer; i++) {
				for (int k = 1; k < userAnswer - i; k++) {
					System.out.print(" ");
				}
				for (int j = 0; j <= userAnswer; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}

//			rhombus 2nd 

			for (int i = 0; i < userAnswer; i++) {
				for (int j = 0; j < userAnswer - i - 1; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < 2 * i + 1; k++) {
					System.out.print("*");
				}
				System.out.println("");
			}

			for (int i = userAnswer - 1; i > 0; i--) {
				for (int j = userAnswer - 1; j >= i; j--) {
					System.out.print(" ");
				}
				for (int k = 2 * i - 1; k > 0; k--) {
					System.out.print("*");
				}
				System.out.println("");
			}

			System.out.println("Rhombus characterization:");
			System.out.println("<1> All sides have equal length");
			System.out
					.println("<2> Opposite sides are parallel, and opposite angles are equal (it is a Parallelogram).");
			System.out.println("Opposite sides are parallel, and opposite angles are equal (it is a Parallelogram).");

			System.out.println("\n what's next?");
			System.out.println("\n\n----------------------------------------");
			System.out.println("[S3] Try again!");
			System.out.println("[F ] Add this as your fav game!");
			System.out.println("[C ] Back to Shapes Menu ");
			System.out.println("[1 ] Main Menu");
			switchSelection();
		} else {
			alertLogin(currentGame);
		}

	}

//	Calculator

	public void calculator() {
		System.out.println("\n================EduGame================\n");
		String opt;
		Double number1;
		Double number2;
		Double result;

		System.out.println("\t\tCALCULATOR");
		System.out.print("Number 1 \t\t: ");
		number1 = scanner.nextDouble();
		scanner.nextLine();

		System.out.print("Opt Symbol (+ - * :) \t: ");
		opt = scanner.nextLine();

		System.out.print("Number 2 \t\t: ");
		number2 = scanner.nextDouble();
		scanner.nextLine();

		System.out.println("\n\t\t~calculator~\n\n");

		switch (opt) {
		case "+":
			result = number1 + number2;
			System.out.printf("\t%.0f + %.0f = %.0f", number1, number2, result);
			System.out.println("\n\n----------------------------------------");
			System.out.println("[R] Try again!");
			System.out.println("[1] Main Menu");
			switchSelection();
			break;
		case "-":
			result = number1 - number2;
			System.out.printf("\t%.0f - %.0f = %.0f", number1, number2, result);
			System.out.println("\n\n----------------------------------------");
			System.out.println("[R] Try again!");
			System.out.println("[1] Main Menu");
			switchSelection();
			break;
		case "*":
			result = number1 * number2;
			System.out.printf("\t%.0f * %.0f = %.0f", number1, number2, result);
			System.out.println("\n\n----------------------------------------");
			System.out.println("[R] Try again!");
			System.out.println("[1] Main Menu");
			switchSelection();
			break;
		case ":":
			result = number1 / number2;
			System.out.printf("\t%.0f : %.0f = %.1f", number1, number2, result);
			System.out.println("\n\n----------------------------------------");
			System.out.println("[R] Try again!");
			System.out.println("[1] Main Menu");
			switchSelection();
			break;
		default:
			System.out.println("\n================Error================\n");
			System.out.println("Wrong input! please input one of the number shows");
			System.out.println("\n================Error================\n");
			calculator();
			break;
		}

	}

}
