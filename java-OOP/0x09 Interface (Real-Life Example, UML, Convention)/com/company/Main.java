package com.company;

public class Main {

    static void interfaceMethod(SelfDriveable s){
        s.drive();
    };
    public static void main(String[] args) {
       SelfDriveable c1 =  new CarV1();
        c1.drive();

        c1 =  new CarV2();
        c1.drive();
        
        interfaceMethod(new CarV1());
        interfaceMethod(new CarV2());
    
}
}
