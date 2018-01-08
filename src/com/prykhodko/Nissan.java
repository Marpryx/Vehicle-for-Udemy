/////////////////////////////////////////////////////////////////////
// The Nissan class extends the Vehicle class in order             //
// to show the inheritance in Java                                 //
//                                                                 //
/////////////////////////////////////////////////////////////////////


package com.prykhodko;

public class Nissan extends Car {

    private int guarantee;

    public Nissan( int guarantee) {
        super("sedan", "Nissan", "V8", 5, 5, false);
        this.guarantee = guarantee;
    }

    /**
     * Change the gear according to the speed
     * @param speedDifference
     */
    public void accelerate(int speedDifference){
        int newVelocity = getVelocity() + speedDifference;

        if(newVelocity == 0){
            stop();
        }else if(newVelocity > 0 && newVelocity <=10){
            setCurrenGear(1);
        }else if(newVelocity > 10 && newVelocity <=20){
            setCurrenGear(2);
        }else if(newVelocity > 20 && newVelocity <= 30){
            setCurrenGear(3);
        }else{
            setCurrenGear(4);
        }

        if(newVelocity < 0){
            changeVelocity(newVelocity, getDirection());
        }
    }
}
