/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankproject;

import java.util.ArrayList;

/**
 *
 * @author srinivsi
 */
public class BasicAccount {
  
public String bankName; //use bankname = "Sheridan";
    private ArrayList<Integer> wallet = new ArrayList();
    
    public void deposit(int money) 
        {
	wallet.add(money);
        }

	
	public void debitCard(String label) 
        {
	bankName=label;
        }  

    
}
