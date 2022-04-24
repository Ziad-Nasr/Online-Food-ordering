/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team11project;

/**
 *
 * @author Copy Center
 */
public class Product {
    private String name;
    private Double price;
    //int rating; **********************
    
 public Product(String name, Double price){
     this.name=name;
     this.price=price;
 }    

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
 
}
