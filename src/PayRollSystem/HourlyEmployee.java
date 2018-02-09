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
public class HourlyEmployee extends Employee{
    
   //instance fields
    private double hourlyRate;
    private double periodHours;
   
    
    public HourlyEmployee (int iemployeeID, String aFirstName, String aLastName,  ArrayList<Paycheck> listOfPaychecks1, double ahourlyRate, double aperiodHours)
    {
        
        super(iemployeeID, aFirstName, aLastName,  listOfPaychecks1);
         
       hourlyRate = ahourlyRate;
       periodHours = aperiodHours;
    }
    

    
    public  HourlyEmployee(HourlyEmployee xobject)    
    {
        
        super(xobject);
        if (xobject != null){
        hourlyRate = xobject.hourlyRate;
        periodHours = xobject.periodHours;
        listOfPaychecks = xobject.listOfPaychecks;
        }
    }
    
  
    public double getHourlyRate()
    {
        return hourlyRate;
    }
    
    public void setHourlyRate(int ahourlyRate)
    {
        hourlyRate = ahourlyRate;
    }
    
    public double getPeriodHours()
    {
        return periodHours;
    }
    
    public void setPeriodHours(int aperiodHours)
    {
        periodHours = aperiodHours;
    }
    
    public String toString()
    {   
        String output = super.toString() +
                String.format("%5s %-24s %s \n%5s %-24s %s ", 
                                           "", "Hourly Rate", hourlyRate,
                                           "", "Period Hours " , periodHours);
        return output;
        //return " Hourly Rate" + hourlyRate + "Period Hours " + periodHours;
    } 

    
}
