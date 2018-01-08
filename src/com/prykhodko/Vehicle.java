/////////////////////////////////////////////////////////////////////
// The Vehicle class is                       //
//                               //
/////////////////////////////////////////////////////////////////////

package com.prykhodko;

public class Vehicle {
    private String type;
    private String model;
    private int velocity;
    private int direction;

    /**
     * The constructor to initialize the fields of the Vehicle class
     * @param type
     * @param model
     */
    public Vehicle(String type, String model) {
        this.type = type;
        this.model = model;
        this.velocity = 0;
        this.direction = 0;
    }

    /**
     * Getters for the Vehicle class
     * @return
     */

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getDirection() {
        return direction;
    }

    

    public void moveCar(int newDirection, int newVelocity){
        direction = newDirection;
        velocity = newVelocity;
    }

    public void driveCar(int direction){
        this.direction += direction;
        System.out.println("Vehicle.drive() works. Current direction is " + direction);

    }

    /**
     *Stop the car and set the velocity equal to 0.
     */
    public void stop(){
        this.velocity = 0;
    }

}
