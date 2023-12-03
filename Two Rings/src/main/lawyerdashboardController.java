/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

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
        ObservableList<dashBoardTabelModel> notificationarr = FXCollections.observableArrayList();
        
            usernameCol.setCellValueFactory(new PropertyValueFactory<>("user name"));
            lawyerCol.setCellValueFactory(new PropertyValueFactory<>("Lawyer id"));
            registarCol.setCellValueFactory(new PropertyValueFactory<>("Register id"));
            evenntmanegmentCol.setCellValueFactory(new PropertyValueFactory<>("Event manegment"));
            
        
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
             File f = new File("AccountentInfoToCustomer.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            dashBoardTabelModel p;
            try {
                while (true) {
                    p = (dashBoardTabelModel) ois.readObject();
                    notificationarr.add(p);
                }
            } catch (Exception e) {
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }
        }
        dashBoardTabelModel.setItems(notificationarr);
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
