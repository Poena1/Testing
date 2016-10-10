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
public class Volunteer extends StaffMember{

    public Volunteer(String name, String address, String number) {
        super(name, address, number);
    }
    
    @Override
    public double pay(){
        return 0;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nThanks!";
    }
}
