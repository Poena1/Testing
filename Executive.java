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
public class Executive extends Employee{
    private double bonus;

    public Executive(String rsiNumber, double payRate, String name, String address, String number) {
        super(rsiNumber, payRate, name, address, number);
        bonus = 0;
    }
    
    public void awardBonus(double amount){
        bonus=amount;
    }
    
    @Override
    public double pay(){
        return super.pay()+bonus;
    }
}
