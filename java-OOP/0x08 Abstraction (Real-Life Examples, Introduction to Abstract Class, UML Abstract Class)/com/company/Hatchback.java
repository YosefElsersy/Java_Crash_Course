package com.company;

public class Hatchback extends Car {

    @Override
    void autopilot() {
        System.out.println("Hatchback autopilot");
        
    }
    
    @Override
    void parkingSensors() {     
        System.out.println("Hatchback parkingSensors");
    }
    
    @Override
    void streamingServices() {
        System.out.println("Hatchback streamingServices");
    }
    
}
