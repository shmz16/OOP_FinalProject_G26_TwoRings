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
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class EmployeeReportController implements Initializable {

    @FXML
    private TableView<Employee> empolyeTable;
    @FXML
    private TableColumn<Employee, String> nameColomn;
    @FXML
    private TableColumn<Employee, Integer> idColomn;
    @FXML
    private TableColumn<Employee, String> genderColomn;
    @FXML
    private TableColumn<Employee, Integer> salryColomn;
    @FXML
    private TableColumn<Employee, String> postColomn;
    @FXML
    private TableColumn<Employee, String> ratingColomn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        Employee employeeRating = new Employee("4.4/5");
        
    }    

    @FXML
    private void prevPage(ActionEvent event) throws IOException {
        SceneSwitcher ceoSC = new SceneSwitcher("CEOpage.fxml", event);
        ceoSC.ConfirmSceneSwitch();

    }

    @FXML
    private void empReportBT(ActionEvent event) {
        ObservableList<Employee> empList = FXCollections.observableArrayList();
        nameColomn.setCellValueFactory(new PropertyValueFactory<Employee, String>("name"));
        idColomn.setCellValueFactory(new PropertyValueFactory<Employee, Integer>("id"));
        genderColomn.setCellValueFactory(new PropertyValueFactory<Employee, String>("gender"));
        salryColomn.setCellValueFactory(new PropertyValueFactory<Employee, Integer>("salary"));
        postColomn.setCellValueFactory(new PropertyValueFactory<Employee, String>("designation"));
        
        ratingColomn.setCellValueFactory(new PropertyValueFactory<Employee, String>("ratings"));
        
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("EmployeeList.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Employee emp;
            try {
                while (true) {
                    emp = (Employee) ois.readObject();
                    empList.add(emp);
                    System.out.println(emp.toString());

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
        empolyeTable.setItems(empList);
    }
    
}
