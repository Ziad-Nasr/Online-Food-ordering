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
public abstract class Person {
    private String name;
    private String address;
    private String number;
    private String email;
    private String password;
    private ArrayList<Client> C = new ArrayList<>();

    public Person() {
    }
    
    public Person(String name, String address, String number, String email, String password) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.email = email;
        this.password = password;
    }

    public Person(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void Predefinedperson(){
        C.add(new Client("Ahmed","21 Jamp St","010","d9f4@gmail.com","123dod"));
        C.add(new Client("Sara","22 Jamp St","012","sara3@gmail.com","300bu"));
    }
    
     public int login(){
         Manger m = new Manger("Otlob@gmail.com","01234");
         Scanner Scan=new Scanner(System.in);
      for(int j=0 ; j<3;j++){
          System.out.print("Enter the E-mail : ");
         String e = Scan.next();
         System.out.print("Enter the Password : ");
         String p = Scan.next();
         if(e.equals(m.getEmail())){
             if(p.equals(m.getPassword()))
             System.out.println("Welcome Manger!"); 
        return 1;}
        for (int i=0; i<C.size(); i++){
         if (e.equals(C.get(i).getEmail())){
         if (p.equals(C.get(i).getPassword())){
             System.out.println("Found");
             return 1;
         }
         else System.out.println("Invalid password");
        }
    }System.out.println("Invalid Email");
     }
      System.out.println("Not found"); 
     return 1;}
     
     public void register(){
         Scanner Scan=new Scanner(System.in);
         System.out.print("Enter your Name : ");
         String name = Scan.next();
         System.out.print("Enter the Address : ");
         String address = Scan.next();
         System.out.print("Enter the Number : ");
         String num = Scan.next();
         System.out.print("Enter new E-mail : ");
         String e = Scan.next();
         System.out.print("Enter new Password : ");
         String p = Scan.next();
         C.add(new Client(name,address,num,e,p));
         System.out.println("Registered");
     }
     
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
     
    
    public void display_acc(){
        for ( int i=0; i<C.size(); i++){
          System.out.println("Name: " + name + "\nAddress: " + address 
                + "\nNumber: " + number + "\nEmail: " + email);  
        }
    }
}
