/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author LENOVO ThinkPad
 */
public class CostumesLawyerSceneController implements Initializable {

    @FXML
    private TextField userTextField;
    @FXML
    private TextField eventLocationTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private DatePicker eventdatePik;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backbuttononclick(ActionEvent event)  throws IOException{
           SceneSwitcher switchTolawyerScene = new SceneSwitcher("CostumerDashBoardScene.fxml", event);
        switchTolawyerScene.ConfirmSceneSwitch();
    }

    @FXML
    private void sentButtonOnMouseClick(ActionEvent event) {
        Customerlawyertable i = new Customerlawyertable(
                userTextField.getText(), 
                emailTextField.getText(),
                eventdatePik.getValue(),
                eventLocationTextField.getValue());
        
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Customer Lawyer Info.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);
            System.out.println("write object sucessfull ");

        } catch (IOException ex) {
            Logger.getLogger(CustomerLawyerModel.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(CustomerLawyerModel.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void signOutOnClick(ActionEvent event) throws IOException{
           SceneSwitcher switchTolawyerScene = new SceneSwitcher("SignInScene.fxml", event);
        switchTolawyerScene.ConfirmSceneSwitch();
    }
    
}
