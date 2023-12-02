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
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class LawyerRegisterController implements Initializable {

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
    private TextField IDtextfield;
    @FXML
    private TextField addresstextfield;
    @FXML
    private DatePicker DOEdatepicker;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showButtonOnclick(ActionEvent event) {
        
        String name = nametextfield.getText();
        String employeeID = IDtextfield.getText();
        String location = addresstextfield.getText();
        LocalDate date = DOEdatepicker.getValue();
        
        
        
        
        
        
    }

    @FXML
    private void backbuttononclick(ActionEvent event)  throws IOException{
        SceneSwitcher toProfileScene = new SceneSwitcher("lawyer dashboard.fxml",event);
        toProfileScene.ConfirmSceneSwitch();
    }
    
}
