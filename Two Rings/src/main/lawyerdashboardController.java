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
public class lawyerdashboardController implements Initializable {

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
    private void signoutButtonOnclick(ActionEvent event) {
    }

    @FXML
    private void lawyerprofilebuttonOnclick(ActionEvent event)  throws IOException{
        SceneSwitcher toProfileScene = new SceneSwitcher("LawyersProfile.fxml",event);
        toProfileScene.ConfirmSceneSwitch();
    }

    @FXML
    private void lawyerAccountsOnclick(ActionEvent event)  throws IOException{
        SceneSwitcher toProfileScene = new SceneSwitcher("LawyerAccounts.fxml",event);
        toProfileScene.ConfirmSceneSwitch();
    }

    @FXML
    private void scheduleButtonOnclick(ActionEvent event)  throws IOException{
        SceneSwitcher toProfileScene = new SceneSwitcher("lawyerSchedule.fxml",event);
        toProfileScene.ConfirmSceneSwitch();
    }

    @FXML
    private void lawyercustomerButtonOnclick(ActionEvent event)  throws IOException{
        SceneSwitcher toProfileScene = new SceneSwitcher("LawyersCustomer.fxml",event);
        toProfileScene.ConfirmSceneSwitch();
    }

    @FXML
    private void reloadButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void resignationButtonOnclick(ActionEvent event)  throws IOException{
        SceneSwitcher toProfileScene = new SceneSwitcher("LawyerResignation.fxml",event);
        toProfileScene.ConfirmSceneSwitch();
    }

    @FXML
    private void lawyerregisterButtonOnclick(ActionEvent event)  throws IOException{
        SceneSwitcher toProfileScene = new SceneSwitcher("LawyerRegister.fxml",event);
        toProfileScene.ConfirmSceneSwitch();
    }
    
}
