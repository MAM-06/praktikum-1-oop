/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab2.nomor1;

/**
 *
 * @author MAM
 */
public class DogAct {
    public static void main (String [] args){
        Dog matiff = new Dog ("Neapolitan Matif", "Large", "Black", 5);
        matiff.info();
        matiff.eat();
        matiff.sleep();
        matiff.sit();
        matiff.run();
        System.out.println("");
        
        Dog maltese = new Dog ("Maltese", "Small", "White", 2);
        maltese.info();
        maltese.eat();
        maltese.sleep();
        maltese.sit();
        maltese.run();
        System.out.println("");
        
        Dog coco = new Dog ("ChowChow", "Medium", "Brown", 3);
        coco.info();
        coco.eat();
        coco.sleep();
        coco.sit();
        coco.run();
    }
}
