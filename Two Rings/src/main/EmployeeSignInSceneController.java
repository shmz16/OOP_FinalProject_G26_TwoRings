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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author LENOVO ThinkPad
 */
public class EmployeeSignInSceneController implements Initializable {

    @FXML
    private AnchorPane forgetPasswordLabel;
    @FXML
    private TextField employeeIDTextField;
    @FXML
    private TextField passcodeTextField;
    @FXML
    private Label errorLabel1;
    
    ArrayList<Employee> empList = new ArrayList<Employee>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        File employeesFile = null;
        
        try {
            employeesFile = new File("EmployeeList.bin");
            fis = new FileInputStream(employeesFile);
            ois = new ObjectInputStream(fis);
            Employee tempEmp;
            try {
                while (true) {
                    tempEmp = (Employee) ois.readObject();
                    empList.add(tempEmp);
                }
            } 
            catch (Exception e) {
            }
        } 
        catch (IOException ex) {
        }
        finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } 
            catch (IOException ex) {
            }
        }
    }    

    @FXML
    private void signInButtonOnClick(ActionEvent event) throws IOException {
        boolean loginSuccess = false;
        int i = 0;
        Employee currentEmp = null;
        String sceneToSwitch = null;
        
        Integer givenID = Integer.parseInt(employeeIDTextField.getText());
        String givenpassword = passcodeTextField.getText();
        
        while (i < empList.size() || loginSuccess == false) {
            if (givenID == empList.get(i).getEmployeeID() 
                    && givenpassword.equals(empList.get(i).getPassword())) {
                currentEmp = empList.get(i);
                loginSuccess = true;
            }
            i++;
        }
        if (loginSuccess == true) {
            if ("Register".equals(currentEmp.getDesignation())) {
                sceneToSwitch = "RegistarDashboard.fxml";
            }
            else if ("Accountant".equals(currentEmp.getDesignation())) {
                sceneToSwitch = "AccountantDashboardScene.fxml";
            }
            else if ("Lawyer".equals(currentEmp.getDesignation())) {
                sceneToSwitch = "lawyer dashboard.fxml";
            }
            else if ("Marketing Maneger".equals(currentEmp.getDesignation())) {
                sceneToSwitch = "MarketingDashboardScene.fxml";
            }
            else if ("Event Maneger".equals(currentEmp.getDesignation())) {
                sceneToSwitch = "EventManager Dashboard.fxml";
            }
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            File currentUserFile = null;
            currentUserFile = new File("CurrentUser.bin");
            fos = new FileOutputStream(currentUserFile, true);
            //oos.writeObject(currentEmp);
            
            SceneSwitcher switchToEmployeeDashboard = new SceneSwitcher(sceneToSwitch, event);
            switchToEmployeeDashboard.ConfirmSceneSwitch();
        }
        else {
            errorLabel1.setText("ID or password invalid. try again");
        }
    }
    
}
