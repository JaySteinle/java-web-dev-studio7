package org.launchcode.studio7;

public class CD extends BaseDisc {
    public CD(int capacity, int rotations) {
        super(capacity, rotations);
        this.capacity = 500;
        this.rotations = 200;
    }

    // TODO: Implement your custom interface.

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at 200 rpm");
    }

//    @Override
//    public void readable() {
//        System.out.println("Can read " + capacity + " at " + rotations + " RPMs.");
//    }

    @Override
    public void writable() {
        System.out.println("Can write to me.");
    }
}
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


