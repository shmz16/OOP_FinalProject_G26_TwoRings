/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
        
        while (i < empList.size() || loginSuccess == false) {
            if (Integer.parseInt(employeeIDTextField.getText()) == empList.get(i).employeeID 
                    && passcodeTextField.getText() == empList.get(i).password) {
                currentEmp = empList.get(i);
                loginSuccess = true;
            }
            i++;
        }
        if (loginSuccess == true) {
            if (currentEmp.designation == "Register") {
                sceneToSwitch = "RegistarDashboard.fxml";
            }
            else if (currentEmp.designation == "Accountant") {
                sceneToSwitch = "AccountantDashboardScene.fxml";
            }
            else if (currentEmp.designation == "Lawyer") {
                sceneToSwitch = "lawyer dashboard.fxml";
            }
            else if (currentEmp.designation == "Marketing Maneger") {
                sceneToSwitch = "MarketingDashboardScene.fxml";
            }
            else if (currentEmp.designation == "Event Maneger") {
                sceneToSwitch = "EventManager Dashboard.fxml";
            }
            SceneSwitcher switchToEmployeeDashboard = new SceneSwitcher(sceneToSwitch, event);
            switchToEmployeeDashboard.ConfirmSceneSwitch();
        }
        else {
            errorLabel1.setText("ID or password invalid. try again");
        }
    }
    
}
