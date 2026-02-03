import java.util.Scanner;

public class CarSerializeTestDrive {
    public static void main(String[] args) {
        CarSerializer carS = new CarSerializer();
        Scanner scanner = new Scanner(System.in);

        carS.serializeObject(scanner);

        scanner.close();
    }

}
