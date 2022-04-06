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
public class it_main {
     @FXML
    private AnchorPane it_id;
      @FXML
    private ToggleGroup i1;


    @FXML
    void Co_Gr_Action(ActionEvent event) throws IOException {
it_id.getScene().getWindow().hide();
            Stage Cs =new Stage();
           Parent root = FXMLLoader.load(getClass().getResource("/It/Com_G1.fxml"));
        
        Scene scene = new Scene(root);
        
        Cs.setScene(scene);
        Cs.show();
    }

    @FXML
    void Di_sig_Active(ActionEvent event) throws IOException {
it_id.getScene().getWindow().hide();
            Stage Cs =new Stage();
           Parent root = FXMLLoader.load(getClass().getResource("/It/Digital_Si.fxml"));
        
        Scene scene = new Scene(root);
        
        Cs.setScene(scene);
        Cs.show();
    }

    @FXML
    void ImageP_Action(ActionEvent event) throws IOException {
it_id.getScene().getWindow().hide();
            Stage Cs =new Stage();
           Parent root = FXMLLoader.load(getClass().getResource("/It/Image_pro.fxml"));
        
        Scene scene = new Scene(root);
        
        Cs.setScene(scene);
        Cs.show();
    }

    @FXML
    void Net_Action(ActionEvent event) throws IOException {
it_id.getScene().getWindow().hide();
            Stage Cs =new Stage();
           Parent root = FXMLLoader.load(getClass().getResource("/It/netDone.fxml"));
        
        Scene scene = new Scene(root);
        
        Cs.setScene(scene);
        Cs.show();
    }
    
    @FXML
    void BD_Action(ActionEvent event) {

    }

}
