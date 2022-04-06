
package fx_Controler;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class javaST {
    
    @FXML
    private ToggleGroup ff;
    @FXML
    private AnchorPane java_id;
    
     @FXML
    void backAction(ActionEvent event) throws IOException {
java_id.getScene().getWindow().hide();
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
