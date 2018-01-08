/////////////////////////////////////////////////////////////////////
// The Main class to test the work of the                          //
// Vehicle, Car and Nissan classes.                                //
/////////////////////////////////////////////////////////////////////


package com.prykhodko;

public class Main {

    public static void main(String[] args) {

        Nissan sentra = new Nissan(24);
        sentra.accelerate(30);
        sentra.accelerate(20);
    }
}
