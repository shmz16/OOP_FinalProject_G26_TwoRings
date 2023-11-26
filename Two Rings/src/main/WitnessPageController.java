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
import java.time.LocalDate;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class WitnessPageController implements Initializable {

    @FXML
    private TextField firstNameTextField;
    @FXML
    private TextField lastNameTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField nidNoTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private TextField comfirmPasswordTextField;
    @FXML
    private TextField phoneTextField;
    @FXML
    private TextField adressTextField;
    @FXML
    private CheckBox termsAndConditionCheckBox;
    @FXML
    private ComboBox<String> countryCombo;
    @FXML
    private ToggleGroup gg;

    @FXML
    private RadioButton brideTG;
    @FXML
    private RadioButton groomTG;
    @FXML
    private TextField participentName;
    @FXML
    private TextField parcipentid;
    @FXML
    private DatePicker dateOfBirth;
    @FXML
    private ComboBox<String> genderCombo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String[] countryCodes = Locale.getISOCountries();

        // Create an array to store country names
        String[] countryNames = new String[countryCodes.length];

        // Populate the array with country names
        for (int i = 0; i < countryCodes.length; i++) {
            Locale locale = new Locale("", countryCodes[i]);
            countryNames[i] = locale.getDisplayCountry();
        }

        countryCombo.getItems().addAll(countryNames);

        String witnesingFor = "Bride";
        if (brideTG.isSelected()) {
            witnesingFor = "Groom";
        }
        String[] gender = {"Male", "Female"};
        genderCombo.getItems().addAll(gender);

    }

    @FXML
    private void witnessRegisterButton(ActionEvent event) {

        String fname = firstNameTextField.getText();
        String lname = lastNameTextField.getText();
        String email = emailTextField.getText();
        String nidNo = nidNoTextField.getText();
        String witnesAddress = adressTextField.getText();
        String cName = participentName.getText();
        String cId = parcipentid.getText();
        String pass1 = passwordTextField.getText();
        String confirmPass = comfirmPasswordTextField.getText();
        String gender = genderCombo.getValue();
        String phoneNo = phoneTextField.getText();

        String witnessCounttry = countryCombo.getValue();
        LocalDate DOB = dateOfBirth.getValue();

        String witnesingFor = "Bride";
        if (brideTG.isSelected()) {
            witnesingFor = "Groom";
        }

        boolean terms = false;
        if (termsAndConditionCheckBox.isSelected()) {
            terms = true;
        }

        

//        File f = null;
//        FileOutputStream fos = null;      
//        ObjectOutputStream oos = null;
//        
//        try {
//            f = new File("EmpObjects.bin");
//            if(f.exists()){
//                fos = new FileOutputStream(f,true);
//                oos = new AppendableObjectOutputStream(fos);                
//            }
//            else{
//                fos = new FileOutputStream(f);
//                oos = new ObjectOutputStream(fos);               
//            }
//            Witness w = new Witness(fname, lname, DOB, gender, nidNo,
//                witnesingFor, cName, cId, pass1, witnessCounttry, witnesAddress,
//                phoneNo, email);
//            oos.writeObject(w);
//        } catch (IOException ex) {
//            Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                if(oos != null) oos.close();
//            } catch (IOException ex) {
//                Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } 
        
        
        
    }

}
