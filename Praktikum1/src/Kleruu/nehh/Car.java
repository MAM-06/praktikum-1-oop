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
public class Car extends Venicle {
    private int numberOfWheels;
    private double price;
    
    public Car() {
        this.numberOfWheels = 0 ; 
        this.price = 0 ;
    }
     public double getStart() {
        return price;
    }
    public void setStart(int price) {
        this.price = price;
    }
    public int getChangeGear() {
        return numberOfWheels;
    }
    public void setChangeGear(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
   
}
