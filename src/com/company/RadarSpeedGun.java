package com.company;

import java.util.ArrayList;
import java.util.List;

public class RadarSpeedGun {
    private int speed;
    private int totalSpeed;

    List<String> movingItems = new ArrayList<String>();

    public void setMovingItems() {

        for (int i = 0; i < movingItems.size(); i++) {
            System.out.println(movingItems.get(i) + " are now moving at " + speed);
            totalSpeed += speed;
        }
    }
}
