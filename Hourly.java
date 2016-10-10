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
public class Hourly extends Employee{
    private int hours;

    public Hourly(String rsiNumber, double payRate, String name, String address, String number) {
        super(rsiNumber, payRate, name, address, number);
        this.hours = 0;
    }
    
    public void addHours(int hours){
        this.hours=hours;
    }
    
    @Override
    public double pay(){
        int otHours=0;
        if(hours>40){
            otHours=hours-40;
        }
        double pay=(hours-otHours)*payRate+(otHours*payRate*1.5);
        return pay;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nCurrent Hours: " +hours;
    }
}
