package com.company;

public class Main {
    // static void fun1(SUV obj){
    //     obj.autopilot();
    // }
    // static void fun2(Hatchback obj){
    //     obj.autopilot();
    // }
    static void fun(Car obj){
        obj.autopilot();
    }
    public static void main(String[] args){
        Car car1 = new SUV();
        fun(car1);

        car1 = new Hatchback();
        fun(car1);
        // car1.autopilot();
        // fun(new SUV());
        // fun(new Hatchback());
        // fun(new Car());

    }
}
