import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class CarSerializer {
    private String fileName;
    private ArrayList<Car> cars = new ArrayList<>();

    // method to serialize a serializable object
    public void serializeObject(Scanner scanner) {
        System.out.println();
        System.out.print("Enter file name to serialize to: ");
        fileName = scanner.nextLine().trim().toLowerCase().replace(" ", "_") + ".ser";

        try (FileOutputStream fileOutput = new FileOutputStream(fileName);
             ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {

            createCars();

            // serialize every car in cars-array list into given file
            for (Car car : cars) {
                objectOutput.writeObject(car);
            }
            System.out.println("Objects successfully serialized into file: " + fileName);

        } catch (IOException e) {
            System.err.println("Unable to serialize objects into file!" + " " + e.getMessage());
        }
    }

    // helper method for creating generic cars
    public void createCars() {
        //create car objects
        Car car1 = new Car("Lambo", "Murcielago");
        cars.add(car1);
        Car car2 = new Car("Nissan", "Skyline");
        cars.add(car2);

        ElectricCar electricCar1 = new ElectricCar("Tesla", "Cybertruck");
        cars.add(electricCar1);
        ElectricCar electricCar2 = new ElectricCar("Ferrari", "911");
        cars.add(electricCar2);
    }
}