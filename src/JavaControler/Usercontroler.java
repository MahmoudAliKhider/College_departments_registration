/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaControler;

import model.User;
import ser_impelimentation.userservic_imp;

/**
 *
 * @author محمود علي خضر
 */
public class Usercontroler {
    
    private userservic_imp userserviceimp;

    public Usercontroler() {
        userserviceimp= new userservic_imp();
    }
    
   public int login(User user){
       return userserviceimp.login(user);
   } 
}
