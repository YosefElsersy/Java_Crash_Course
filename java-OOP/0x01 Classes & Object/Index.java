public class Index {

    public static void print(Object message){
        System.out.println(message);
    }

    public class Circle{
        private double radius;
        private String color;

        public void setRadius(double r){
            radius =r ;
        }
        public double getRadius(){
            return radius;
        }
        public void setColor(String c){
            color = c;
        }
        public String getColor(){
            return color;
        }

        public double getArea(){
            return Math.PI * radius * radius;
        }
        public double getCircumference(){
            return Math.PI * radius * 2;
        }
        public String toString(){
            return "Circle {" + "Radius = " + radius + ", color = " + color + "}";
        }
    }
    public static void main(String args[]){
        Index index = new Index();
        Index.Circle c1 = index.new Circle();
        Index.Circle c2 = index.new Circle();

            c1.setRadius(3.0);
            c1.setColor("Black");
            print(c1.getArea());
            print(c1.getCircumference());
            print(c1.toString());

            c2.setRadius(2.0);
            c2.setColor("Blue");
            print(c2.getCircumference());
            print(c2.getArea());
            print(c2.toString());
            
            

    }
}