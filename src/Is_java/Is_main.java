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
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author محمود علي خضر
 */
public class Is_main {
    
    @FXML
    private AnchorPane is_id;

    @FXML
    private ToggleGroup s1;

    @FXML
    private ToggleGroup s2;

    @FXML
    private ToggleGroup s3;

    @FXML
    private ToggleGroup s4;

    @FXML
    void Active(ActionEvent event) throws IOException {
   is_id.getScene().getWindow().hide();
            Stage Cs =new Stage();
           Parent root = FXMLLoader.load(getClass().getResource("/IS/DoneDB.fxml"));
        
        Scene scene = new Scene(root);
        
        Cs.setScene(scene);
        Cs.show();
    }

    @FXML
    void DBActive(ActionEvent event) {

    }
}
