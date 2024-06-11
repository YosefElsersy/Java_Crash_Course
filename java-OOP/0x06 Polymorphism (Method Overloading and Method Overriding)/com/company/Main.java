package com.company;

public class Main {
        
    public static void print(Object message){
            System.out.println(message);
        }
    public static void main(String[] args){
        Employee employee = new Employee("Yossef","YossefElsersy@gmail.com","+201122344546","IT","Egypt",2003);
        // Employee.Developer d1 = employee.new Developer("Yossef","YossefElsersy@gmail.com","+201122344546","IT","Egypt","2003","ERP");


    
        print(employee.hashCode());
        print(employee.toString());

    }
}
