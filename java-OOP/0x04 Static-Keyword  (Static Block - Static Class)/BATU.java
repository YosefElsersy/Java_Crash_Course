public class BATU {
    
    public class Student{
        private int id ;
        private double gpa;
        private String name;
        private static  String universityName = "BATU";
        private static String universityAddress = "Burj-Alarab" ;

        public Student(){ //No-Arg Counstructor
            this.id = 0;
            this.name ="No Name";
        }
        public Student(int i,double g, String n){ // Parameterized Counstructor
            this.id =i;
            this.gpa = g;
            this.name = n;
        }
        public void setId(int i){
            this.id = i;
        }
        public int getId(){
            return this.id;
        }
        public void setGpa(double g){
            this.gpa = g;
        }
        public double getGpa(){
            return this.gpa;
        }
        public void setName(String n){
            this.name = n;
        }
        public String getName(){
            return this.name;
        }

        public void studentInfo(){
            print("=====================================");
            print("Id : " + id + "\n");
            print("Gpa : " + gpa + "\n");
            print("Name : " + name + "\n");
            print("University Name : " + universityName + "\n");
            print("University Address : " + universityAddress + "\n");
            print("=====================================");
        }
    }
    
    public static void universityInfo(){
        print("university Name : BATU \n");
        print("university Address : Burj-Alarab \n");
        print("university President : Mohamed Elgohary \n");
    }

    public static void print(Object message){
        System.out.println(message);
    }
    public static void main(String[] args){
        BATU batu = new BATU();
        BATU.Student s1 = batu.new Student(); // << 2220539,3.5,"Yosef" <<

        s1.setId(2220539);
        print(s1.getId());

        s1.setGpa(3.5);
        print(s1.getGpa());

        s1.setName("Yosef Hany Elsersy");
        print(s1.getName());

        universityInfo();

        s1.studentInfo();


    }
}
