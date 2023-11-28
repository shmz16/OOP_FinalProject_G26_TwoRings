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
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class OfficeLocationController implements Initializable {

    @FXML
    private ImageView locationMap;
    @FXML
    private Text locationText;

    /**
     * Initializes the controller class.
     */
    private String locationDetails = "1 No Kazi Super Market Forth Floor, Beside Jinghakathi Gate & Khalpar Bridge, Sector-12, Uttara Dhaka-1100\n"
            + "+88 01856222545\n"
            + "+88 217285599599\n"
            + "info@two-rings.com\n"
            + "Always Open.";
    @Override

    public void initialize(URL url, ResourceBundle rb) {
        locationMap.isVisible();
    }

    @FXML
    private void loadLocation(ActionEvent event) {
        locationMap.setDisable(false);
        locationText.setText(locationDetails);
    }

    @FXML
    private void prevPage(ActionEvent event) throws IOException {
        SceneSwitcher witnessDash = new SceneSwitcher("WitnessPage2.fxml", event);
        witnessDash.ConfirmSceneSwitch();
    }

}
