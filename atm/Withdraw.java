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
public class Withdraw {
    static void withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Enter Amount to be Withdrawal :");
        int wcash=sc.nextInt();
        if(wcash<=ATM.balance){
            ATM.balance=ATM.balance-wcash;
            ATM.history.add(Integer.toString(wcash));
            ATM.history.add("Withdraw");
            System.out.println("Amount Rs"+wcash+"/- withdraw successfully");
            System.out.println("\n******************************************************************************************************************************************************");
        }
        else{
            System.out.println("Insufficient balance");
            System.out.println("\n******************************************************************************************************************************************************");
        }
        ATM.prompt();
    }
}
