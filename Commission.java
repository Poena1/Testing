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
public class Commission extends Hourly{
    private double totalSales, commissionRate;

    public Commission(double commissionrate, String rsiNumber, double payRate, String name, String address, String number) {
        super(rsiNumber, payRate, name, address, number);
        this.commissionRate = commissionrate;
        this.totalSales=0;
    }
    
    public void addSales(int sales){
        this.totalSales=sales;
    }
    
    @Override
    public double pay(){
        return super.pay()+(totalSales*commissionRate);
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nTotal Sales: " +totalSales;
    }
}
