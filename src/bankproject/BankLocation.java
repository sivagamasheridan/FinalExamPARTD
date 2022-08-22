/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankproject;

/** A class that specifies the bank location
 * We only ever want one location at Brampton for Sheridan Bank 
 * Users can order the number of accounts they want to create
 * @author Sivagama Srinivasan
  August,2022 */
public class BankLocation {
     public int numofaccounts = 0;// how many accounts to create in bank
    
private static  BankLocation brampton = null;   

    private BankLocation()
    {
        System.out.println("");
    }  

public static BankLocation getLocation()
{
    if(brampton == null)
    {
        brampton= new BankLocation();
    }
return brampton;
} 
}
