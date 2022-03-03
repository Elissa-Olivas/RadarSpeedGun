package com.company;

public class Bicycle extends HumanPowered implements Mover {
    private String wheels;
    private


    public Bicycle (boolean hasNoMotor, String wheels) {
        super(hasNoMotor);
        this.wheels = "wheels";
    }

    @Override
    public void move(int speedOfObject) {
        System.out.println("The Bicycle has no motor: " + hasNoMotor + "" +
                " It only has 2 " + wheels + " and is going " + speedOfObject + "MPH");
    }
}
