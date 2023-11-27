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
import javafx.fxml.FXMLLoader;
import java.io.IOException;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AccountantDashboardSceneController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void viewProfitsButtonOnClick(ActionEvent event) throws IOException {
        SceneSwitcher switchToViewProfitsScene = new SceneSwitcher("AccountantViewProfitsScene.fxml", event);
        switchToViewProfitsScene.ConfirmSceneSwitch();
    }

    @FXML
    private void viewSalaryListButtonOnClick(ActionEvent event) throws IOException {
        SceneSwitcher switchToViewSalaryScene = new SceneSwitcher("AccountantCheckSalariesScene.fxml", event);
        switchToViewSalaryScene.ConfirmSceneSwitch();
    }

    @FXML
    private void adjustRecordsButtonOnClick(ActionEvent event) throws IOException {
        SceneSwitcher switchToAdjustRecordsScene = new SceneSwitcher("AccountantAdjustRecordsScene.fxml", event);
        switchToAdjustRecordsScene.ConfirmSceneSwitch();
    }

    @FXML
    private void eventVenuesButtonOnClick(ActionEvent event) throws IOException {
        SceneSwitcher switchToEventVenuesScene = new SceneSwitcher("AccountantEventVenuesCostScene.fxml", event);
        switchToEventVenuesScene.ConfirmSceneSwitch();
    }

    @FXML
    private void viewServiceChargesButtonOnClick(ActionEvent event) throws IOException {
        SceneSwitcher switchToCheckServiceCostsScene = new SceneSwitcher("AccountantCheckServiceCostsScene.fxml", event);
        switchToCheckServiceCostsScene.ConfirmSceneSwitch();
    }

    @FXML
    private void packageServiceButtonOnClick(ActionEvent event) throws IOException {
        SceneSwitcher switchToPackageServiceScene = new SceneSwitcher("AccountantPackageServiceScene.fxml", event);
        switchToPackageServiceScene.ConfirmSceneSwitch();
    }
    
}
