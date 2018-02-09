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
public class SalariedEmployee extends Employee {
    
//    
//     private static String firstName;
//     private static String lastName;
//     private static int employeeID;
     private static double annualSalary;

    public SalariedEmployee(int iemployeeID, String afirstName, String alastName,  ArrayList<Paycheck> listOfPaychecks1,double annualSalary) {
            super(iemployeeID,afirstName, alastName,listOfPaychecks1);
          this.annualSalary= annualSalary;
                 
    }
    
    public  SalariedEmployee(SalariedEmployee xobject)    
    { super(xobject);
        if (xobject != null){
        annualSalary = xobject.annualSalary;
        }
    }

    
    public double getAnnual(){
        return annualSalary;
        
    }

    public static void setAnnualSalary(double annualSalary) {
        SalariedEmployee.annualSalary = annualSalary;
    }
    
    /* public void setAnnualSalary()
    {
        this.annualSalary= 0;
        
    }*/
     
 public String toString() {
     
    
     String output =  super.toString() +
     
     String.format("\n%5s %-24s %s", 
                     "", "Annual Salary:", annualSalary);
     return output + "\n"; 
     
        //return "SalariedEmployee: " + annualSalary ;
    }

   
 
//    public static void setEmployeeID(int employeeID) {
//        SalariedEmployee.employeeID = employeeID;
//    }
//
//    public void setListOfPaychecks(ArrayList<Paycheck> listOfPaychecks) {
//        this.listOfPaychecks = listOfPaychecks;
//    }
//



     
     
    
}
