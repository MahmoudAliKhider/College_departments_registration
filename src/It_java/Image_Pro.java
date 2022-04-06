/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package It_java;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author محمود علي خضر
 */
public class Image_Pro {
    
    @FXML

    private ToggleGroup I1;

    @FXML
    private AnchorPane IMage_id;

   
    @FXML
    void back_Action(ActionEvent event) throws IOException {
IMage_id.getScene().getWindow().hide();
            Stage Cs =new Stage();
           Parent root = FXMLLoader.load(getClass().getResource("/It/it_FXML.fxml"));
        
        Scene scene = new Scene(root);
        
        Cs.setScene(scene);
        Cs.show();
    }
    
     @FXML
    void DB_Action(ActionEvent event) throws IOException {

    }

    
}
