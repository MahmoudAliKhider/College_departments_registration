/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dsqule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DBconection {
        
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    private static final String URL = "jdbc:mysql://localhost:3306/student";
    private static Connection connection = null;

    // Connection With DBconection
    public static Connection connect() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(
                     URL, USERNAME, PASSWORD); 
            //JOptionPane.showMessageDialog(null, "Conect");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBconection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBconection.class.getName()).log(Level.SEVERE, null, ex);
        }
         return connection;
    }
}



