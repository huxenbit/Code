import java.util.*;

public class Calculator2 {
  static double a, b, ergebnis;
  static char operator;
  static Boolean weiter = true;
  
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      while (weiter) {
        System.out.println("Willkommen beim Taschenrechner by Gian");
        System.out.print("Gib deine erste Zahl ein: ");
        a = scanner.nextDouble();
        
        System.out.print("Gib deine Zweite Zahl ein: ");
        b = scanner.nextDouble();
        
        System.out.print("Nun gib den Operator ein(+, -, *, /): ");
        operator = scanner.next().charAt(0);
        
        switch (operator) {
          case '+': ergebnis = a + b; break;
          case '-': ergebnis = a - b; break;
          case '*': ergebnis = a * b; break;
          case '/': if (b != 0) {
                      ergebnis = a / b;
                    } else {
                      System.out.print("Ungültig da division durch 0!");
                    }
                    break;
          default: System.out.print("Ungültig!");
        }
        
        System.out.println("Ergebnis: " + ergebnis);
        System.out.print("Nochmal? J/N: ");
        String antwort = scanner.next();
        antwort = antwort.toUpperCase();
        switch (antwort) {
          case "J": break;
          case "N": weiter = false; break;
        }
      }
    }
      
}