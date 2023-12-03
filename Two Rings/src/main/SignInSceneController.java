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
    private AnchorPane forgetPasswordLabel;
    @FXML
    private Label errorLabel1;
    @FXML
    private TextField employeeIDTextField;
    @FXML
    private Label errorLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void signInButtonOnClick(ActionEvent event)throws IOException{
         SceneSwitcher switchTo = new SceneSwitcher("CostumerDashBoardScene.fxml", event);
         switchTo.ConfirmSceneSwitch();
//        String username = userNameTextField.getText();
//        String password = passcodeTextField.getText();
//        
//        System.out.println("Username: " + username);
//        System.out.println("Password: " + password);
          
    }

    
}
