/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

public class starter {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount("Mehtaab");
        BankAccount account3 = new BankAccount("Bob", 500);
        BankAccount account4 = new BankAccount("Jimbo", 1000);

        account1.info();
        System.out.println();
        account2.info();
        System.out.println();
        account3.info();
        System.out.println();
        account4.info();
    }
}


