package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc{

    int capacity;
    int rotations;

    public BaseDisc(int capacity, int rotations) {
        this.capacity = capacity;
        this.rotations = rotations;
    }

    public void readable() {
        System.out.println("Can read " + capacity + " at " + rotations + " RPMs.");
    }

}
