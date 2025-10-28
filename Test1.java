import java.util.Scanner;

class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean startAgain = true;

        while (startAgain) {
            System.out.println("Willkommen!");
            System.out.print("Gib eine positive oder negative ganze Zahl ein: ");
            int zahl = scanner.nextInt();

            System.out.print(zahl + ", bist du sicher? J/N: ");
            char antwort = scanner.next().charAt(0);

            if (antwort == 'J' || antwort == 'j') {
                // Zahl auswerten
                if (zahl > 100) {
                    System.out.println("Die Zahl ist größer als 100!");
                } else if (zahl > 0) {
                    System.out.println("Deine Zahl ist positiv.");
                } else if (zahl < 0) {
                    System.out.println("Deine Zahl ist negativ.");
                } else {
                    System.out.println("Deine Zahl ist 0.");
                }

                // Nachfragen, ob nochmal
                System.out.print("Nochmal? J/N: ");
                antwort = scanner.next().charAt(0);
                startAgain = (antwort == 'J' || antwort == 'j');

            } else if (antwort == 'N' || antwort == 'n') {
                startAgain = false;
                System.out.println("Okay, Programm wird beendet.");
            } else {
                System.out.println("Ungültige Antwort!");
                // bleibt in der Schleife → wiederholen
            }
        }

        scanner.close();
    }
}
