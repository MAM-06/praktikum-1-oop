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
public class VenicleAct {
    public static void main(String[] args){
    Venicle car = new Venicle();
    car. info("Ferrari", "Red", 4, 800);
    car.print();
    car.start(7);
    car.changeGear(5);
    
    Venicle bike = new Venicle();
    bike.info("Ducati", "White", 2, 22.500);
    bike.print();
    bike.start(5);
    bike.changeGear(3);
    
    Venicle truck = new Venicle();
    truck.info("Hino", "Yellow", 10, 700);
    truck.print();
    truck.start(6);
    truck.changeGear(1);
    }
}
