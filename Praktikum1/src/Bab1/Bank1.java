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
public class Bank1 {
    int account_number = 20;
    int account_balance = 100;
    
    public Bank1 (int account_number, int account_balance){
        this.account_number = account_number;
        this.account_balance = account_balance;
    }
    void depo(){
        account_balance +=100 ;
    }
    void wd(){
        account_balance -= 50;
    }
    void showData(){
        System.out.println("Account Number = "+ account_number+ "%d");
        System.out.println("Account balance = "+ account_balance+"%d");
        System.out.println("====================================");
    }
}
