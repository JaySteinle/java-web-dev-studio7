package org.launchcode.studio7;

public class DVD extends BaseDisc{
    public DVD(int capacity, int rotations) {
        super(capacity, rotations);
        this.capacity = 4000;
        this.rotations = 570;
    }

    // TODO: Implement your custom interface.

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at 5700 rpm");
    }

//    @Override
//    public void readable() {
//        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAA");
//    }

    @Override
    public void writable() {
        System.out.println("Can write to a DVD.");
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
