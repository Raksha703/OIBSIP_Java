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
public class Transfer {
    static void transfer(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the receiving body:");
        String s=sc.nextLine();
        System.out.println("Enter the Account Number of the Receiving Body");
        int num=sc.nextInt();
        System.out.println("Enter the Amount to be Transferred :");
        int tcash=sc.nextInt();
        if(tcash<=ATM.balance){
            ATM.balance=ATM.balance-tcash;
            ATM.history.add(Integer.toString(tcash));
            ATM.history.add("Transferred");
            System.out.println("Amount Rs."+tcash+"/- transferred successfully!!");
            System.out.println("\n******************************************************************************************************************************************************");
        }
        else{
            System.out.println("Insufficient balance!!");
            System.out.println("\n******************************************************************************************************************************************************");
        }
    }
}
