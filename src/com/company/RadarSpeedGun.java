package com.company;

import java.util.ArrayList;
import java.util.List;

public class RadarSpeedGun {
    private int totalSpeed;

    public RadarSpeedGun(int totalSpeed) {
        totalSpeed = 0;
    }

    public int getTotalSpeed() {
        return totalSpeed;
    }

    List<Mover> movingItems = new ArrayList<Mover>();

    public void movingItems(Mover mover) {
        totalSpeed = totalSpeed + mover.move();
        movingItems.add(mover);
        }

}
