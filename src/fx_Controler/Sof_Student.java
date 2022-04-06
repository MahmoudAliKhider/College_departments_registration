/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx_Controler;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Sof_Student {
     @FXML
    private RadioButton Hsof_2;
 
   @FXML
    private AnchorPane Sof_id;

    @FXML
    private ToggleGroup so;
    
    @FXML
    void backAction(ActionEvent event) throws IOException {
 Sof_id.getScene().getWindow().hide();
            Stage Cs =new Stage();
     Parent root = FXMLLoader.load(getClass().getResource("/frontend/CS.fxml"));
        
        Scene scene = new Scene(root);
        Cs.setScene(scene);
        Cs.show();
        
        
    }
@FXML
    void DBAction(ActionEvent event) {

    }


}
