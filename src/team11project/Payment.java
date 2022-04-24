/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team11project;

import java.util.Scanner;

/**
 *
 * @author Copy Center
 */
public class Payment {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }
    
    
    public int cash_visa(){
        System.out.println("Pay 1)Cash \t 2)VISA: ");
        Scanner input = new Scanner(System.in);
        int z = input.nextInt();
        double pay2;
        switch(z){
            case 1: pay2 = amount + 30.0;
            System.out.println("Total payment via cash : " + pay2);
            return 1;
            case 2: System.out.print("Enter VISA number : ");
            String v = input.next();
            if (v.length()>13 || v.length()<13){
                System.out.println("Invalid VISA number");
                return 0;
            }
            System.out.print("Enter the CVV : ");
            String cvv = input.next();
            if (cvv.length()>3 || cvv.length()<3){
                System.out.println("Invalid CVV number");
                return 0;
            }
            pay2 = amount + 10.0;
            System.out.println("Total payment via VISA : " + pay2);
        return 1;}
    return 9;}
}
