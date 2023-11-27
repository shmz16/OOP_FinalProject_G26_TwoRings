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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Parent;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class AddNewEmployeeController implements Initializable {

    @FXML
    private ComboBox<String> genderCombo;
    @FXML
    private ComboBox<String> postCombo;
    private ComboBox<String> bloodGroupCombo;
    @FXML
    private TextField fNameField;
    @FXML
    private TextField setNewPass;
    @FXML
    private TextField confirmEmpPass;
    @FXML
    private TextField empPhoneNo;
    private TextField empPresentAddress;
    private TextField empPermanentAddress;
    private TextField yearOfExperience;
    @FXML
    private DatePicker DOJ;
    @FXML
    private TextField assignId;
    @FXML
    private TextField empEmail;

    private ArrayList<Employee> employeeList = new ArrayList<>();
    @FXML
    private DatePicker dateOfBirth;
    @FXML
    private TextField salary;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String[] bloodGroups = {"A(+ve)", "B(+ve)", "O(+ve)", "AB(+ve)", "A(-ve)", "B(-ve)", "B(-ve)", "O(-ve)", "AB(-ve)"};
        bloodGroupCombo.getItems().addAll(bloodGroups);

        String[] typesOfEmployee = {"Laywer", "Register", "Marketing Maneger", "Event Maneger", "Accountant"};
        postCombo.getItems().addAll(typesOfEmployee);

        String[] gender = {"Male", "Female", "Others"};
        genderCombo.getItems().addAll(gender);

        //Creatiing an empty bin file!!
        

    }

    @FXML
    private void addEmployeeButton(ActionEvent event) {
        String name = fNameField.getText();
        LocalDate DOB = dateOfBirth.getValue();

        int employeeId = Integer.parseInt(assignId.getText());
        String phoneNo = empPhoneNo.getText();
        
        //String empId = empPermanentAddress.getText();
        String newpass = setNewPass.getText();
        String confirm = confirmEmpPass.getText();
        String gender = genderCombo.getValue();
        String post = postCombo.getValue();
        int salaryy = Integer.parseInt(salary.getText());
        String email = empEmail.getText();
        

        
        LocalDate dateOfJoin = DOJ.getValue();

        Employee temp = new Employee(employeeId, dateOfJoin, salaryy, post, name, gender, email, phoneNo, newpass, DOB);
        employeeList.add(temp);

        // creating a object stream file;
        /*
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("EmpListObsject.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableOjectOutputStream(fos);
            }
            else{
                fos = new FileOutputStream(f);
                ObjectOutputStream oos1 = oos;
                new ObjectOutputStream(fos);
                
            }
            oos.writeObject(employeeList);
        } catch (IOException ex) {
            Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        */

    }

    @FXML
    private void prevPage(ActionEvent event) throws IOException {
        Parent sceneA = FXMLLoader.load(getClass().getResource("CEOpage.fxml"));
        Scene sceneB = new Scene(sceneA);

        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg.setTitle("I am Back!!");
        stg.setScene(sceneB);
        stg.show();
    }

}
