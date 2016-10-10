/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCompany;

/**
 *
 * @author x00130180
 */
public class Employee extends StaffMember{
    private String rsiNumber;
    protected double payRate;

    public Employee(String rsiNumber, double payRate, String name, String address, String number) {
        super(name, address, number);
        this.rsiNumber = rsiNumber;
        this.payRate = payRate;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nRSI Number: " +rsiNumber + String.format("\nPaid: €%,.2f" ,pay());
    }
    
    @Override
    public double pay(){
        return payRate;
    }
}
