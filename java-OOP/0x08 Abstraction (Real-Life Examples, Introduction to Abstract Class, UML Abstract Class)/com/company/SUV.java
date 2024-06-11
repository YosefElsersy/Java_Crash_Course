package com.company;
public class SUV extends Car {
    // int x;
    // SUV(int x , int height , float weight , int numberOfWheels){
    //    super(height,weight,numberOfWheels);
    //     this.x = x;
    //     // this.height = height;
    //     // this.weight = weight;
    //     // this.numberOfWheels = numberOfWheels;
    // }

    @Override
    void autopilot() {
        System.out.println("SUV autopilot");
        
    }
    
    @Override
    void parkingSensors() {     
        System.out.println("SUV parkingSensors");
    }
    
    @Override
    void streamingServices() {
        System.out.println("SUV streamingServices");
    }
   
        


}
