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
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class CEOpageController implements Initializable {

    @FXML
    private ComboBox<String> sendToCombo;

    @FXML
    private TextArea massageTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String[] typesOfEmployee = {"Laywer", "Register", "Marketing Maneger", "Event Maneger", "Accountant"};
        sendToCombo.getItems().addAll(typesOfEmployee);
    }

    @FXML
    private void financeReportOnClick(ActionEvent event) throws IOException {

        Parent sceneA = FXMLLoader.load(getClass().getResource("FinanceReport.fxml"));
        Scene sceneB = new Scene(sceneA);

        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg.setTitle("I am Back!!");
        stg.setScene(sceneB);
        stg.show();
    }

    @FXML
    private void employeeReportOnClick(ActionEvent event) throws IOException {
        SceneSwitcher empReport = new SceneSwitcher("Employee Report.fxml", event);
        empReport.ConfirmSceneSwitch();

    }

    @FXML
    private void employeeListOnClick(ActionEvent event) throws IOException {
        Parent sceneA = FXMLLoader.load(getClass().getResource("ViewEmployeeList.fxml"));
        Scene sceneB = new Scene(sceneA);

        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg.setTitle("I am Back!!");
        stg.setScene(sceneB);
        stg.show();

    }

    @FXML
    private void addNewEmployeeOnClick(ActionEvent event) throws IOException {

        SceneSwitcher addNewEmployeeSc = new SceneSwitcher("AddNewEmployee.fxml", event);
        addNewEmployeeSc.ConfirmSceneSwitch();

    }

    @FXML
    private void updatePolicyOnClick(ActionEvent event) throws IOException {
        SceneSwitcher policySc = new SceneSwitcher("Update Policy.fxml", event);
        policySc.ConfirmSceneSwitch();

    }

    @FXML
    private void bookMetting(ActionEvent event) throws IOException {
        SceneSwitcher meet = new SceneSwitcher("CEOMeeting.fxml", event);
        meet.ConfirmSceneSwitch();
    }

    @FXML
    private void testWitnes(ActionEvent event) throws IOException {

        SceneSwitcher witnesSC = new SceneSwitcher("WitnessPage2.fxml", event);
        witnesSC.ConfirmSceneSwitch();
    }

    @FXML
    private void sendMassageBT(ActionEvent event) {

        sendToCombo.getValue();

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("Massage.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);

            }
            CEO massage = new CEO(massageTextArea.getText());

            oos.writeObject(massage);
            System.out.println(massage.toMassage());

        } catch (IOException ex) {
            Logger.getLogger(CEOpageController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(CEOpageController.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
        massageTextArea.clear();
        massageTextArea.setText("Massage sent Successfully.");

    }

    @FXML
    private void receiveMassageBT(ActionEvent event) {
        massageTextArea.clear();
        System.out.println("Confirming receive Bt work");
        String recevedMassage = null;
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("Massage.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            CEO readMassage;
            try {
                while (true) {
                    readMassage = (CEO) ois.readObject();

                    recevedMassage = readMassage.massage;
                    System.out.println("Reading Object");
                    System.out.println(readMassage.massage);
                    massageTextArea.setText("Received:\n" + recevedMassage);

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
//        massageTextField.setText(recevedMassage);
    }

    @FXML
    private void calculateTaxOnClick(ActionEvent event) throws IOException {
        SceneSwitcher switchToViewProfitsScene = new SceneSwitcher("TaxCalculator.fxml", event);
        switchToViewProfitsScene.ConfirmSceneSwitch();
    }

}
