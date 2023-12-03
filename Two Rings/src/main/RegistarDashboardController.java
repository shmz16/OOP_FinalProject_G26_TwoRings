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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author LENOVO ThinkPad
 */
public class RegistarDashboardController implements Initializable {

    @FXML
    private TableView<?> dashNotificationTable;
    @FXML
    private TableColumn<?, ?> usernameCol;
    @FXML
    private TableColumn<?, ?> lawyerCol;
    @FXML
    private TableColumn<?, ?> registarCol;
    @FXML
    private TableColumn<?, ?> evenntmanegmentCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void signoutonmousclick(ActionEvent event) throws IOException{
           SceneSwitcher switchTolawyerScene = new SceneSwitcher("SignInScene.fxml", event);
        switchTolawyerScene.ConfirmSceneSwitch();
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
    private void lawyeronclick(ActionEvent event) throws IOException{
           SceneSwitcher switchTolawyerScene = new SceneSwitcher("ResisterLawyerScene.fxml", event);
        switchTolawyerScene.ConfirmSceneSwitch();
    }

    @FXML
    private void customeronclick(ActionEvent event)throws IOException{
           SceneSwitcher switchTolawyerScene = new SceneSwitcher("CostumerAboutScene.fxml", event);
        switchTolawyerScene.ConfirmSceneSwitch();
    }

    @FXML
    private void reloadonclick(ActionEvent event) {
    }
    
}
