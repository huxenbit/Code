import java.util.Scanner;

public class Zahlenraten {
	static int numInp = 0;
	static int numToGuess = 0;
	static boolean keepGoing = true;
	static int tries = 5;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		numToGuess = (int) (Math.random() * 10);
		System.out.println("");
		System.out.println("######################################");
		System.out.println("######                          ######");
		System.out.println("######  Willkommen beim Raten!  ######");
		System.out.println("######                          ######");
		System.out.println("######################################");
			
		while (keepGoing && tries > 0) {
			System.out.println("");
			System.out.println("Gib deine Zahl ein: ");
			numInp = scanner.nextInt();
			System.out.println("");
			
			if (numInp == numToGuess) {
				System.out.println("Die zu erratene Zahl war: " + numToGuess);
				System.out.println("Du hast sie erraten! :)");
				keepGoing = false;
			} else {	
				tries = tries - 1;
				if (numInp < numToGuess) {
					System.out.println("Du hast sie nicht erraten. :(");
					System.out.println("Die Zahl ist größer als " + numInp);
					System.out.println("Restliche Versuche: " + tries);					
				}
				else if (numInp > numToGuess) {
					System.out.println("Du hast sie nicht erraten. :(");
					System.out.println("Die Zahl ist kleiner als " + numInp);
					System.out.println("Restliche Versuche: " + tries);		
				}
			}
		} return;	
	}
}