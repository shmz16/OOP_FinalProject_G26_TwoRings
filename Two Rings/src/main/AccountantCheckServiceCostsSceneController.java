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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AccountantCheckServiceCostsSceneController implements Initializable {

    @FXML
    private ComboBox<String> filterComboBoxSC;
    @FXML
    private TableView<AccountantServiceChargesTableClass> serviceChargesTable;
    @FXML
    private TableColumn<AccountantServiceChargesTableClass, String> serviceChargesTableEmpName;
    @FXML
    private TableColumn<AccountantServiceChargesTableClass, String> serviceChargesTableEmpDes;
    @FXML
    private TableColumn<AccountantServiceChargesTableClass, Integer> serviceChargesTableEmpSC;
    @FXML
    private TableColumn<AccountantServiceChargesTableClass, Integer> serviceChargesTableEmpID;

    public ArrayList<Employee> empListSC = new ArrayList<Employee>();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        filterComboBoxSC.getItems().addAll(
                "Lawyer",
                "Registrar",
                "Event Manager"
                );
        serviceChargesTableEmpID.setCellValueFactory(new PropertyValueFactory<AccountantServiceChargesTableClass, Integer>("employeeName"));
        serviceChargesTableEmpName.setCellValueFactory(new PropertyValueFactory<AccountantServiceChargesTableClass, String>("empName"));
        serviceChargesTableEmpDes.setCellValueFactory(new PropertyValueFactory<AccountantServiceChargesTableClass, String>("designation"));
        serviceChargesTableEmpSC.setCellValueFactory(new PropertyValueFactory<AccountantServiceChargesTableClass, Integer>("serviceCharge"));
        
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        File lawyersFile = null;
        File eventManagersFile = null;
        File registrarsFile = null;
        
        try {
            lawyersFile = new File("Lawyer.bin");
            fis = new FileInputStream(lawyersFile);
            ois = new ObjectInputStream(fis);
            Lawyer tempEmp;
            try {
                while (true) {
                    tempEmp = (Lawyer) ois.readObject();
                    empListSC.add(tempEmp);
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
        
        try {
            eventManagersFile = new File("EventManagers.bin");
            fis = new FileInputStream(eventManagersFile);
            ois = new ObjectInputStream(fis);
            EventManager tempEmp;
            try {
                while (true) {
                    tempEmp = (EventManager) ois.readObject();
                    empListSC.add(tempEmp);
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
        
        try {
            registrarsFile = new File("Registrars.bin");
            fis = new FileInputStream(registrarsFile);
            ois = new ObjectInputStream(fis);
            Registrar tempEmp;
            try {
                while (true) {
                    tempEmp = (Registrar) ois.readObject();
                    empListSC.add(tempEmp);
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
        while (i <= empListSC.size()) {
            serviceChargesTable.getItems().add(new AccountantServiceChargesTableClass(
                    empListSC.get(i).employeeID,
                    empListSC.get(i).name,
                    empListSC.get(i).designation,
                    empListSC.get(i).serviceCharge)
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
    private void applyFilterButtonSC(ActionEvent event) {
        serviceChargesTable.getItems().clear();
        int i = 0;
        while (i <= empListSC.size()) {
            if (empListSC.get(i).designation == filterComboBoxSC.getValue()) {
                serviceChargesTable.getItems().add(new AccountantServiceChargesTableClass(
                        empListSC.get(i).employeeID,
                        empListSC.get(i).name,
                        empListSC.get(i).designation,
                        empListSC.get(i).serviceCharge)
                );
            }
            i++;
        }
    }

    @FXML
    private void resetFilterButtonSC(ActionEvent event) {
        serviceChargesTable.getItems().clear();
        int i = 0;
        while (i <= empListSC.size()) {
            serviceChargesTable.getItems().add(new AccountantServiceChargesTableClass(
                    empListSC.get(i).employeeID,
                    empListSC.get(i).name,
                    empListSC.get(i).designation,
                    empListSC.get(i).serviceCharge)
            );
            i++;
        }
    }
    
}
