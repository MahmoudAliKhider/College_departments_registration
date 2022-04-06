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

/**
 *
 * @author محمود علي خضر
 */
public class AiSudject {

    @FXML
    private RadioButton Aai_id;

    @FXML
    private AnchorPane Aisub_id;

    @FXML
    private RadioButton Kai_id;

    @FXML
    private RadioButton Mai_id;

    @FXML
    private RadioButton Nai_id;

    @FXML
    private RadioButton Rai_id;

    @FXML
    private ToggleGroup t;
     @FXML
     
    void backAction(ActionEvent event) throws IOException {
  Aisub_id.getScene().getWindow().hide();
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
