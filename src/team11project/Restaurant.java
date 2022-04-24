/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team11project;
import java.util.*;

/**
 *
 * @author Copy Center
 */
public class Restaurant {
    private String rest_name;
    private String address;
    private String phone_number;
    private String Opening;
    private ArrayList <Product> items = new ArrayList<Product>();
    
    public Restaurant(String Name, String address, String num, String Open, ArrayList<Product> Item){
        rest_name = Name;
        this.address = address;
        phone_number = num;
        Opening = Open;
        items = Item;
    }

    public String getRest_name() {
        return rest_name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public ArrayList<Product> getItems() {
        return items;
    }
    
        public void display(){
        System.out.println("Restaurant: "+ rest_name + "\n\nAddress: " + address + "\nNumber: " 
        + phone_number + "\nOpenning time: " + Opening + "\n\n");
    }
}
