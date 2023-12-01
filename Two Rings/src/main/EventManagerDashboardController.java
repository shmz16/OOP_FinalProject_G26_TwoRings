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
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class EventManagerDashboardController implements Initializable {

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void EMProfileButtonOnClick(ActionEvent event) throws IOException{
        SceneSwitcher toProfileScene = new SceneSwitcher("EventManagerProfile.fxml",event);
        toProfileScene.ConfirmSceneSwitch();
    }

    @FXML
    private void EMAccountsButtonOnCLick(ActionEvent event)  throws IOException{
        SceneSwitcher toProfileScene = new SceneSwitcher("EventManagerAccountant.fxml",event);
        toProfileScene.ConfirmSceneSwitch();
    }

    @FXML
    private void EMVenueButtonOnClick(ActionEvent event)  throws IOException{
        SceneSwitcher toProfileScene = new SceneSwitcher("EventManagersVenue.fxml",event);
        toProfileScene.ConfirmSceneSwitch();
    }

    @FXML
    private void EMCustomersButtonOnClick(ActionEvent event)  throws IOException{
        SceneSwitcher toProfileScene = new SceneSwitcher("EventManagerCustomer.fxml",event);
        toProfileScene.ConfirmSceneSwitch();
    }

    @FXML
    private void EMreloadButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void EMVendorsButtonOnclick(ActionEvent event) {
    }
    
}
