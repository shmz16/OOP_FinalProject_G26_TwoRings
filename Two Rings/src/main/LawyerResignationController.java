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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class LawyerResignationController implements Initializable {

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
    private TextArea reasontextarea;
    @FXML
    private TextField nametextfield;
    @FXML
    private TextField IDtextfield;
    @FXML
    private TextField contacttextfield;
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
    private void submitButtonOnclick(ActionEvent event) {
        String name = nametextfield.getText();
        String ID = IDtextfield.getText();
        
        

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
        LocalDate joindate = joindatepicker.getValue();
        String reason = reasontextarea.getText();
        
        StringBuilder textToset = new StringBuilder();
        textToset.append("name: ").append(name).append("\n");
        textToset.append("ID: ").append(ID).append("\n");
        textToset.append("contact: ").append(contact).append("\n");
        textToset.append("joindate: ").append(joindate).append("\n");
        textToset.append("your reason for leaving: ").append(reason);
        
        reasontextarea.setText(textToset.toString());
    }

    @FXML
    private void backbuttonOnclick(ActionEvent event)  throws IOException{
        SceneSwitcher toProfileScene = new SceneSwitcher("lawyer dashboard.fxml",event);
        toProfileScene.ConfirmSceneSwitch();
    }
    
}
