package com.driver;

public class Car extends Vehicle {
    private final int wheels;
    private final String type;
    private final int doors;
    private final int gears;
    private final boolean isManual;
    private int currentGear;
    private final int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels=wheels;
        this.doors=doors;
        this.gears=gears;
        this.isManual=isManual;
        this.type=type;
        this.seats=seats;
        this.currentGear=1;
    }

    public void changeGear(int newGear){
        this.currentGear=newGear;

        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

   public int getWheels() {
        return this.wheels;
    }

    public String  getType() {
        return this.type;
    }

    public int getDoors() {
        return this.doors;
    }

    public int getGears() {
        return this.gears;
    }

    public boolean isManual() {
        return this.isManual;
    }

    public int getCurrentGear() {
        return this.currentGear;
    }

    public int getSeats() {
        return this.seats;
    }

    public void changeSpeed(int newSpeed, int newDirection){
        this.move(newSpeed,newDirection);

        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
