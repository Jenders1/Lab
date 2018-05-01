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
public class Chapter9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Customer bob = new Customer(001, true, "bob", "1234 Street", "123-456-7890");
        System.out.println(bob);
        
        PreferredCustomer joe = new PreferredCustomer(002,false,"joe","4321 Drive","098-765-4321",2341);
        System.out.println(joe + " discount is " + joe.getDiscount(2341) + "%");
    }

}
