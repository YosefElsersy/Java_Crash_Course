public class Program {

    public static void print(Object message){
        System.out.println(message);
    }
    public class Product{
        private String name;
        private String description;
        private float price;
        private int quantity;
        private float discount;
        private String color;

        public Product(){  //No-Arg Counstructor
            this.name = "No Name";
            this.description = "No description";
            this.price = 0.0f;
            this.quantity = 0;
            this.discount = 0;
        }
        public Product(Product obj){ // Copy Constructor
            this.name = obj.name;
            this.description = obj.description;
            this.price = obj.price;
            this.quantity = obj.quantity;
            this.discount = obj.discount;
            this.color = obj.color;
            // this (p1.name,p1.description,p1.price,p1.discount,p1.color);
        }

        public Product(String n,String d, float p, int q, float dis){  // Parameterized Counstructor
            this.name = n;
            this.description = d;
            this.price = p;
            this.quantity = q;
            this.discount = dis;
            // print("Constructor: 5");
        }
        public Product(String n,String d, float p, int q, float dis ,String c){  // To Add New Value in Constructor
            this (n,d,p,q,dis); // Constructor Chaining
            this.color = c;
            // print("Constructor: 6");
        }

        public Product(String n,String d, float p){
            this.name = n;
            this.description = d;
            this.price = p;
        }

        public void display(){
            print("=====================================");
            print("Name : " + name +"\n");
            print("Description : " + description + "\n");
            print("Price : " + price + "\n");
            print("Quantity : " + quantity + "\n");
            print("Discount : " + discount + "\n");
            print("Color : " + color + "\n");
            print("=====================================");
        }
        public void setName(String n){
            this.name = n;
        }
        public String getName(){
            return name;
        }
        public void setDes(String des){
            this.description = des;
        }
        public String getDes(){
            return description;
        }
        public void setPrice(float p){
            this.price = p;
        }
        public float getPrice(){
            return price;
        }
        public void setQuantity(int q){
            this.quantity = q;
        }
        public int getQuantity(){
            return quantity;
        }
        public void setDiscount(float dis){
            this.discount = dis;
        }
        public float getDiscount(){
            return discount;
        }
        public void setColor(String c){
            this.color = c;
        }
        public String getColor(){
            return color;
        }

    }
    public static void main(String[] args){

        Program program = new Program();
        Program.Product p1 = program.new Product("Camera" ,"Auto focus...",99,10,5,"Red");
        // Program.Product p2 = program.new Product("T-shirt","Size : XL",15);
        Program.Product p2 = program.new Product(p1);
        // p1.display();
        p2.display();

    }

}
