import java.util.*;

public class NullReferenceTestDrive {
  
    public static void main(String[] args) {
      
      //Aufgabe 3.1
      Dog dog1 = null; //dog1 points to "nothing" -> no errors!
      System.out.println("Dog Referenz: " + dog1);
      
      //Aufgabe 3.2
      Dog dog2 = new Dog(); //dog2 points to a specific dog object
      System.out.println("Dog Referenz: " + dog2);
      
  }
}