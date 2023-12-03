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

/**
 * FXML Controller class
 *
 * @author User
 */
public class ZeroZeroController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void joinAsWitnessButton(ActionEvent event) throws IOException {
        SceneSwitcher toWitnessPage = new SceneSwitcher("WitnessPage2.fxml", event);
        toWitnessPage.ConfirmSceneSwitch();
    }

    @FXML
    private void customerLoginButton(ActionEvent event) throws IOException {
        SceneSwitcher toCustomerScene = new SceneSwitcher("CustomerSignInScene.fxml", event);
        toCustomerScene.ConfirmSceneSwitch();
    }

    @FXML
    private void contactUsButton(ActionEvent event) {
    }

    @FXML
    private void employeeLoginButton(ActionEvent event) throws IOException{
        SceneSwitcher toEmployeeLoginScene = new SceneSwitcher("EmployeeSignInScene.fxml", event);
        toEmployeeLoginScene.ConfirmSceneSwitch();
    }

    @FXML
    private void adminLoginButton(ActionEvent event) throws IOException {
        SceneSwitcher toCEOLoginScene = new SceneSwitcher("CEOSignInScene.fxml", event);
        toCEOLoginScene.ConfirmSceneSwitch();
    }
    
}
