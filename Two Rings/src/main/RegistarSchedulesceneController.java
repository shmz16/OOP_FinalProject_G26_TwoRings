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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author LENOVO ThinkPad
 */
public class RegistarSchedulesceneController implements Initializable {

    @FXML
    private DatePicker datepik;
    @FXML
    private TextField brideusernametext;
    @FXML
    private TextField groomusertext;
    @FXML
    private TextField idtextfield;
    @FXML
    private TableView<?> schedulelisttable;
    @FXML
    private TableColumn<?, ?> brideusernamecol;
    @FXML
    private TableColumn<?, ?> groomusernamecol;
    @FXML
    private TableColumn<?, ?> marriagedatecol;
    @FXML
    private TableColumn<?, ?> registeridcol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void helpcenteronclick(ActionEvent event) throws IOException{
           SceneSwitcher switchTolawyerScene = new SceneSwitcher("CostumerHelpCenterScene.fxml", event);
        switchTolawyerScene.ConfirmSceneSwitch();
    }

    @FXML
    private void aboutbuttononclick(ActionEvent event) throws IOException{
           SceneSwitcher switchTolawyerScene = new SceneSwitcher("CostumerAboutScene.fxml", event);
        switchTolawyerScene.ConfirmSceneSwitch();
    }

    @FXML
    private void profileonclick(ActionEvent event) throws IOException{
           SceneSwitcher switchTolawyerScene = new SceneSwitcher("RegistarDashboard.fxml", event);
        switchTolawyerScene.ConfirmSceneSwitch();
    }

    @FXML
    private void backonclick(ActionEvent event) throws IOException{
           SceneSwitcher switchTolawyerScene = new SceneSwitcher("RegistarDashboard.fxml", event);
        switchTolawyerScene.ConfirmSceneSwitch();
    }

    @FXML
    private void addonclick(ActionEvent event) {
    }

    @FXML
    private void signoutonclick(ActionEvent event) throws IOException{
           SceneSwitcher switchTolawyerScene = new SceneSwitcher("SignInScene.fxml", event);
        switchTolawyerScene.ConfirmSceneSwitch();
    }

    @FXML
    private void saveonclick(ActionEvent event) {
    }

    @FXML
    private void reloadpnclick(ActionEvent event) {
    }
    
}
