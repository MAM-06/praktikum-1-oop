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
public class VenicleAct {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Truck truck = new Truck();
        
        System.out.println("Car");
        car.setBrandName ("Ferrari");
        car.setColor("red");
        car.setStart(1000000000);
        car.setChangeGear(6);
        System.out.println("Brand  : "+ car.getBrandName());
        System.out.println("Color  : "+ car.getColor());
        System.out.println("Harga : "+ car.getStart());
        System.out.println("Gear : "+ car.getChangeGear());
        
        System.out.println("Bike");
        bike.setBrandName ("Ducati");
        bike.setColor("Black");
        bike.setStart(87000000);
        bike.setChangeGear(5);
        System.out.println("Brand  : "+ bike.getBrandName());
        System.out.println("Color  : "+ bike.getColor());
        System.out.println("Harga : "+ bike.getStart());
        System.out.println("Gear : "+ bike.getChangeGear());

        System.out.println("Truck");
        truck.setBrandName ("Hino");
        truck.setColor("yellow");
        truck.setStart(2000000000);
        truck.setChangeGear(7);
        System.out.println("Brand  : "+ truck.getBrandName());
        System.out.println("Color  : "+ truck.getColor());
        System.out.println("Harga : "+ truck.getStart());
        System.out.println("Gear : "+ truck.getChangeGear());
    }
}
