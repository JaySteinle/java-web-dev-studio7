package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCd = new CD(500, 200);
        DVD myDvd = new DVD(4000, 570);

        myCd.spinDisc();
        myDvd.spinDisc();

        myCd.readable();
        myDvd.readable();

        myCd.writable();
        myDvd.writable();


        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
