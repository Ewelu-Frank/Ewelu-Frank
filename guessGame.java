import java.util.Scanner;
public class Guess {
	public static void main(String[] args) {
	    System.out.println("Let's play a game of guessing the numbers.");
	    System.out.println("Guess the number between 1 and 100.");
	    System.out.println("You have 5 tries to get the correct number and win.");
	    System.out.println("The game starts now!");
	    System.out.println("Enter your guess:");

	    Scanner scanner = new Scanner(System.in);

	    final int randomNumber = (int)((Math.random() * 100) + 1);

	    for (int i = 5; i > 0; i--) {
	        int guess = scanner.nextInt();

	        if (guess != randomNumber) {

	            // Wrong guess and remaining tries
	            if (i - 1 > 0) {
	                System.out.println("Wrong number. You have " + (i - 1) + " tries left.");
	            } else {
	                System.out.println("💀 Game Over! The correct number was: " + randomNumber);
	            }

	            // Give hint
	            if (guess > randomNumber) {
	                System.out.println("Your guess is greater than the random number.");
	            } else {
	                System.out.println("Your guess is less than the random number.");
	            }

	        } else {
	            System.out.println("🎉 Congratulations! You have won the game!");
	            break;
	        }
	    }

	    scanner.close();
	}
}
