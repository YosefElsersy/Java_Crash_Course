import java.util.Scanner;
public class Voting {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Age");
        int ReadAge = sc.nextInt();
        int votingAge = 25;
    if (ReadAge >votingAge) {
        System.out.println("Old Enough to vote");
    }else{
        System.out.println("Not Old Enough to vote");
    }
    sc.close();
}
}
