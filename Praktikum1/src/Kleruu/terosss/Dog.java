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
public class Dog {
    String breed;
    String size;
    int age;
    String color;
    
    /**
     *
     * @return
     */
    public String getInfo(){
        return ("Breed : "+ breed + "\nsize : "+ size +"\nAge : "+ age +"\ncolor : "+color);   
    }

    /**
     *
     * @return
     */
    public String getEat(){
        return ("Eat : bone");
    }

    /**
     *
     * @return
     */
    public String getSleep(){
        return ("Sleep : everytime");
    }

    /**
     *
     * @return
     */
    public String getSit(){
        return ("Sit : hungry");
    }

    /**
     *
     * @return
     */
    public String getRun(){
        return ("Run : Scared");
    }
}
