/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CustomerCreateAccountSceneController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private ComboBox<String> genderComboBox;
    @FXML
    private ComboBox<String> religionComboBox;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField phoneNoTextField;
    private DatePicker DOBPicker;
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;

    ArrayList<Customer> customersList = new ArrayList<Customer>();
    @FXML
    private Label messageLabel;
    @FXML
    private DatePicker dobPicker;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        genderComboBox.getItems().addAll("Male","Female");
        religionComboBox.getItems().addAll("Islam", "Hinduism", "Christianity", 
                "Buddhism", "Judaism", "Other");
        
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("CustomerList.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Customer tempCus;
            try {
                while (true) {
                    tempCus = (Customer) ois.readObject();
                    customersList.add(tempCus);
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
    }

    @FXML
    private void backButton(ActionEvent event) throws IOException {
        SceneSwitcher backToLoginScene = new SceneSwitcher("CustomerSignInScene.fxml", event);
        backToLoginScene.ConfirmSceneSwitch();
    }

    @FXML
    private void createAccountButton(ActionEvent event) {
        boolean usernameTaken = false;
        int i = 0;
        while (usernameTaken = false || i < customersList.size()) {
            if (customersList.get(i).username == usernameField.getText()) {
                usernameTaken = true;
            }
        }
        if (usernameTaken = false) {
            Customer newCustomer = new Customer(usernameField.getText(),
                    religionComboBox.getValue(),
                    null,
                    null,
                    nameTextField.getText(),
                    genderComboBox.getValue(),
                    emailTextField.getText(),
                    phoneNoTextField.getText(),
                    passwordField.getText(),
                    dobPicker.getValue()
            );
            messageLabel.setText("Account Created Successfully.");
            customersList.add(newCustomer);
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            File customersFile = null;
            try {
            customersFile = new File("CustomerList.bin");
            if (customersFile.exists()) {
                fos = new FileOutputStream(customersFile, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(customersFile);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(newCustomer);

        } catch (IOException ex) {
            Logger.getLogger(CustomerCreateAccountSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(CustomerCreateAccountSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
            
        }
        else {
            messageLabel.setText("The username is already taken.");
        }
    }
}    


