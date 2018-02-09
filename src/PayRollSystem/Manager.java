/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PayRollSystem;

import java.util.ArrayList;

/**
 *
 * @author luislalinde
 */
public class Manager extends SalariedEmployee  {
    
    private static double bonus;

    public Manager(int iemployeeID, String afirstName, String alastName,double annualSalary, ArrayList<Paycheck> listOfPaychecks1, double bonus) {
       
        super(iemployeeID, afirstName, alastName,  listOfPaychecks1, annualSalary);
        this.bonus = bonus;
        
    }
    
     public Manager (Manager theManager)
    {
        super(theManager);
        //super(theManager., bikeObject.getSpeed(), bikeObject.getGear());
        if (theManager != null)
        {
            bonus = theManager.bonus;
        }
    }

    public double getBonus() {
        return bonus;
    }


   public static void setBonus(double annualSalary) {
        Manager.bonus= annualSalary;
    }

    public void setListOfPaychecks(ArrayList<Paycheck> listOfPaychecks) {
        this.listOfPaychecks = listOfPaychecks;
    }

    @Override
    public String toString() {
        
        String output = super.toString() +
                String.format("%5s %-24s %s", 
                                           "", "Bonus:", bonus);
        return output;
    }
  
}
