package com.oasis.atm;
import java.util.*;

public class ATM {
    public static String name;
    public static int balance=0;
    public static String accNum;
    public static ArrayList<String> history=new ArrayList<String>();

    static void updatebalance(int dcash){
        balance=balance+dcash;
    }
    static void showbalance(){
        System.out.println(balance);
    }
    
    public static void Welcomepage(){
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO ATM INTERFACE");
        System.out.println("\n******************************************************************************************************************************************************");
        System.out.println("select option :");
        System.out.println("1. Register");
        System.out.println("2. Exit");
        System.out.println("Enter choice");
        int choice =sc.nextInt();
        if (choice==1){
                BankAc.register();
        }
        else {
            if(choice==2){
                System.exit(0);
            }
            else{
                System.out.println("Select a value only from the given options :");
                Welcomepage();
            }
        }
    }
    
    static void prompt(){
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME "+ATM.name+"! TO ATM SYSTEM");
        System.out.println("\n******************************************************************************************************************************************************");
        System.out.println("Select option : ");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Transfer");
        System.out.println("4. Check balance");
        System.out.println("5. Transaction History");
        System.out.println("6. Exit");
        System.out.print("\nEnter your choice : ");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                Withdraw.withdraw();
            case 2:
                Deposit.deposit();
            case 3:
                Transfer.transfer();
            case 4:
                CheckBalance.checkbalance();
            case 5:
                TransactionHistory.transactionhistory();
            case 6:
                System.exit(0);
        }
    }

    public static void main(String[] args) {
        Welcomepage();
    }
}
