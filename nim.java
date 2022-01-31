package homework3;
import java.util.*;
import java.util.Random;

public class nim {
	public static int largest(int x) {
		int amount = x/2;
		return amount;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("*deep Jigsaw voice* Let's play a game.");
		System.out.println("Pick how many marbles you would like to play with. You can only choose between 10 and 100, so choose wisely.");
		int count = s.nextInt(); 
		if(count >= 10 && count <= 100) {
			System.out.println("We shall now play with " + count + " marbles in the pool.");
		}
		else {
			System.out.println("One more error and it will be the end of you.");
		}
		while(true) {
			System.out.println("Pick the number of marbles you want to take away.");
			System.out.println("You can only pick a max of " + largest(count) + " marbles.");
			while(true) {
				int input = s.nextInt();
				if(input <= largest(count)) {
					int currentmarb = count - input;
					if(currentmarb == 1) {
						System.out.println("You've escaped me... this time.");
						System.exit(0); 
					}
					System.out.println("You have removed " + input + " marbles from the pool.");
					System.out.println("Now, there are " + currentmarb + " marbles left in the pool.");
					count = currentmarb;
					break;
				}
			}
			Random r = new Random(); 
			int compturn = r.nextInt(largest(count)) + 1; 
			System.out.println("I will now remove " + compturn + " marbles from the pool.");
			int currentmarb = count - compturn;
			if(currentmarb == 1) {
				System.out.println("Game over. This mistake will be your last.");
				System.exit(0); 
			}
			else {
				System.out.println("There are now " + currentmarb + " marbles in the pool.");
				count = currentmarb;
			}
			
		}
	
	
	}
	

}


