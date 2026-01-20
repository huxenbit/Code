import java.util.*;

public class PrimitiveReferenceTestDrive {
  
  
    public static void main(String[] args) {
      
      //Aufgabe 2.1
      int num1 = 123;
      Dog dog1 = new Dog();
      
      //Aufgabe 2.2.1
      dog1.size = 4;
      dog1.breed = "Corgi";
      dog1.name = "Griselda";
      Dog dog2 = dog1;
      
      dog1.name = "Gundula"; //Wirkt sich auch auf dog2 aus!
      dog1.bark();
      dog2.bark();
      
      //Aufgabe 2.2.2
      num1 = 3;
      int num2 = num1;
      num1 = 103; //Wirkt sich NICHT auf num2 aus!
      System.out.println(num1 + " " + num2);
  }
}