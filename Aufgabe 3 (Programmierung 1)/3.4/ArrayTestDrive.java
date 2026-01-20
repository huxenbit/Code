import java.util.*;

public class ArrayTestDrive {

  public static void main(String[] args) {
      
    //Aufgabe 4.1
    int[] nums = {1, 2, 3, 4, 5};
      
    //Check nums initially
    for (int i = 0; i < 5; i++) {
      System.out.println("nums[" + i + "]: " + nums[i]);
      if (i == 4) {
        System.out.print("\n");
      }
    }
      
    //Aufgabe 4.1.2
    Dog dog1 = new Dog();
    dog1.breed = "Rottweiler";
    Dog dog2 = new Dog();
    dog2.breed = "Chihuahua";
    Dog dog3 = new Dog();
    dog3.breed = "Beagle \n";
    Dog[] dogs = {dog1, dog2, dog3};
    
    //Check dogs array
    for (int i = 0; i < 3; i++) {
      System.out.println("dogs[" + i + "]: " + dogs[i].breed);
    }
      
      
    //Aufgabe 4.2
    int[] numsReference = nums;
    numsReference[2] = 9; //Wirkt sich auf nums aus!
      
    //Check nums(Reference) Array
    for (int i = 0; i < 5; i++) {
      System.out.println("nums[" + i + "]: " + nums[i]);
      System.out.println("numsReference[" + i + "]: " + numsReference[i] + "\n");
    }
      
    //Aufgabe 4.3
    Dog[] dogs2 = {dog1, dog2, dog3};
    dog1.name = "Enzo";
    dog2.name = "Lenny";
    dog3.name = "Loki";
      
    //Bark in loop
    for (int i = 0; i < 3; i++) {
      dogs2[i].bark();
    }
    
  }

}