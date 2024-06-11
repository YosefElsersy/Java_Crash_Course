public class Test {
    

public static void print(Object message){
    System.out.println(message);
}

public class Car{
    private String name;
    private int model;
    private double price;
    private int maxSpeed;

    public void setName(String n){
        name =n;
    }
    public String getName(){
        return name;
    }
    public void setModel(int m){
        if (model >= 2014) {
            model =m;
        }else{
            print("Sorry, We Don't Accept this models");
        }
    }
    public int getModel(){
        return model;
    }
    public void setPrice(double p){
        price = p;
    }
    public double getPrice(){
        return price;
    }
    public void setMaxSpeed(int s){
        maxSpeed = s;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }

}
public static void main(String[] args){
    Test test = new Test();
    Test.Car c = test.new Car();
    c.setModel(2016);
    print(c.getModel());
}
}
