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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author LENOVO ThinkPad
 */
public class RegistarDashboardController implements Initializable {

    @FXML
    private TableView<dashBoardTabelModel> dashNotificationTable;
    @FXML
    private TableColumn<dashBoardTabelModel, String> usernameCol;
    @FXML
    private TableColumn<dashBoardTabelModel, String> lawyerCol;
    @FXML
    private TableColumn<dashBoardTabelModel, String> registarCol;
    @FXML
    private TableColumn<dashBoardTabelModel, String> evenntmanegmentCol;

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
    
}
