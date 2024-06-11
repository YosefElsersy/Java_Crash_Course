public class Ternary {
public static void main(String[] args) {
    
    int time = 20;

    if (time < 18) {
        System.out.println("Good Days");
    }else{
        System.out.println("Good Evening");
    }
      //Variable   //Condition  //ExpressionTrue //ExpressionFalse
    String result = (time < 18) ? "Good Days" : "Good Evening";  //Ternary Operator 
    

}
}