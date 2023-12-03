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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author LENOVO ThinkPad
 */
public class CostumerFeedBackSceneController implements Initializable {

    @FXML
    private TextArea textareafield;
    @FXML
    private TextField emailtextfield;
    @FXML
    private TextField nametextfield;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void signOutButtonOnClick(ActionEvent event)throws IOException{
           SceneSwitcher switchTo = new SceneSwitcher("SignInScene.fxml", event);
        switchTo.ConfirmSceneSwitch();
    }

    @FXML
    private void aboutbuttononclick(ActionEvent event) throws IOException{
           SceneSwitcher switchTo = new SceneSwitcher("CostumerAboutScene.fxml", event);
        switchTo.ConfirmSceneSwitch();
    }

    @FXML
    private void homebuttononclick(ActionEvent event) throws IOException{
           SceneSwitcher switchTo = new SceneSwitcher("CostumerDashBoardScene.fxml", event);
        switchTo.ConfirmSceneSwitch();
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException{
           SceneSwitcher switchTo = new SceneSwitcher("CostumerDashBoardScene.fxml", event);
        switchTo.ConfirmSceneSwitch();
    }

    @FXML
    private void submitbuttononclick(ActionEvent event) {
        textareafield.getText();
        emailtextfield.getText();
        nametextfield.getText();
         FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Customer Feedback to Admin.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            Object i = null;

            oos.writeObject(i);
            System.out.println("write object sucessfull ");

        } catch (IOException ex) {
            Logger.getLogger(User.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(User.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
        textareafield.clear();
        emailtextfield.clear();
        nametextfield.clear();
    }
    
}
