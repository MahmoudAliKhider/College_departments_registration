

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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class cs_controler implements Initializable{

    @FXML
    private Label label;
    @FXML
    private RadioButton Ai_id;
    @FXML
    private ToggleGroup tg_g;
    @FXML
    private RadioButton Hsof_2;
    @FXML
    private ToggleGroup so;
    @FXML
    private RadioButton sof_2;
    @FXML
    private ToggleGroup so3;
    @FXML
    private ToggleGroup fx;
    @FXML
    private ToggleGroup kk;

    @FXML
    private AnchorPane Subject;
    
      @FXML
    void AiDone(ActionEvent event) throws IOException {

        
          Subject.getScene().getWindow().hide();
            Stage Cs =new Stage();
           Parent root = FXMLLoader.load(getClass().getResource("/frontend/AiFXML.fxml"));
        
        Scene scene = new Scene(root);
        
        Cs.setScene(scene);
        Cs.show();
    }
     @FXML
    void soDone(ActionEvent event) throws IOException {

          Subject.getScene().getWindow().hide();
            Stage Cs =new Stage();
           Parent root = FXMLLoader.load(getClass().getResource("/frontend/So_St.fxml"));
        
        Scene scene = new Scene(root);
        
        Cs.setScene(scene);
        Cs.show();
    }
@FXML
    void os_2Done(ActionEvent event) throws IOException {
 Subject.getScene().getWindow().hide();
            Stage Cs =new Stage();
           Parent root = FXMLLoader.load(getClass().getResource("/frontend/os_2ST.fxml"));
        
        Scene scene = new Scene(root);
        
        Cs.setScene(scene);
        Cs.show();
    }
     @FXML
    void javaAction(ActionEvent event) throws IOException {

        
        Subject.getScene().getWindow().hide();
            Stage Cs =new Stage();
           Parent root = FXMLLoader.load(getClass().getResource("/frontend/javaFXML.fxml"));
        
        Scene scene = new Scene(root);
        
        Cs.setScene(scene);
        Cs.show();
    }
    //Action Database
    @FXML
    private Button DBAction;
    
    @FXML
    void DBAction(ActionEvent event) {

    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    
    
    }
    
  
 
}
