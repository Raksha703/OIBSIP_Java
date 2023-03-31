/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oasis.atm;

/**
 *
 * @author User
 */
public class TransactionHistory {
    static void transactionhistory(){
            System.out.println("\n******************************************************************************************************************************************************");
            System.out.println("Transaction History :");
            int k=0;
            if(ATM.balance>0){
            for(int i=0;i<(ATM.history.size()/2);i++)
            {
                for(int j=0;j<2;j++)
                {
                    System.out.print(ATM.history.get(k)+" ");
                    k++;
                }
                System.out.println("\n******************************************************************************************************************************************************");
            }
            }
            else {
                System.out.println("your account is empty");
            }
            ATM.prompt();
    }
}
