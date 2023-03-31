/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oasis.atm;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Deposit {
    static void deposit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\n******************************************************************************************************************************************************");
        System.out.print("Enter Amount to Deposit :");
        int dcash=sc.nextInt();
        ATM.updatebalance(dcash);
        ATM.history.add(Integer.toString(dcash));
        ATM.history.add("Deposit");
        System.out.println("Amount Rs."+dcash+"/- is deposited successful!");
        System.out.println("\n******************************************************************************************************************************************************");
        ATM.prompt();
    }
}
