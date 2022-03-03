package com.company;

public class Bicycle extends HumanPowered implements Mover {
    private String wheels;
    private int speed;


    public Bicycle (boolean hasNoMotor, String wheels, int speed) {
        super(hasNoMotor);
        this.wheels = "wheels";
        this.speed = speed;
    }

    @Override
    public int move() {
        System.out.println("The Bicycle has no motor: " + hasNoMotor + "" +
                " It only has 2 " + wheels + " and is going " + speed + "MPH");
        return speed;
    }
}
