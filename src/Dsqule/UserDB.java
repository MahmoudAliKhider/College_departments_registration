/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dsqule;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;
public class UserDB {
    private Connection con=null;
    
    private String sql= null;

    private PreparedStatement prepare=null;
     private ResultSet result =null;
    
    public UserDB() {
    }
    
    
    
    public int Sign_up(User user){
        con=DBconection.connect();
        sql="SELECT id,username FROM USER WHERE username = ? and id= ?";
        try {
            prepare = con.prepareStatement(sql);
            prepare.setString(1, user.getUsername());
            prepare.setInt(2, user.getId());
            result =prepare.executeQuery();
        //    result.next();
            if(result.next()){
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
        
    }
}
