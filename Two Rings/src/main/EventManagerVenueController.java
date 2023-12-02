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
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class EventManagerVenueController implements Initializable {

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
    private ListView<?> venuelist;
    @FXML
    private ListView<?> menulist;
    @FXML
    private ListView<?> otherslist;
    @FXML
    private Label menulabel;
    @FXML
    private Label otherslabel;
    @FXML
    private Label venuelabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backbuttononclick(ActionEvent event)  throws IOException{
        SceneSwitcher toProfileScene = new SceneSwitcher("EventManager Dashboard.fxml",event);
        toProfileScene.ConfirmSceneSwitch();
    }
    
}
