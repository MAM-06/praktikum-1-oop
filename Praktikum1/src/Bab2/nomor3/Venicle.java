/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab2.nomor3;

/**
 *
 * @author MAM
 */
public class Venicle {
    String brandName;
    String color;
    int numberOfWheels, UpGear, Gear;
    double price;
    void info (String brandName, String color, int numberOfWheels, double price){
        this.brandName = brandName;
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.price = price;
    }
    void print (){
        System.out.println("___________________________");
        System.out.println("| Brand Name : " + brandName);
        System.out.println("| Color : " + color);
        System.out.println("| Number Of Wheels : " + numberOfWheels);
        System.out.println("| Price : " + price + "Juta");
    }
    void start(int Gear){
        this.Gear = Gear;
        System.out.println("| Total Gear : " + Gear);
    }
    void changeGear (int UpGear){
        this.UpGear = UpGear;
        int Up = UpGear +1  ;
        System.out.println("| Change Gear : From "+ UpGear +" To " + Up );
        System.out.println("---------------------------");
    }
}
