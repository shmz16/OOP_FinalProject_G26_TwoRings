/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class LawyersProfileController implements Initializable {

    @FXML
    private Label tworingslogolabel;
    @FXML
    private Button helpcenterlabel;
    @FXML
    private Button settingslabel;
    @FXML
    private Button Aboutlabel;
    @FXML
    private Button dashboardlabel;
    @FXML
    private TextField nametextfield;
    @FXML
    private TextField contacttextfield;
    @FXML
    private TextField emailIdtextfield;
    @FXML
    private PasswordField passwordbox;
    @FXML
    private TextArea profiletextarea;
    @FXML
    private DatePicker DOBdatepicker;
    @FXML
    private DatePicker joindatepicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void deletebuttonOnclick(ActionEvent event) {
        profiletextarea.clear();
    }

    @FXML
    private void createbuttonOnclick(ActionEvent event) {
        String name = nametextfield.getText();
        String contact = contacttextfield.getText();
       

try
{
    Integer.parseInt(contact);
}
catch (NumberFormatException ex)
{
     Alert msgbox = new Alert(Alert.AlertType.ERROR);

msgbox.setContentText("Invalid contact number");

msgbox.showAndWait();
    return;
    
}
        String password = passwordbox.getText();
        LocalDate DOB = DOBdatepicker.getValue();
        LocalDate joiningdate= joindatepicker.getValue();
        String email = emailIdtextfield.getText();
        
        
        String outputPassword = "";
for (int i=0; i<password.length(); i++)
{
    outputPassword += "*";
}
        
        
        StringBuilder textToset = new StringBuilder();
        textToset.append("name:").append(name).append("\n");
        textToset.append("contact: ").append(contact).append("\n");
        textToset.append("password").append(outputPassword).append("\n");
      
        textToset.append("DOB: ").append(DOB).append("\n");
        textToset.append("joining date: ").append(joiningdate).append("\n");
        textToset.append("email").append(email);
        
        
        profiletextarea.setText(textToset.toString());
        
        
        
        
        
    }

    @FXML
    private void backbuttonOnclick(ActionEvent event)  throws IOException{
        SceneSwitcher toProfileScene = new SceneSwitcher("lawyer dashboard.fxml",event);
        toProfileScene.ConfirmSceneSwitch();
    }
    
}
