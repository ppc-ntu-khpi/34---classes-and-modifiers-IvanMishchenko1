/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.test;

import src.domain.Customers;

public class testCustomers {
   
    public static void main(String args[]){
        Customers d = new Customers();
        d.displayCustomersInfo();
        d.setID(32);
        System.out.println("ID customers: " + d.getID());
        
        d.setIsNew(true);
        System.out.println("Is it new customer: " + d.isIsNew());
        
        d.setTotal(213);
        System.out.println("Total purchases are: " + d.getTotal());   
    }
}
