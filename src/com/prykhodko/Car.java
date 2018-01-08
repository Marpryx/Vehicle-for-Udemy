/////////////////////////////////////////////////////////////////////
// The Car class extends the Vehicle class in order                //
// to show how the inheritance works in Java                       //
//                                                                 //
/////////////////////////////////////////////////////////////////////

package com.prykhodko;

public class Car extends Vehicle{

    private String engine;
    private int doors;
    private int transmission;
    private boolean isManual; //To check is it manual or automatic transmission

    private int currenGear;

    /**
     * The constructor to initialize the fields of the Car class
     * @param type
     * @param model
     * @param engine
     * @param doors
     * @param transmission
     * @param isManual
     */
    public Car(String type, String model, String engine, int doors, int transmission, boolean isManual) {
        super(type, model);
        this.engine = engine;
        this.doors = doors;
        this.transmission = transmission;
        this.isManual = isManual;
        this.currenGear = 1;
    }

    /**
     * Set the current gear to the specific value
     * @param currentGear
     */
    public void setCurrenGear(int currentGear){
        this.currenGear = currentGear;
        System.out.println("Car.setCurrentGear works. The current gear is " + currentGear);
    }

    /**
     * Change the velocity if the car is moving
     * @param speed
     * @param direction
     */
    public void changeVelocity(int speed, int direction){
        moveCar(speed, direction);
        System.out.println("Car.changeVelocity() works. The velocity is " + speed + " and direction is " + direction );
    }

}
