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
public class Company {
    
    private String companyName;
     private ArrayList<Department> listOfdepartments = new ArrayList<Department>();

    public Company(String companyName, ArrayList<Department> list) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<Department> getListOfdepartments() {
        return listOfdepartments;
    }

    public void setDepartmentList(ArrayList<Department> listOfdepartments) {
        this.listOfdepartments = listOfdepartments;
    }

    @Override
    public String toString() {
        
        String output = String.format("\n%5s %-24s %s ", 
                                           "", "Company Name", companyName);
        return output + "\n";
        //return "Company Name" + companyName + ", List Of Departments" + listOfdepartments;
    }
    

}
