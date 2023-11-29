/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.IOException;
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
    private Button applyFilterButton;
    @FXML
    private Button resetFilterButton;
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
        
        ArrayList<Employee> empList = new ArrayList();
        salariesTable.getItems().add(new AccountantSalariesTableClass(
                empList(i).employeeID,
                empList(i).name,
                empList(i).deisgnation,
                empList(i).salary,
                empList(i).joinDate,
        );
    }

    @FXML
    private void accountantBackButtonOnClick(ActionEvent event) throws IOException {
        BackButton accountantBackButton = new BackButton(event);
        accountantBackButton.AccountantBackButton();
    }
    
}
