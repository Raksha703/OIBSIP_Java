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
public class BankAc {
    static  void register(){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("\n******************************************************************************************************************************************************");
        System.out.println("Enter Your Name :");
        ATM.name=sc.nextLine();
        System.out.println("Enter UserNamename :");
        String userName=sc.nextLine();
        System.out.println("Enter Password :");
        String password=sc.nextLine();
        System.out.println("Enter your Account Number :");
        ATM.accNum=sc.nextLine();
        System.out.println("REGISTRATION SUCCESSFULLY!");
        System.out.println("\n******************************************************************************************************************************************************");
        ATM.prompt();
        while(true){
            display(ATM.name);
            int choice=sc.nextInt();
            if(choice==1){
                login(userName,password);
                break;
            }
            else {
                if(choice==2){
                    System.exit(0);
                }
                else{
                    System.out.println("Invalid Input!");
                }
            }
        }
    }
    static void display(String name){}
    static void login(String userName,String password){}
}
