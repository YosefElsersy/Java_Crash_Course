
public class Method {
public static void main(String[] args) {
    myMethod("Yossef",20);    
    sum(1,3);
}
}
static void myMethod(String fname , int age){
    // System.out.println("I have been executed!");
    System.out.println(fname + "is" + age);
}


static int sum(int x , int y){
    return x + y;
}

static float sum(float x , float y){ // Method Overloading
    return x+y;
}