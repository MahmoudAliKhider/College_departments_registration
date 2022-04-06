/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx_Controler;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;

/**
 *
 * @author محمود علي خضر
 */
public class Login implements Initializable {
 
     @FXML
    private TextField ID;
    //private AnchorPane Login;
    

    @FXML
    private TextField userName;
    @FXML
    private AnchorPane Loginn;
    @FXML
    void loginAction(ActionEvent event) throws IOException  {
        
            Loginn.getScene().getWindow().hide();
            Stage Cs =new Stage();
           Parent root = FXMLLoader.load(getClass().getResource("/frontend/CS.fxml"));
        
        Scene scene = new Scene(root);
        
        Cs.setScene(scene);
        Cs.show();
        
            
            
    }
    @FXML
    void IS_Action(ActionEvent event) throws IOException {
 Loginn.getScene().getWindow().hide();
            Stage Cs =new Stage();
           Parent root = FXMLLoader.load(getClass().getResource("/IS/Is_main.fxml"));
        
        Scene scene = new Scene(root);
        
        Cs.setScene(scene);
        Cs.show();
    }
    @FXML
    void it_Action(ActionEvent event) throws IOException {
Loginn.getScene().getWindow().hide();
            Stage Cs =new Stage();
           Parent root = FXMLLoader.load(getClass().getResource("/It/it_FXML.fxml"));
        
        Scene scene = new Scene(root);
        
        Cs.setScene(scene);
        Cs.show();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
}
