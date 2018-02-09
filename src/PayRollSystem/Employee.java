/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PayRollSystem;

import java.util.ArrayList;

/**
 *
 * @author mtsguest
 */
public class Employee 
{   
    //instance fields
    private String firstName;
    private String lastName;
    private int employeeID;

    
     public ArrayList<Paycheck> listOfPaychecks = new ArrayList<Paycheck>();//new ArrayList<>;
     
     
    // This contrustor initializes the fileds to the passed values.
     //The parent me inherate the methods and the fields
   
    public Employee (int iemployeeID, String aFirstName, String aLastName,  ArrayList<Paycheck> listOfPaychecks1 )
    {
        employeeID = iemployeeID;
        firstName = aFirstName;
        lastName = aLastName;
        listOfPaychecks = listOfPaychecks1;
        
        //inherites the fileds
        //This class extends 
    }
    
    public  Employee(Employee xobject)    
    {
        if (xobject != null){
        employeeID = xobject.employeeID;
        firstName = xobject.firstName;
        lastName = xobject.lastName ;
        
        listOfPaychecks = xobject.listOfPaychecks;
        }
    }
    
    //This is a copy constructor. It initilizes the fields of the object being created to values as
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public void setFirstName(String aFirstName)
    {
        firstName = aFirstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public void setLastName(String aLastName)
    {
        lastName = aLastName;
    }
    
 
    //i added end method setWeeklySalary
    public void setListOfPaychecks(ArrayList<Paycheck> paychecks){
         listOfPaychecks = listOfPaychecks;
    }
    
    public int getEmployeeID()
    {
        return employeeID;
    }
    
    public void setEmployeeID(int iemployeeID)
    {
        employeeID = iemployeeID;
    }

    public String toString()
            
    { String output = String.format("\n%5s %-24s %s \n%5s %-24s %s \n%5s %-24s %s \n%5s %-24s ", 
                                           "", "Employee ID:", employeeID,
                                           "", "First Name:", firstName,
                                           "", "Last Name:", lastName,
                                           "", "Paychecks Received:");
        //output+= listOfPaychecks.toString();
        if( listOfPaychecks == null || listOfPaychecks.isEmpty() )
            output += "No paychecks received.";
        else
        {
            for( Paycheck checkElement : listOfPaychecks)
                output += checkElement.toString();
        }
        
        return output + "\n"; 
    } 
}
