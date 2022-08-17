/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankproject;

import java.util.Scanner;

/**
 *
 * @author srinivsi
 */
public class BankProject {

    public static BankLocation Brampton = BankLocation.getLocation() ;//we only ever want one 
   // of these. The bank is located only in one location Brampton 
   //and all users have account in the same location.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Bank");
        System.out.println("What kind of Account do you want?");
        System.out.println("Please enter exactly Saving or Basic or Investment Account");
        
        /*write code to take input 
         what account is required 
        then create that account type */
        
        System.out.println("how many accounts would you like?");
        int usernumber = sc.nextInt();
        Brampton.numofaccounts= usernumber ;
      // Add the created account to the number of users 
        
     System.out.println("Great job, here is the account number for " + Brampton.numofaccounts + " users");
            
        
      //else
      
            System.out.println("Enter a valid Account type");
       
        
    }//end main    
    }
    

