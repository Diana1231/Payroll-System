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
public class Department {
    
private int departmentID;
private String departmentName; 
private Manager departmentManager; 
//1, "Human Resources", manager_1, dept1Employees

ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();

//1, "Human Resources", manager_1, dept1Employees

    public Department(int departmentID, String departmentName, Manager departmentManager, ArrayList<Employee> listOfEmployees1) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.departmentManager = departmentManager;
        this.listOfEmployees = listOfEmployees1;
    }
    
    public  Department(Department xobject)    
    {
        if (xobject != null){
        departmentID= xobject.departmentID;
        departmentName = xobject.departmentName ;
        departmentManager = xobject.departmentManager;
        listOfEmployees = xobject.listOfEmployees;
        }
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Manager getDepartmentManager() {
        return departmentManager;
    }

    public void setDepartmentManager(Manager departmentManager) {
        this.departmentManager = departmentManager;
    }

    public ArrayList<Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public void setListOfEmployees(ArrayList<Employee> listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }

    @Override
    public String toString() {
        String output = String.format("\n%5s %-24s %s \n%5s %-24s %s \n%5s %-24s %s \n%5s %-24s ", 
                                           "", "DepartmentID:", departmentID,
                                           "", "Department Name:", departmentName,
                                           "", "Department Manager:", departmentManager,
                                           "", "List Of Employees:", listOfEmployees);
       return output + "\n"; 
       // return "DepartmentID: " + departmentID + ", Department Name: " + departmentName + ", Department Manager: " + departmentManager + ", List Of Employees: " + listOfEmployees;
    }
    
    
    
}
