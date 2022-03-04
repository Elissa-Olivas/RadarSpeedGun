package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        RadarSpeedGun speedGun = new RadarSpeedGun(0);
        Car car1 = new Car(true, "Ford", "Bronco", 45);
        Bicycle bicycle1 = new Bicycle(true, "wheels", 10);
        Car car2 = new Car(true, "Toyota", "Corolla", 65);
        Bicycle bicycle2 = new Bicycle(true, "wheels", 15);

        List<Mover> movingItems = new ArrayList<Mover>();
        speedGun.movingItems(car1);
        speedGun.movingItems(car2);
        speedGun.movingItems(bicycle1);
        speedGun.movingItems(bicycle2);


        System.out.println(" ");
        System.out.println("The total speed of all the objects listed is: " + speedGun.getTotalSpeed());







    }
}
