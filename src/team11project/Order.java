/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team11project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Copy Center
 */
public class Order {
    private String date;
    private String status;
    private String quantity;
    private ArrayList<String> order = new ArrayList<>();

    public void add_product(String s,Data d){//exception handling not found
        order.add(new String(d.select(s)));
        System.out.println(order);
    }
    
    public void remove_product(String sr){
        for (int i=0; i<order.size();i++){
           if (sr.equals(order.get(i))){
        order.remove(i);
        System.out.println(order);
        }
        }
    }
    
    public void calc_price(Data d){
    int x=0;
    int h=0;
        for(int i=0 ; i<order.size() ; i++){
            x += d.getprice(order.get(i));
        }System.out.println("The total price is " + x);
        for (int i= 0 ; h==0 ; i++){
        System.out.print("Do you want to check out : ");
        Scanner y = new Scanner(System.in);
        boolean answer = y.nextBoolean();
        if (answer == true){
        Payment p = new Payment(x);
        h = p.cash_visa();
        }else {return;}
        } 
        }
}
