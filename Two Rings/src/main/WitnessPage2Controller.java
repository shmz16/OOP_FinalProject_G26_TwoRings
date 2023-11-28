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

/**
 * FXML Controller class
 *
 * @author acer
 */
public class WitnessPage2Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void photoBT(ActionEvent event) throws IOException {
        SceneSwitcher album = new SceneSwitcher("Picture.fxml", event);
        album.ConfirmSceneSwitch();
    }

    @FXML
    private void cupponButton(ActionEvent event) throws IOException {
        SceneSwitcher cupon = new SceneSwitcher("Cupon.fxml", event);
        cupon.ConfirmSceneSwitch();
    }

    @FXML
    private void aboutUsBT(ActionEvent event) throws IOException {
        SceneSwitcher abtUs = new SceneSwitcher("AboutUs.fxml", event);
        abtUs.ConfirmSceneSwitch();
    }

    @FXML
    private void officeLocagtorBT(ActionEvent event) throws IOException {
        SceneSwitcher locatOffice = new SceneSwitcher("OfficeLocation.fxml", event);
        locatOffice.ConfirmSceneSwitch();
    }
    
}
