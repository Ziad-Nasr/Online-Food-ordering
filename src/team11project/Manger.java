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
public class Manger extends Person{

    public Manger(String email, String password) {
        super(email, password);
    }
    
    public void add_rest(Data d){
        d.add_restaurant();
    }
}
