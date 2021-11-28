/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab3.nomor2;

/**
 *
 * @author ASUS
 */
public class Student {
    String Name, color, sex ;
    private String eat, drink, run;
    int age;
    void id (String Name, int age, String color, String sex){
        this.Name = Name;
        this.age = age;
        this.color = color;
        this.sex = sex;
    }
    void print (){
        System.out.println("___________________________");
        System.out.println("| Name  : " + Name );
        System.out.println("| Age   : " + age );
        System.out.println("| Color : " + color );
        System.out.println("| Sex   : " + sex );
    }
    public String getEat(){
        return eat;
    }
    public String getDrink(){
        return drink;
    }
    public String getRun(){
        return run;
    }
    
    public void setEat (String eat){
        this.eat = eat;
    }
    public void setDrink(String drink){
        this.drink = drink;
    }
    public void setRun(String run){
        this.run = run;
    }
}
