package com.company;

public class CarV2 implements Movable ,SelfDriveable {
    private int x,y;
    private  int numberOfPassengers;

    public CarV2(){};
    public CarV2 (int x, int y){
        this.x = x;
        this.y = y; 
    }

    @Override
    public void destination(String d) {
        System.out.println("destination = " + d);
    }
    
    @Override
    public void drive() {
        System.out.println("drive V2");

    }

    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }


}
