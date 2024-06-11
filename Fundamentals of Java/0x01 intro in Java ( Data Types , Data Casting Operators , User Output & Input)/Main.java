import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    String name = "Yosef";
    System.out.println(name);

    int myNum1 = 15;
    System.out.println(myNum1);
    final int myNum2 = 15;
    // myNum2 = 20; // will generate an error
    System.out.println(myNum2);

    //Type Casting 

    //Widing Casting
    int num = 10;
    double myDoubled = num; //Automatic casting: int to double
    
    System.out.println(num);
    System.out.println(myDoubled);
    //Narrowing Casting
    double myDouble2 = 9.78d;
    int myInt2 = (int) myDouble2; //Manual Casting : double to int

    System.out.println(myDouble2);
    System.out.println(myInt2);

    int votingAge = 20;
    // int personAge = 25;
    System.out.println("PLease Enter Your Age: ");

    Scanner scReadAge = new Scanner(System.in); //Create a Scanner Object
    int personAge = scReadAge.nextInt();    // Read User input

    System.out.println(personAge >= votingAge);

    scReadAge.close();


}

}
