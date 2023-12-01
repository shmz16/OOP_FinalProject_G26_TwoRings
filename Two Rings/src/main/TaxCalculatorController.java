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
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class TaxCalculatorController implements Initializable {

    @FXML
    private TextField incomeTextField;
    @FXML
    private TextField percentageTextField;
    @FXML
    private Label payableTaxLable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void calculateTAxOnClickBT(ActionEvent event) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        float income = Float.parseFloat(incomeTextField.getText());
        float taxP = Float.parseFloat(percentageTextField.getText());

        if ((taxP > 0f)&&(taxP <= 100f)) {

            float taxPayable = income * (taxP / 100);
            payableTaxLable.setText(String.valueOf(taxPayable));

        } else {
            a.setTitle("Error Alert");
            a.setHeaderText("Change tax ammount");
            a.setContentText("Invalid Tax Percentage");
            a.showAndWait();
        }
    }

    @FXML
    private void prevPage(ActionEvent event) throws IOException {
        SceneSwitcher switchToViewProfitsScene = new SceneSwitcher("CEOpage.fxml", event);
        switchToViewProfitsScene.ConfirmSceneSwitch();
    }

}
