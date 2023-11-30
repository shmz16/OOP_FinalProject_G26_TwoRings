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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AccountantCheckSalariesSceneController implements Initializable {

    @FXML
    private ComboBox<String> filterComboBox;
    @FXML
    private TableView<AccountantSalariesTableClass> salariesTable;
    @FXML
    private TableColumn<AccountantSalariesTableClass, String> salariesTableEmployeeName;
    @FXML
    private TableColumn<AccountantSalariesTableClass, String> salariesTableEmployeeDesignation;
    @FXML
    private TableColumn<AccountantSalariesTableClass, Integer> salariesTableEmployeeSalary;
    @FXML
    private TableColumn<AccountantSalariesTableClass, LocalDate> salariesTableEmployeeJoinDate;
    @FXML
    private TableColumn<AccountantSalariesTableClass, Integer> salariesTableEmployeeID;
    
    public ArrayList<Employee> empList = new ArrayList<Employee>();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        filterComboBox.getItems().addAll(
                "Lawyer",
                "Registrar",
                "Event Manager",
                "Marketing Manager",
                "Accountant"
                );
        salariesTableEmployeeID.setCellValueFactory(new PropertyValueFactory<AccountantSalariesTableClass, Integer>("employeeName"));
        salariesTableEmployeeName.setCellValueFactory(new PropertyValueFactory<AccountantSalariesTableClass, String>("employeeName"));
        salariesTableEmployeeDesignation.setCellValueFactory(new PropertyValueFactory<AccountantSalariesTableClass, String>("designation"));
        salariesTableEmployeeSalary.setCellValueFactory(new PropertyValueFactory<AccountantSalariesTableClass, Integer>("salary"));
        salariesTableEmployeeJoinDate.setCellValueFactory(new PropertyValueFactory<AccountantSalariesTableClass, LocalDate>("joinDate"));
        
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        File employeesFile = null;
        
        try {
            employeesFile = new File("Employees.bin");
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
        int i = 0;
        while (i <= empList.size()) {
            salariesTable.getItems().add(new AccountantSalariesTableClass(
                    empList.get(i).employeeID,
                    empList.get(i).name,
                    empList.get(i).designation,
                    empList.get(i).salary,
                    empList.get(i).joinDate)
            );
            i++;
        }
    }

    @FXML
    private void accountantBackButtonOnClick(ActionEvent event) throws IOException {
        BackButton accountantBackButton = new BackButton(event);
        accountantBackButton.AccountantBackButton();
    }

    @FXML
    private void applyFilterButton(ActionEvent event) {
        salariesTable.getItems().clear();
        int i = 0;
        while (i <= empList.size()) {
            if (empList.get(i).designation == filterComboBox.getValue()) {
                salariesTable.getItems().add(new AccountantSalariesTableClass(
                        empList.get(i).employeeID,
                        empList.get(i).name,
                        empList.get(i).designation,
                        empList.get(i).salary,
                        empList.get(i).joinDate)
                );
            }
            i++;
        }
    }

    @FXML
    private void resetFilterButton(ActionEvent event) {
        salariesTable.getItems().clear();
        int i = 0;
        while (i <= empList.size()) {
            salariesTable.getItems().add(new AccountantSalariesTableClass(
                    empList.get(i).employeeID,
                    empList.get(i).name,
                    empList.get(i).designation,
                    empList.get(i).salary,
                    empList.get(i).joinDate)
            );
            i++;
        }
    }
    
}
