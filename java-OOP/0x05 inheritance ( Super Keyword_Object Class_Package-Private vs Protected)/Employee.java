public class Employee{
   protected String name;
   protected String emailAddress;
   protected String phone;
   protected String department;
   protected String address;
    int yearOfBirth;
 
    public static void print(Object message){
        System.out.println(message);
    }

    public Employee(){
        print("No Parameter Constructor");
    }
    
    public Employee(String name, String emailAddress, String phone, String department ,String address, int yearOfBirth){
        this.name = name;
        this.emailAddress = emailAddress;
        this.phone = phone;
        this.department = department;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return phone;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public class Developer extends Employee{
        String projectName;

        public Developer(String name, String emailAddress, String phone, String department ,String address, int yearOfBirth , String projectName){
            super(name,emailAddress,phone,department,address,yearOfBirth);
            this.projectName = projectName;
        }

        public void setProjectName(String projectName){
            this.projectName = projectName;
        }

        public String getProjectName(){
            return projectName;
        }

    }



    public static void main(String[] args){

        Employee employee = new Employee("Yossef","YossefElsersy@gmail.com","+201122344546","IT","Egypt",2003);
        // Employee.Developer d1 = employee.new Developer("Yossef","YossefElsersy@gmail.com","+201122344546","IT","Egypt","2003","ERP");


    
        print(employee.hashCode());
        print(employee.toString());


    }


}