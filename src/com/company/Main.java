package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        RadarSpeedGun speedGun = new RadarSpeedGun();
        Car car1 = new Car(true, "Ford", "Bronco", 45);
        Bicycle bicycle1 = new Bicycle(true, "wheels", 10);

        List<String> movingItems = new ArrayList<String>();


        speedGun.setMovingItems();
    }
}
