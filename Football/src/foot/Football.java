package foot;

import java.util.Scanner;

public class Football {

	public static void main(String[] args) {
		input();
	}

	public static void input() {

		Scanner input = new Scanner(System.in);

		System.out.println("Number of Passing Attempts?");
		double ATT = input.nextDouble();

		System.out.println("Number of Completion?");
		double COMP = input.nextDouble();

		System.out.println("Passing Yards?");
		double YDS = input.nextDouble();

		System.out.println("Number of Touchdowns?");
		double TD = input.nextDouble();

		System.out.println("Number of Interception?");
		double INT = input.nextDouble();

		double PasserRating = prate(ATT, COMP, YDS, TD, INT);

	}

	public static double prate(double ATT, double COMP, double YDS, double TD, double INT) {
		double PasserRating = (((((COMP / ATT) - 0.3) * 5) + (((YDS / ATT) - 3) * .25) + ((TD / ATT) * 20)
				+ (2.375 - ((INT / ATT) * 25))) / 6) * 100;
		System.out.printf("%3.1f", PasserRating);
		return PasserRating;

	}
}
