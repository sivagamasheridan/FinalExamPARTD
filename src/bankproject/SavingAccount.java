/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankproject;

/**
 *
 * @author srinivsi
 */
public class SavingAccount extends BasicAccount
{
  
    public SavingAccount()
    {
        super();
        super.deposit(1000);
    }
    @Override
    public void debitCard(String label)
    {
     bankName = label;
        //do some labelling here, code not implemented yet
        //not necessary for the review
    }
     
    
}
