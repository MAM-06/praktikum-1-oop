/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab1;

/**
 *
 * @author MAM
 */
public class Bank2 {
    public static void main (String[]args){
        Bank1 bank = new Bank1 (20,100);
        bank.depo();
        bank.showData();
        bank.wd();
        bank.showData();
    }
}
