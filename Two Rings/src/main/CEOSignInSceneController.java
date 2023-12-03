/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author LENOVO ThinkPad
 */
public class CEOSignInSceneController implements Initializable {

    @FXML
    private AnchorPane forgetPasswordLabel;
    @FXML
    private TextField passcodeTextField;
    @FXML
    private TextField ceoIdTextField;
    @FXML
    private Label loginFailedLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void signInButtonOnClick(ActionEvent event) throws IOException {
        CEO ceo = new CEO();
        if (ceo.getId() == Integer.parseInt(ceoIdTextField.getText()) && passcodeTextField.getText().equals(ceo.getCeoPass())) {
            SceneSwitcher ceoDashboard = new SceneSwitcher("CEOpage.fxml", event);
            ceoDashboard.ConfirmSceneSwitch();
        }
        else {
            loginFailedLabel.setText("ID or password invalid. try again");
        }
    }
    
}
