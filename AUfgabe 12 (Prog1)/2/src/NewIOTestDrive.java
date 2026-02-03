import java.util.Scanner;

public class NewIOTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NewInput niTest = new NewInput();
        NewOutput noTest = new NewOutput();

        noTest.readDateFromFile(scanner);
        niTest.getDateInput(scanner);
    }
}
