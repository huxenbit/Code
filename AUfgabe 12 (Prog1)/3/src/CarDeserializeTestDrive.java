import java.util.Scanner;

public class CarDeserializeTestDrive {
    public static void main(String[] args) {
        CarDeserializer carDS = new CarDeserializer();
        Scanner scanner = new Scanner(System.in);

        carDS.deserializeCar(scanner);

        scanner.close();
    }

}
