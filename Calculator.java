import java.util.Scanner;

class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("##Willkommen beim Calculator!##");
		System.out.print("Bitte gib die erste Zahl ein: ");
		double x = scanner.nextDouble();
		
		System.out.print("Gib deine zweite Zahl ein: ");
		double y = scanner.nextDouble();
		
		System.out.print("Nun gib den Operator ein(+, -, *, /): ");
		char operator = scanner.next().charAt(0);
		
		double ergebnis;
		
		
		switch (operator) {
		case '+': ergebnis = x + y; break;
		case '-': ergebnis = x - y; break;
		case '*': ergebnis = x * y; break;
		case '/': 
			if (y != 0) {
				ergebnis = x / y; break;
			} else {
				System.out.print("Kann nicht durch 0 dividieren!"); return;
			}
		default: System.out.print("Fehler!"); return;
		}
		
		System.out.println("Das Ergebnis ist %.2f!\n" + ergebnis + "!");
		System.out.println("");
		scanner.close();
	}
}