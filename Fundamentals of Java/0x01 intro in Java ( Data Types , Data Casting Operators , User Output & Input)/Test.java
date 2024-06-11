import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        
        // String Input
        System.out.println("Please Enter Your Name\n");
        String name = myObj.nextLine();
        // Numerical Input
        System.out.println("Please Enter Your Age\n");
        int age = myObj.nextInt();
        System.out.println("Please Enter Your Salary\n");
        double salary = myObj.nextDouble();

        System.out.println("==================\n");
        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("==================");

        // Close the Scanner object to release resources
        myObj.close();
    }
}
