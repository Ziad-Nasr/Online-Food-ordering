/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team11project;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author Copy Center
 */
public class Data {// Check availability  
    
    private ArrayList <Restaurant> R = new ArrayList<>();
    private ArrayList<Product> items = new ArrayList<>();
    private ArrayList<Product> items1 = new ArrayList<>();
    private ArrayList<Product> items2 = new ArrayList<>();
    
    public void predefined(){
    items.add(new Product("BigTasty", 60.0));
    items.add(new Product("BigMac", 50.0));
    items.add(new Product("Nuggets", 20.0));
    items.add(new Product("Fries", 20.0));
    items.add(new Product("Pepsi", 5.0));
    items.add(new Product("Macdo", 30.0));
    
    R.add(new Restaurant("Macdonalnds","23 Tusk Street","111223","10:00 AM",items));
    
    items1.add(new Product("Zinger", 60.0));
    items1.add(new Product("Twister", 30.0));
    items1.add(new Product("Chicken bucket", 140.0));
    items1.add(new Product("Fries", 20.0));
    items1.add(new Product("Pepsi", 5.0));
    items1.add(new Product("Coleslaw", 10.0));
    
    R.add(new Restaurant("KFC","75 Jamp Street","123123","09:00 AM",items1));
    
    items2.add(new Product("Chicken Ranch", 70.0));
    items2.add(new Product("Chicken Supreme", 70.0));
    items2.add(new Product("Pepperoni", 50.0));
    items2.add(new Product("Cheese Lovers", 50.0));
    items2.add(new Product("Sea Food Lovers", 90.0));
    items2.add(new Product("Margherita", 40.0));
    R.add(new Restaurant("Pizza Hut","99 Milano Street","100099","10:30 AM",items2));   
    
    }
    
    public void search(String r){
        int x=0;
    for(int i=0 ; i<R.size();i++){ 
        if (r.equals(R.get(i).getRest_name())){
           for(int j = 0; j <R.get(i).getItems().size(); j++){
            System.out.println(R.get(i).getItems().get(j).getName()+
                    "\t" + R.get(i).getItems().get(j).getPrice());
            x=1;
        }
    } 
    }if(x==0)
    System.out.println("Restaurant is not found!");
   }
    
   public void display(){
       for(int i=0; i < R.size();i++){
           R.get(i).display();
       }
   }
   
   public String select(String s){
       for(int i=0; i<R.size(); i++){
           for(int j = 0; j <R.get(i).getItems().size(); j++){
               if (s.equals(R.get(i).getItems().get(j).getName())){
               return R.get(i).getItems().get(j).getName();
           }
       }
       }
//       Product x=new Product("Not found",0.0);
       return "Not found";//exception handling ()()()()()(_)
   }
   
   public double getprice(String p){
       for(int i=0; i<R.size(); i++){
           for(int j = 0; j <R.get(i).getItems().size(); j++){
               if (p.equals(R.get(i).getItems().get(j).getName())){
               return R.get(i).getItems().get(j).getPrice();
           }
       }
       }
       return 0.0;
   }
   
       public void add_restaurant(){
           Scanner input = new Scanner(System.in);
           System.out.print("Enter Restaurant Name: ");
           String Name = input.next();
           System.out.print("Enter Restaurant Address: ");
           String a = input.next();
           System.out.print("Enter Restaurant Number: ");
           String number = input.next();
           System.out.print("Enter Restaurant Opening time: ");
           String OP = input.next();
           System.out.print("Enter Restaurant Products' number: ");
           int x=input.nextInt();
           ArrayList <Product> S = new ArrayList<>();
           for (int i=0; i<x; i++){
               System.out.print("Enter the Product and the Price");
               S.add(new Product(input.next(), input.nextDouble()));
           }//exception tany handling spaceeeee!!
           R.add(new Restaurant(Name,a,number,OP, S));
       for(int i=0; i<S.size();i++){ 
       System.out.println(R.get(3).getItems().get(0).getName()
               + "\t" + R.get(3).getItems().get(0).getPrice());
       }
    }
}
