package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //in means input
		System.out.println("What is your starting amount? ");
		double startAmount = in.nextDouble();
		System.out.println("What is the win probability? ");
		double winChance = in.nextDouble();
		System.out.println("What is your win limit? ");
		double winLimit = in.nextDouble();
		System.out.println("Number of days you'll simulate: ");
		int totalSimulations = in.nextInt();
		double money = startAmount;
		double expectedRuin;
		int day = 0;
		int rounds = 0;
		boolean outcome = false;
		int wins = 0;
		int losses = 0;
		// conditions to prepare 
		for (day = 0; day < totalSimulations; day++){
			while (money < winLimit && 0 < money) {
				rounds++;
				if (Math.random() <= winChance) {
					money++;
				}
				else {
					money--;
				}
				System.out.println("Round " + rounds + ": " + money);
			}
			if (money == winLimit){
				System.out.println("You won!");
				wins++;
			}
			else {
				System.out.println("You lost </3");
				losses++;
			}

	}
	
	double a = ((1 - winChance) / (winChance));
		
			if (winChance == 0.5){
				expectedRuin = 1 - (startAmount / winLimit);
				
			}
			else {
				expectedRuin = ((Math.pow(a, startAmount) - Math.pow(a, winLimit)) / (1 - Math.pow(a, winLimit)));
				// Math.pow(base, exponent)
				}
			double ruinRate = (losses) / (wins + losses);
			System.out.println("Ruin Rate from Simulation: " + ruinRate);
			System.out.println("Expected Ruin Rate: " + expectedRuin);

}
}
