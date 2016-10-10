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
public abstract class StaffMember {
    protected String name, address, number;

    public StaffMember(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }
    
    @Override
    public String toString(){
        return "Name: " +name + "\nAddress: " +address + "\nPhone: " +number;
    }
    
    public abstract double pay();
}
