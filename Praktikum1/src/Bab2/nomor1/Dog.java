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
public class Dog {
    String breed , size , color ;
    int age;
    
    public Dog (String breed, String size, String color, int age ){
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
    }
    
    void info(){
        System.out.println("Breed : "+ breed);
        System.out.println("Size : "+ size);
        System.out.println("Color : "+ color);
        System.out.println("Age : "+ age);
    }
    void eat() {
        System.out.println("Eat : meat");
    }
    void sleep (){
        System.out.println("Sleep : Anywhere");
    }
    void sit (){
        System.out.println("Sit : hungry");
    }
    void run(){
        System.out.println("Run : scared");
    }    
}
