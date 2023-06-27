package basicCore;
import java.util.Scanner;
import java.util.Random;


public class GuessNumbGame {

	public static void main(String[] args) {
		// Guess the number game
		
		System.out.println("welcome to Guess");
		Scanner sc = new Scanner(System.in);
		Random rr = new Random();
		int a = rr.nextInt(100);
	//	System.out.print(a);
		for(int i=5; i>=0; i--) {
			System.out.println("Guess the Number :");
			int b = sc.nextInt();
		if(i==0) {
			System.out.println("sorry you loose");
			System.out.println("The number was "+a);
			break;
		
		}
		else {
			if(a!=b) {
				if(a>b) {
					System.out.println("The number is greater ");
					System.out.println("The remaining chances are : "+i);
				}
				else {
					System.out.println("The number is smaller");
					System.out.println("The remaining chances are : "+i);
				}
			}
			else {
				System.out.println("The guess is correct !!!");
			}
			
		}
		
		}

	}

}
