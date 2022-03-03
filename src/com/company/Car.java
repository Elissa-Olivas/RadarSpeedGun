package com.company;

public class Car extends MotorPowered implements Mover {
    private String make;
    private String model;
    private int speed;

    public Car (boolean hasMotor, String make, String model, int speed) {
        super(hasMotor);
        this.make = make;
        this.model = model;
        this.speed = speed;
    }

    @Override
    public int move() {
        System.out.println("The car is a " + make + " " + model + " and is going " + speed + "MPH.");
        return speed;
    }
}
