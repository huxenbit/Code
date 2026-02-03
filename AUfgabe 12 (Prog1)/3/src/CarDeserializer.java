import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CarDeserializer {
    String fileName;
    ArrayList<Car> cars = new ArrayList<>();

    // method to deserialize objects and put it into an array-list
    public void deserializeCar(Scanner scanner) {
        System.out.println();
        System.out.print("Enter file name to deserialize from: ");
        fileName = scanner.nextLine().trim().toLowerCase();

        try (FileInputStream fileInput = new FileInputStream(fileName);
             ObjectInputStream objectInput = new ObjectInputStream(fileInput)) {

            // adding every object until "END OF FILE exception"
            while (true) {
                try {
                    Car car = (Car) objectInput.readObject(); // casting read object to a Car
                    cars.add(car);
                } catch (EOFException e) {
                    break; // stop deserializing at end of file
                }
            }

            //printInfo() on every deserialized object in array list
            for (Car car : cars) {
                car.printInfo();
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + fileName);
        } catch (ClassNotFoundException e) {
            System.err.println("Could not resolve objects in file: " + fileName);
        }
    }
}
