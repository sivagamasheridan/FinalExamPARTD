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
public class InvestmentAccount extends BasicAccount
{
      public InvestmentAccount()
    {
        super();
        super.deposit(5000);
    }
      @Override
    public void debitCard(String label)
    {
       bankName = label;
        //do some labelling here, code not implemented yet
        //not necessary for the review
    }
}
