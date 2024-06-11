package com.company;

public abstract class Car {
 
    float height;
    float weight;
    int numberOfWheels;

    public Car(){};

    public Car (float height,float weight, int numberOfWheels){
        this.height =height;
        this.weight = weight;
        this.numberOfWheels = numberOfWheels;
    }

        // Setter for height
        public void setHeight(float height) {
            this.height = height;
        }
    
        // Getter for height
        public float getHeight() {
            return height;
        }
    
        // Setter for weight
        public void setWeight(float weight) {
            this.weight = weight;
        }
    
        // Getter for weight
        public float getWeight() {
            return weight;
        }
    
        // Setter for numberOfWheels
        public void setNumberOfWheels(int numberOfWheels) {
            this.numberOfWheels = numberOfWheels;
        }
    
        // Getter for numberOfWheels
        public int getNumberOfWheels() {
            return numberOfWheels;
        }
    

    abstract void autopilot();  

    abstract void streamingServices(); 

    abstract void parkingSensors();





}
