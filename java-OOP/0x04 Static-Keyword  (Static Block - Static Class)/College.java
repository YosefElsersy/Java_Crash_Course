public class College{ //Outer Class  | UnAllowed To Use Static on it

    public class Student{
        private int no; 
        private String name;
        private String password;
        private boolean loggedIn;
        private static int count = 1;
        private static String college = "IT";
        private static int minimalPasswordLength = 6;
    
        Student(String name , String pass){
            this.no = count;
            this.name = name;
            this.password = pass;
            count++;
        }
        public boolean logIn(int enteredNo, String enteredPassword){
            if (enteredNo == no  && enteredPassword.equals(password)) {
                loggedIn = true;
                return true;
            }else{
                return false;
            }
        }
        
        public static boolean validatePassword(String password){
            if (password.length() >= minimalPasswordLength) {
                return true;
            }else{
                return false;
            }
        }
    
        public String toString(){
            return "Student{ " + "no = " + no + ", name = " + name + "}";
        } 
    }
    public static void print(Object message){
        System.out.println(message);
    }
    
    // static block 
    static int x; // u must to add static to this variable
    static int a;
    static{
        x = 5;
        a = 10;
        print("Static block");
    }
    static{
        x = 15;
        print("Static block");
    }
    public static void main(String[] args){
        // College m = new College();
        //  c.x = 10; 
        x = 10;
  
        
        College college = new College();
        College.Student s1 = college.new Student("Shefoo","123");
        College.Student s2 = college.new Student("Yossef","253");
        College.Student s3 = college.new Student("Mostafa","568");
        
        print(s1.logIn(1,"123"));
        print(s2.logIn(2,"253"));
        print(s3.logIn(3,"568"));
    
    }
    }