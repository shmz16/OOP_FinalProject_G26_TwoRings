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
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class LoginPageController implements Initializable {

    Alert a = new Alert(Alert.AlertType.WARNING);
    @FXML
    private Label ShowInLabel;
    @FXML
    private TextField userIdTextfield;
    @FXML
    private TextField userPassTextField;
    @FXML
    private ComboBox<String> userTypeCombo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String[] typesOfEmployee = {"Customer", "Lawyer", "Register", "Marketing Maneger", "Event Maneger", "Accountant", "CEO"};
        userTypeCombo.getItems().addAll(typesOfEmployee);

//        if (userTypeCombo.getValue().equals("Witness")) {
//            userIdTextfield.disableProperty();
//            userPassTextField.disableProperty();
//        }
    }

    @FXML
    private void logInbutton(ActionEvent event) throws IOException {
        String userType = userTypeCombo.getValue();
        CEO ceo = new CEO();
        int userId = Integer.parseInt(userIdTextfield.getText());
        String password = userPassTextField.getText();
//        #1
        if (userType.equals("CEO")) {
            if (password.equals(ceo.getCeoPass()) && (userId == (ceo.getId()))) {
                SceneSwitcher ceoDashboard = new SceneSwitcher("CEOpage.fxml", event);
                ceoDashboard.ConfirmSceneSwitch();
            }
//            #2
        } else if (userType.equals("Laywer")) {

//            Give this                                             
            if ("Your_User_password()Fixed".equals(password) && (userId == 78)) {
                SceneSwitcher lawyerDash = new SceneSwitcher("EnterYourLawyerPage_FXML_File_Here.fxml", event);
                lawyerDash.ConfirmSceneSwitch();
            }
//            #3
        } else if (userType.equals("Register")) {

//            Give this                                             
            if ("Your_User_password()Fixed".equals(password) && (userId == 78)) {
                SceneSwitcher RegisterDash = new SceneSwitcher("EnterYour_RegisterPage_FXML_File_Here.fxml", event);
                RegisterDash.ConfirmSceneSwitch();
            }
//            #4
        } else if (userType.equals("Marketing Maneger")) {

//            Give this                                             
            if ("Your_User_password()Fixed".equals(password) && (userId == 78)) {
                SceneSwitcher mrketingDash = new SceneSwitcher("EnterYour_Marketing Maneger_FXML_File_Here.fxml", event);
                mrketingDash.ConfirmSceneSwitch();
            }
//            #5
        } else if (userType.equals("Event Maneger")) {

//            Give this                                             
            if ("Your_User_password()Fixed".equals(password) && (userId == 78)) {
                SceneSwitcher eventManegerPage = new SceneSwitcher("EnterYour_Event Maneger_Page_FXML_File_Here.fxml", event);
                eventManegerPage.ConfirmSceneSwitch();
            }
//            6 No user
        } else if (userType.equals("Accountant")) {

//            Give this                                             
            if ("Your_User_password()Fixed".equals(password) && (userId == 78)) {
                SceneSwitcher accountDash = new SceneSwitcher("EnterYour_Accountant_FXML_File_Here.fxml", event);
                accountDash.ConfirmSceneSwitch();
            }
//            7 no User
        } else if (userType.equals("Customer")) {

//            Give this                                             
            if ("Your_User_password()Fixed".equals(password) && (userId == 78)) {
                SceneSwitcher CustomerDash = new SceneSwitcher("EnterYour_CustomerDash_FXML_File_Here.fxml", event);
                CustomerDash.ConfirmSceneSwitch();
            }
//            8 no User
        }

        ShowInLabel.setText("yes, Login is Succesful!!");
    }

    @FXML
    private void witnessDashOnClickBt(ActionEvent event) throws IOException {
        SceneSwitcher WitnessDas = new SceneSwitcher("CEOpage.fxml", event);
        WitnessDas.ConfirmSceneSwitch();
    }

    @FXML
    private void closeApplicationOnClick(ActionEvent event) throws IOException {
        SceneSwitcher closeLoginScene = new SceneSwitcher("WitnessPage2.fxml", event);
        closeLoginScene.closeScene();
        
    }

}
