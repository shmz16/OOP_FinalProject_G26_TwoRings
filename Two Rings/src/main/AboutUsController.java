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
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class AboutUsController implements Initializable {

    @FXML
    private TextArea aboutUsTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Policy us = new Policy();
        aboutUsTextArea.clear();
        aboutUsTextArea.setText(us.getAboutUs());
    }    

    @FXML
    private void prevPage(ActionEvent event) throws IOException {
        SceneSwitcher winessSC = new SceneSwitcher("WitnessPage2.fxml", event);
        winessSC.ConfirmSceneSwitch();
    }
    
}
