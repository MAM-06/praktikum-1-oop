/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kleruu;

import Bab3.nomor2.*;

/**
 *
 * @author MAM
 */
public class Main_1 {
    public static void main(String[] args) {
        Student john = new Student();
        john.id("John", 12, "Fair", "Male");
        john.print();
        john.setEat("More");
        john.setDrink("More");
        john.setRun("Fast");
        System.out.println("| "+john.Name+" Can Eat "+john.getEat());
        System.out.println("| "+john.Name+ " Can Drink " +john.getDrink());
        System.out.println("| "+john.Name+ " Can Run " +john.getRun());
        System.out.println("============================");
        
        Student sophia = new Student();
        sophia.id("sophia", 10, "Fair", "Female");
        sophia.print();
        sophia.setEat("Less");
        sophia.setDrink("Less");
        sophia.setRun("Slow");
        System.out.println("| "+john.Name+" Can Eat "+sophia.getEat());
        System.out.println("| "+john.Name+ " Can Drink " +sophia.getDrink());
        System.out.println("| "+john.Name+ " Can Run " +sophia.getRun());
        System.out.println("============================");
        
        Student Lili = new Student();
        Lili.id("Lili", 11, "Dark", "Female");
        Lili.print();
        Lili.setEat("More");
        Lili.setDrink("More");
        Lili.setRun("Fast");
        System.out.println("| "+john.Name+" Can Eat "+Lili.getEat());
        System.out.println("| "+john.Name+ " Can Drink " +Lili.getDrink());
        System.out.println("| "+john.Name+ " Can Run " +Lili.getRun());
        System.out.println("============================");
    }
}
