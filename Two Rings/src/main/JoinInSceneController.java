/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author LENOVO ThinkPad
 */
public class JoinInSceneController implements Initializable {

    @FXML
    private TextField phoneNumTextField;
    @FXML
    private TextField userTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private PasswordField passTextField;
    @FXML
    private Label errorLabel;
    @FXML
    private ComboBox<String> joinAsComboboxFxml;
    @FXML
    private TextField NameTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        joinAsComboboxFxml.getItems().addAll("Bride","Groom","Bride's Withness","Groom's Withness");
        
    }    

    @FXML
    private void joinButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
    }
    
}
