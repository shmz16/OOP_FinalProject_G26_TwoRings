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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class EventManagerAccountantController implements Initializable {

    @FXML
    private Label tworingslogolabel;
    @FXML
    private Button helpcenterlabel;
    @FXML
    private Button settingslabel;
    @FXML
    private Button Aboutlabel;
    @FXML
    private Button dashboardlabel;
    @FXML
    private TextField EmailTextField;
    @FXML
    private TextField payTextField;
    @FXML
    private TextField CustomertextField;
    @FXML
    private TextField paymentTextfield;
    @FXML
    private TextField bankTextField;
    @FXML
    private ComboBox<String> paycomboBox;
    @FXML
    private TextField BankAcctextField;
    @FXML
    private TextField marriageCertificateTextField;
    @FXML
    private TextArea customtextArea;
    @FXML
    private TextArea Feedbacktextarea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitButtonOnclick(ActionEvent event) {
        String Email = EmailTextField.getText();
        String payment = payTextField.getText();
        String customername = CustomertextField.getText();
        String customerPayment = paymentTextfield.getText();
        String bankname = bankTextField.getText();
        String bankAcc = BankAcctextField.getText();
        String marriageCertificate = marriageCertificateTextField.getText();
        String Feedback = customtextArea.getText();
        String paymentIncrease = paycomboBox.getItems().addAll("20%","30%","40%");
        
        
        StringBuilder textToset = new StringBuilder();
        textToset.append("Email: ").append(Email).append("\n");
        textToset.append("payment: ").append(payment).append("\n");
        textToset.append("Customer name:  ").append(customername).append("\n");
        textToset.append("payment:  ").append(customerPayment).append("\n");
        textToset.append("Name of the Bank").append(bankname).append("\n");
        textToset.append("bank account no: ").append(bankAcc).append("\n");
        textToset.append("marriage certificate: ").append(marriageCertificate).append("\n");
        textToset.append("feedback from the customers: ").append(Feedback);
        
        
        Feedbacktextarea.setText(textToset.toString());
        
        
        
    }

    @FXML
    private void backbuttonOnclick(ActionEvent event)  throws IOException{
        SceneSwitcher toProfileScene = new SceneSwitcher("EventManager Dashboard.fxml",event);
        toProfileScene.ConfirmSceneSwitch();
    }
    
}
