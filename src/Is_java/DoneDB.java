/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Is_java;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author محمود علي خضر
 */
public class DoneDB {
     @FXML
    private AnchorPane DB_id;

    @FXML
    void DB_Actiom(ActionEvent event) throws IOException {

    }

    @FXML
    void DoneAction(ActionEvent event) throws IOException {
DB_id.getScene().getWindow().hide();
            Stage Cs =new Stage();
           Parent root = FXMLLoader.load(getClass().getResource("/IS/D_mining.fxml"));
        
        Scene scene = new Scene(root);
        
        Cs.setScene(scene);
        Cs.show();
    }
     @FXML
    void BackAction(ActionEvent event) throws IOException {
DB_id.getScene().getWindow().hide();
            Stage Cs =new Stage();
           Parent root = FXMLLoader.load(getClass().getResource("/IS/Is_main.fxml"));
        
        Scene scene = new Scene(root);
        
        Cs.setScene(scene);
        Cs.show();
        
        
    }
}
