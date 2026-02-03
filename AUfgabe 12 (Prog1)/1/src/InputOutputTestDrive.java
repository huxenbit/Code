import java.util.Scanner;

public class InputOutputTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputDate iTest = new InputDate();
        OutputDate oTest = new OutputDate();

        iTest.getDateInput(scanner);
        oTest.readDateFromFile(scanner);
    }
}
