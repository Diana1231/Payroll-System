/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PayRollSystem;

/**
 *
 * @author luislalinde
 */
public class Paycheck {
    
private int employeeID;
private String periodBeginDate;
private String periodEndDate;  
private double grossAmount;  
private double taxAmount;
private double bonusAmount;  
private double netAmount;  

    public Paycheck(int employeeID, String periodBeginDate, String periodEndDate, double grossAmount, double taxAmount, double bonusAmount, double netAmount) {
        this.employeeID = employeeID;
        this.periodBeginDate = periodBeginDate;
        this.periodEndDate = periodEndDate;
        this.grossAmount = grossAmount;
        this.taxAmount = taxAmount;
        this.bonusAmount = bonusAmount;
        this.netAmount = netAmount;
    }
    
     public  Paycheck(Paycheck xobject)    
    {
        if (xobject != null){
       employeeID  = xobject.employeeID ;
        periodBeginDate = xobject.periodBeginDate;
        periodEndDate = xobject.periodEndDate;
        grossAmount = xobject.grossAmount;
        taxAmount = xobject.taxAmount;
        bonusAmount = xobject.bonusAmount;
        netAmount  = xobject.netAmount;
        }
    }



    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getPeriodBeginDate() {
        return periodBeginDate;
    }

    public void setPeriodBeginDate(String periodBeginDate) {
        this.periodBeginDate = periodBeginDate;
    }

    public String getPeriodEndDate() {
        return periodEndDate;
    }

    public void setPeriodEndDate(String periodEndDate) {
        this.periodEndDate = periodEndDate;
    }

    public double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(double grossAmount) {
        this.grossAmount = grossAmount;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(double bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(double netAmount) {
        this.netAmount = netAmount;
    }

    @Override
    public String toString() {
        
        String output = String.format("\n%30s %s %s \n%30s %1s %-20s \n%30s %s %-30s \n%30s %1s %-15s \n%30s %1s %-15s \n%30s %1s %-15s  \n%30s %1s %-15s", 
                                           "", "Employee ID:", employeeID,
                                           "", "Period Begin Date", periodBeginDate,
                                           "", "Period End Date:", periodEndDate,
                                           "", "Gross Amount:", grossAmount,
                                           "", "Tax Amount:", taxAmount,
                                           "", "Bonus Amount:",  bonusAmount,
                                           "", "Net Amount:",  netAmount);
        return output + "\n                             -------------------------";
        //return ", grossAmount=" + grossAmount + ", taxAmount=" + taxAmount + ", bonusAmount=" + bonusAmount + ", netAmount=" + netAmount + '}';
    }

    
}
