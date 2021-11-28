/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kleruu.terosss;

/**
 *
 * @author MAM
 */
public class DogAct{

    /**
     *
     * @param args
     */
    public static void main(String[]args){
        Dog maltese = new Dog();
        maltese.breed = "maltese";
        maltese.size = "small";
        maltese.age = 2;
        maltese.color = "white";
                
        Dog Coco = new Dog();
        Coco.breed = "Chow Chow";
        Coco.size = "medium";
        Coco.age = 3;
        Coco.color = "brown";
                
        Dog mastiff = new Dog();
        mastiff.breed = "Neapolitan mastiff";
        mastiff.size = "large";
        mastiff.age = 5;
        mastiff.color = "black";
        
        System.out.println(maltese.getInfo());
        System.out.println(maltese.getEat());
        System.out.println(maltese.getSleep());
        System.out.println(maltese.getSit());
        System.out.println(maltese.getRun());
        System.out.println(Coco.getInfo());
        System.out.println(Coco.getEat());
        System.out.println(Coco.getSleep());
        System.out.println(Coco.getSit());
        System.out.println(Coco.getRun());
        System.out.println(mastiff.getInfo());
        System.out.println(mastiff.getEat());
        System.out.println(mastiff.getSleep());
        System.out.println(mastiff.getSit());
        System.out.println(mastiff.getRun());
    }
    
}

