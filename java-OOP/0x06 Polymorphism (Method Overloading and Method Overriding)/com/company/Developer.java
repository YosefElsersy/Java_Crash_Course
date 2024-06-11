package com.company;


public class Developer extends Employee{
    String projectName;

    public static void print(Object message){
        System.out.println(message);
    }
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
