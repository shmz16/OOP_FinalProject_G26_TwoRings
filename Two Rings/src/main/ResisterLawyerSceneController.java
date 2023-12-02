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
public class ResisterLawyerSceneController implements Initializable {

    @FXML
    private TableView<LawyerInfoTable> lawyerInfoTable;
    @FXML
    private TableColumn<LawyerInfoTable, String> userNamecol;
    @FXML
    private TableColumn<LawyerInfoTable, String> lawyerIDcol;
    @FXML
    private TableColumn<LawyerInfoTable, String> eventdatecol;
    @FXML
    private TableColumn<LawyerInfoTable, String> locationcol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<LawyerInfoTable> lawyerinfoarr = FXCollections.observableArrayList();
        
           userNamecol.setCellValueFactory(new PropertyValueFactory<>("user name"));
            lawyerIDcol.setCellValueFactory(new PropertyValueFactory<>("lawyerID"));
            eventdatecol.setCellValueFactory(new PropertyValueFactory<>("eventdate"));
            locationcol.setCellValueFactory(new PropertyValueFactory<>("location"));
        
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            File f = new File("LawyerInfoToRegistor.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            LawyerInfoTable p;
            try {
                while (true) {
                    p = (LawyerInfoTable) ois.readObject();
                    lawyerinfoarr.add(p);
                }
            } catch (IOException | ClassNotFoundException e) {
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
        lawyerInfoTable.setItems(lawyerinfoarr);
    }    

    @FXML
    private void backbuttononclick(ActionEvent event)  throws IOException{
           SceneSwitcher switchTo = new SceneSwitcher("RegistarDashboard.fxml", event);
        switchTo.ConfirmSceneSwitch();
    }

    @FXML
    private void signoutbuttononclick(ActionEvent event) throws IOException{
           SceneSwitcher switchTolawyerScene = new SceneSwitcher("SignInScene.fxml", event);
        switchTolawyerScene.ConfirmSceneSwitch();
    }

    @FXML
    private void helpcenteronclick(ActionEvent event) throws IOException{
           SceneSwitcher switchTolawyerScene = new SceneSwitcher("CostumerHelpCenterScene.fxml", event);
        switchTolawyerScene.ConfirmSceneSwitch();
    }

    @FXML
    private void aboutonclick(ActionEvent event)  throws IOException{
           SceneSwitcher switchTolawyerScene = new SceneSwitcher("CostumerAboutScene.fxml", event);
        switchTolawyerScene.ConfirmSceneSwitch();
    }

    @FXML
    private void homebuttononclick(ActionEvent event) throws IOException{
           SceneSwitcher switchTo = new SceneSwitcher("RegistarDashboard.fxml", event);
        switchTo.ConfirmSceneSwitch();
    }
    
}
