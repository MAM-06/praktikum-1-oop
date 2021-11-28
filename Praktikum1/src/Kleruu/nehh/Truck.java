/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kleruu.nehh;

/**
 *
 * @author MAM
 */
public class Truck extends Venicle {
    private int numberOfWheels;
    private double price;
    
    public Truck() {
        this.numberOfWheels = 0 ; 
        this.price = 0 ;
    }
     public double getStart() {
        return numberOfWheels;
    }
    public void setStart(double price) {
        this.price = price;
    }
    public int getChangeGear() {
        return numberOfWheels;
    }
    public void setChangeGear(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }    
}
