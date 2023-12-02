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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class lawyerScheduleController implements Initializable {

    @FXML
    private Label tworingslogolabel;
    @FXML
    private Button helpcenterlabel;
    @FXML
    private Button settingslabel;
    @FXML
    private Button aboutlabel;
    @FXML
    private Button profilelabel;
    @FXML
    private DatePicker datepicker;
    @FXML
    private TextField brideusername;
    @FXML
    private TextField groomusername;
    @FXML
    private TextField IDtextfield;
    @FXML
    private TableView<?> lawyertable;
    @FXML
    private TableColumn<?, ?> brideusertablecolumn;
    @FXML
    private TableColumn<?, ?> groomusercolumn;
    @FXML
    private TableColumn<?, ?> marriagedatecolumn;
    @FXML
    private TableColumn<?, ?> registarIDcolumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backbuttonOnClick(ActionEvent event)  throws IOException{
        SceneSwitcher toProfileScene = new SceneSwitcher("lawyer dashboard.fxml",event);
        toProfileScene.ConfirmSceneSwitch();
    }

    @FXML
    private void addButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void signoutbuttonOnclick(ActionEvent event) {
    }

    @FXML
    private void savebuttonOnclick(ActionEvent event) {
    }

    @FXML
    private void reloadButtonOnclick(ActionEvent event) {
    }
    
}
