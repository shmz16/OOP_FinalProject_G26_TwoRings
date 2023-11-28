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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class CEOpageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void financeReportOnClick(ActionEvent event) throws IOException {
        
        
        Parent sceneA = FXMLLoader.load(getClass().getResource("FinanceReport.fxml"));
        Scene sceneB = new Scene(sceneA);

        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg.setTitle("I am Back!!");
        stg.setScene(sceneB);
        stg.show();
    }

    @FXML
    private void employeeReportOnClick(ActionEvent event) throws IOException {
        SceneSwitcher empReport = new SceneSwitcher("Employee Report.fxml", event);
        empReport.ConfirmSceneSwitch();

    }

    @FXML
    private void employeeListOnClick(ActionEvent event) throws IOException {
        Parent sceneA = FXMLLoader.load(getClass().getResource("ViewEmployeeList.fxml"));
        Scene sceneB = new Scene(sceneA);

        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg.setTitle("I am Back!!");
        stg.setScene(sceneB);
        stg.show();
        
    }

    @FXML
    private void addNewEmployeeOnClick(ActionEvent event) throws IOException {

        SceneSwitcher addNewEmployeeSc = new SceneSwitcher("AddNewEmployee.fxml", event);
        addNewEmployeeSc.ConfirmSceneSwitch();


    }

    @FXML
    private void updatePolicyOnClick(ActionEvent event) throws IOException {
        SceneSwitcher policySc = new SceneSwitcher("Update Policy.fxml", event);
        policySc.ConfirmSceneSwitch();

    }

    @FXML
    private void bookMetting(ActionEvent event) {
    }

    @FXML
    private void testWitnes(ActionEvent event) throws IOException {
        
        SceneSwitcher witnesSC = new SceneSwitcher("WitnessPage2.fxml", event);
        witnesSC.ConfirmSceneSwitch();
    }

}