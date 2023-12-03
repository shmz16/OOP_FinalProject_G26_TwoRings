/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class CuponController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void claimCouponBT(ActionEvent event) {
        Random random = new Random();
        String code = String.valueOf(random.nextInt(999999) + 1000000);
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Exiting Voucher!🎁🎈!");
        a.setHeaderText("Congrats, You Have Won a coupon Card!!");
        a.setContentText("To Claim Your Coucher save the Coupon Code,\n or take a picture!!\nCode: " + code);
        a.showAndWait();
    }

    @FXML
    private void prevPage(ActionEvent event) throws IOException {
        SceneSwitcher witnesPage2 = new SceneSwitcher("WitnessPage2.fxml", event);
        witnesPage2.ConfirmSceneSwitch();
    }

}
