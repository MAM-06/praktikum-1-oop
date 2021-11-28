/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab2.nomor2;

/**
 *
 * @author MAM
 */
class Person {
    String fname = "John";
    String lname = "Doe";
    String email = "john@doe.com";
    int age = 24;
}
public class Student extends Person {
    private int graduationYear = 2018;
    public static void main(String[]args){
        Student myObj = new Student ();
        System.out.println("Name:"+ myObj.fname+" "+ myObj.lname);
        System.out.println("Email: "+ myObj.email);
        System.out.println("Age: "+ myObj.age);
        System.out.println("Graduation Year: "+ myObj.graduationYear);
    }    
}
