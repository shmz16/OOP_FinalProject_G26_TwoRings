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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author LENOVO ThinkPad
 */
public class CostumerDashBoardSceneController implements Initializable {

    @FXML
    private TableView<CustomerNotificationTable> userDashNotificationTable;
    @FXML
    private TableColumn<CustomerNotificationTable, String> notificationCol;







    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void lawyerButtonOnClick(ActionEvent event) throws IOException{
           SceneSwitcher switchTolawyerScene = new SceneSwitcher("CostumesLawyerScene.fxml", event);
        switchTolawyerScene.ConfirmSceneSwitch();
    }

    @FXML
    private void eventManegButtonOnClick(ActionEvent event) throws IOException{
           SceneSwitcher switchTo = new SceneSwitcher("CostumerEventManegmennt.fxml", event);
        switchTo.ConfirmSceneSwitch();
    }

    @FXML
    private void hmOfferButtonOnClick(ActionEvent event) throws IOException{
           SceneSwitcher switchTo = new SceneSwitcher("CostumesHoneymoonOfferScene.fxml", event);
        switchTo.ConfirmSceneSwitch();
    }

    @FXML
    private void marriagePackageButtonOnClick(ActionEvent event)throws IOException{
           SceneSwitcher switchTo = new SceneSwitcher("CostumerMarriagePackageLIstScene.fxml", event);
        switchTo.ConfirmSceneSwitch();
    }

    @FXML
    private void registarbuttonOnClick(ActionEvent event) throws IOException{
           SceneSwitcher switchTo = new SceneSwitcher("CostumesRegistarScene.fxml", event);
        switchTo.ConfirmSceneSwitch();
    }

    @FXML
    private void witnessButtononClick(ActionEvent event) throws IOException{
           SceneSwitcher switchTo = new SceneSwitcher("CostumerWitness.fxml", event);
        switchTo.ConfirmSceneSwitch();
    }

    @FXML
    private void signOutOnClick(ActionEvent event) throws IOException{
           SceneSwitcher switchTo = new SceneSwitcher("SignInScene.fxml", event);
        switchTo.ConfirmSceneSwitch();
    }

    @FXML
    private void aboutOnClick(ActionEvent event) throws IOException{
           SceneSwitcher switchTo = new SceneSwitcher("CostumerAboutScene.fxml", event);
        switchTo.ConfirmSceneSwitch();
    }


    @FXML
    private void feedBackOnClick(ActionEvent event)throws IOException{
           SceneSwitcher switchTo = new SceneSwitcher("CostumerFeedBackScene.fxml", event);
        switchTo.ConfirmSceneSwitch();
    }



    @FXML
    private void helpcenteronclick(ActionEvent event)throws IOException{
           SceneSwitcher switchTo = new SceneSwitcher("CostumerHelpCenterScene.fxml", event);
        switchTo.ConfirmSceneSwitch();
    }




    private void signOutButtonOnClick(ActionEvent event)throws IOException{
           SceneSwitcher switchTo = new SceneSwitcher("SignInScene.fxml", event);
        switchTo.ConfirmSceneSwitch();
    }

    @FXML
    private void reloadOnClick(ActionEvent event) {
         ObservableList<CustomerNotificationTable> venueschedules = FXCollections.observableArrayList();
        
            notificationCol.setCellValueFactory(new PropertyValueFactory<>("My Window"));
            
        
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
             File f = new File("AccountentInfoToCustomer.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            CustomerNotificationTable p;
            try {
                while (true) {
                    p = (CustomerNotificationTable) ois.readObject();
                    venueschedules.add(p);
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
        userDashNotificationTable.setItems(venueschedules);
    }

   
}








    

