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
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author LENOVO ThinkPad
 */
public class CostumerAboutSceneController implements Initializable {

    @FXML
    private Label aboutLabel;
    @FXML
    private TextArea aboutusFX;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Policy us = new Policy();
        aboutusFX.clear();
        aboutusFX.setText(us.getAboutUs());
        // TODO
    }    

    @FXML
    private void signOutButtonOnClick(ActionEvent event) throws IOException{
           SceneSwitcher switchTo = new SceneSwitcher("SignInScene.fxml", event);
        switchTo.ConfirmSceneSwitch();
    }

    @FXML
    private void helpcenteronclick(ActionEvent event) throws IOException{
           SceneSwitcher switchTo = new SceneSwitcher("CostumerHelpCenterScene.fxml", event);
        switchTo.ConfirmSceneSwitch();
    }

    @FXML
    private void homebuttononclick(ActionEvent event) throws IOException{
           SceneSwitcher switchTo = new SceneSwitcher("CostumerDashBoardScene.fxml", event);
        switchTo.ConfirmSceneSwitch();
    }
    
}
