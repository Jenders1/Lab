/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9;

/**
 *
 * @author jenders1
 */
public class PreferredCustomer extends Customer {

    double purchases;
    double discount;

    public PreferredCustomer(int customerNumber, boolean mailingList, String name, String address, String telephone, double purchases) {
        super(customerNumber, mailingList, name, address, telephone);
        this.purchases = purchases;
    }

    public double getDiscount(double p) {
        if (p >= 2000) {
            this.discount = .1;
        } else if (p <= 1999 && p >= 1500) {
            this.discount = .07;
        } else if (p <= 1499 && p >= 1000) {
            this.discount = .06;
        } else if (p <= 999 && p >= 500) {
            this.discount = .05;
        } else {
            this.discount = 0;
        }     
        return this.discount * 100;
    }

}
