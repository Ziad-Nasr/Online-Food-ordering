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
public class Staff {
    private final String contact_number = "07775000";
    private final String contact_email = "staff_eng@eng.asu.edu.eg";

//    public Staff(String email, String password) {
//        super(email, password);
//    }
    
    public void contact_client(){
        System.out.println("Staff Number: " + contact_number + "\nStaff Email: " + contact_email);
    }
}
