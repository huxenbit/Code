import java.util.Scanner;

class Calculator {
	
	double inputA;
	double inputB;
	char operator;
	char tryAgain;
	boolean validInput = false;
	
	void setInput() {
		
		Scanner scanner = new Scanner(System.in);
		
		while (!validInput) {
			System.out.print("Enter first number A = ");
			String input = scanner.next();
			
			try {
				inputA = Double.parseDouble(input);
				validInput = true;
			} 
			catch (NumberFormatException e) {
				System.out.println("Please enter a valid number!");
			}
		}
		
		validInput = false;
		
		while (!validInput) {
			System.out.print("Enter second number B = ");
			String input = scanner.next();
			
			try {
				inputB = Double.parseDouble(input);
				validInput = true;
			}
			catch (NumberFormatException e) {
				System.out.println("Please enter a valid number!");
			}
			
		}
		
		validInput = false;
		
		System.out.print("Enter operator(+, -, /, *): ");
		operator = scanner.next().charAt(0);
		
		if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
			getInput();
		}
		else {
			System.out.println("Error! False operator.");
			setInput();
		}
	}
	
	void getInput() {
		
		System.out.println("You entered: " + inputA + operator + inputB + "\n" + "calculating...");
		calculate();
	}
	
	void calculate() {
		
		double result;
		
		switch (operator) {
			case '+':
				result = inputA + inputB;
				System.out.println("Result: " + result);
				restart();
				break;
			
			case '-':
				result = inputA - inputB;
				System.out.println("Result: " + result);
				restart();
				break;
			
			case '*':
				result = inputA * inputB;
				System.out.println("Result: " + result);
				restart();
				break;
			
			case '/':
				if (inputB != 0) {
					result = inputA / inputB;
					System.out.println("Result: " + result);
					restart();
					break;
				}
				else {
					System.out.println("Division by 0 impossible! Restarting...");
					setInput();
					break;
				}
				
			default:
				System.out.println("Error! Restarting...");
				setInput();
				break;
		}
	}
	
	void restart() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Do you want to calculate again? Y/N: ");
		tryAgain = scanner.next().charAt(0);
		tryAgain = Character.toLowerCase(tryAgain);
		
		if (tryAgain == 'y') {
			setInput();
		}
		else if (tryAgain == 'n') {
			System.out.println("Goodbye!");
		}
		else {
			System.out.println("Wrong input...\n");
			restart();
		}
		
	}
}