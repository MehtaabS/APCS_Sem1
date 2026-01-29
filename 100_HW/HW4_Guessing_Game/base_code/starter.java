import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("The goal of the game is to guess a word with two hints!");

		double x = Math.random();

		if (x < 0.33) {
			System.out.println("It's a fruit!");
			System.out.print("What is your guess? ");
			String guess = sc.nextLine();
			if (guess.equals("apple") || guess.equals("Apple")) {
				System.out.println("You got it! Woo!");
			} else {
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println("It can be red, green, or yellow!");
				guess = sc.nextLine();
				if (guess.equals("apple") || guess.equals("Apple")) {
					System.out.println("You got it! Woo!");
				} else {
					System.out.println("The answer was apple, better luck next time!");
				}
			}

		} else if (x < 0.66) {
			System.out.println("It's a furry animal!");
			System.out.print("What is your guess? ");
			String guess = sc.nextLine();
			if (guess.equals("cat") || guess.equals("Cat")) {
				System.out.println("You got it! Woo!");
			} else {
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println("It's a feline friend!");
				guess = sc.nextLine();
				if (guess.equals("cat") || guess.equals("Cat")) {
					System.out.println("You got it! Woo!");
				} else {
					System.out.println("The answer was cat, better luck next time!");
				}
			}

		} else {
			System.out.println("It's a planet in our solar system!");
			System.out.print("What is your guess? ");
			String guess = sc.nextLine();
			if (guess.equals("Earth") || guess.equals("earth")) {
				System.out.println("You got it! Woo!");
			} else {
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println("It's the only one with humans on it!");
				guess = sc.nextLine();
				if (guess.equals("Earth") || guess.equals("earth")) {
					System.out.println("You got it! Woo!");
				} else {
					System.out.println("The answer was Earth, better luck next time!");
				}
			}
		}
	}
}
