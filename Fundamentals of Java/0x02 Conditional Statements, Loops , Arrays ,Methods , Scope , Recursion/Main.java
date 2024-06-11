import java.util.Scanner;
public class Main {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int num1 ,num2,num3 ,largest,temp;
    System.out.println("Enter Num1: ");
    num1 = sc.nextInt();
    System.out.println("Enter Num2: ");
    num2 = sc.nextInt();
    System.out.println("Enter Num3: ");
    num3 = sc.nextInt();

    // if (num1 > num2 && num1 > num3) {
    //      System.out.println("The Largest Number is : " + num1);
    //     }else if(num2 > num1 && num2 > num3){
    //     System.out.println("The Largest Number is : " + num2);
    // }else if(num3 > num1 && num3 > num2){
    //     System.out.println("The Largest Number is : " + num3);
    // }else{
    //     System.out.println(" The Numbers Are The Same.");
    // }

    // //Comparing num1 and num2 and storing the largest number in a temp variable
    // temp=num1>num2?num1:num2;
    // //Comparing the temp variable with c and Storing and the result in the variable
    // largest=num3>temp?num3:temp;
    // System.out.println("The Largest Number is : " + largest);

    largest = num3 >(num1>num2?num1:num2)? num3:((num1>num2)?num1:num2);
    System.out.println("The Largest Number is : " + largest);
    sc.close();
}
}
