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
public class Staff {

    StaffMember[] sm;

    public Staff() {
        sm = new StaffMember[]{new Executive("R6576336", 2423.07, "John", "1 This St", "0873423476"), new Employee("P836737839", 1246.16, "Paul", "2 That St", "0854345222"), new Employee("S93347838", 1169.23, "Dave", "3 Other St", "086353637"), new Hourly("T7346478", 10.55, "Joanne", "4th Long Ave.", "0837648478"), new Volunteer("Norma", "5 Short Ave.", "0862567346"), new Volunteer("Kate", "6 Pecks Lane", "085353673"), new Commission(.2, "L3734564", 6.25, "Molly", "7 Nowhere Rd.", "0864537374"), new Commission(.15, "G46738734", 9.75, "Joe", "8 My Place", "0863537838")};
    }

    public void processStaff() {
        for (int i = 0; i < sm.length; i++) {
            if (sm[i] instanceof Commission) {
                    Commission c = (Commission) sm[i];
                    if (c.name.equals("Molly")) {
                        c.addHours(55);
                        c.addSales(400);
                    } else if (c.name.equals("Joe")) {
                        c.addHours(45);
                        c.addSales(950);
                    }
                }else if (sm[i] instanceof Hourly) {
                Hourly h = (Hourly) sm[i];
                if (h.name.equals("Joanne")) {
                    h.addHours(50);
                }
            } else if (sm[i] instanceof Executive) {
                Executive e = (Executive) sm[i];
                if (e.name.equals("John")) {
                    e.awardBonus(500);
                }
            }
        }
    }

    public void payday() {
        for (int i = 0; i < sm.length; i++) {
            System.out.println(sm[i].toString());
            sm[i].pay();
            System.out.println("--------------------------------");
        }
    }
}
