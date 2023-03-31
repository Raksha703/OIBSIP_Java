/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oasis.atm;

/**
 *
 * @author User
 */
public class CheckBalance {
    static void checkbalance(){
        System.out.println("\n******************************************************************************************************************************************************");
        System.out.println("The available balance in the bank account :");
        ATM.showbalance();
        System.out.println("\n******************************************************************************************************************************************************");
        ATM.prompt();
    }
}
