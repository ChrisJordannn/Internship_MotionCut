import java.util.Random;
import java.util.Scanner;
public class Number_Guesser {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		int count=0;
		int random_no = r.nextInt(10)+1;//generates a random number from 0 to 49 and adds 1
		int guessed_no;
		System.out.println("**************************");
		System.out.println("NUMBER GUESSING GAME");
		System.out.println("**************************");
		do {
			System.out.println("Enter a number between 1 to 10, Let's check how lucky you are!!");
			guessed_no = s.nextInt();
			count++; 
			if(random_no == guessed_no) {
				System.out.println("Spot on!!, it was indeed "+guessed_no+ " :)");
				System.out.println("It took you "+count+" attempt(s) to guess the right number");
			}
			else if(guessed_no < random_no) {
				System.out.println("Oops that was too low!, Try a bit higher,  better luck next time :(");
			}
			else {
				System.out.println("Whoops that was way too high!, Try a bit lower, better luck next time :(");
			}
		}while(guessed_no != random_no);
	}

}
