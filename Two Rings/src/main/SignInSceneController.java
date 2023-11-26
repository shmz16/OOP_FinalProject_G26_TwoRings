package main;

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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author LENOVO ThinkPad
 */
public class SignInSceneController implements Initializable {

    @FXML
    private TextField passcodeTextField;
    @FXML
    private Label errorLabel;
    @FXML
    private TextField userNameTextField;
    @FXML
    private AnchorPane forgetPasswordLabel;
    @FXML
    private Label errorLabel1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void signInButtonOnClick(ActionEvent event){
        String username = userNameTextField.getText();
        String password = passcodeTextField.getText();
        
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    @FXML
    private void creatAccountButtonOnClick(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("JoinInScene.fxml"));
        Parent openingPageParent = loader.load();
        Scene openingPageScene = new Scene(openingPageParent);
        Stage openingPageStage = (Stage) userNameTextField.getScene().getWindow();
        openingPageStage.setScene(openingPageScene);
        openingPageStage.show();
    }
    
}
