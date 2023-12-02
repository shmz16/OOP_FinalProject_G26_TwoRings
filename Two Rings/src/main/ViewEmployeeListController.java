/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import static java.lang.Math.random;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class ViewEmployeeListController implements Initializable {

//    private Employee model = new Employee();
    @FXML
    private TableView<MyEmployee> empolyeTable;
    @FXML
    private TableColumn<MyEmployee, String> nameColomn;
    @FXML
    private TableColumn<MyEmployee, Integer> idColomn;
    @FXML
    private TableColumn<MyEmployee, String> genderColomn;
    @FXML
    private TableColumn<MyEmployee, String> postColomn;
    @FXML
    private Label pieChartInfoLabel;
    @FXML
    private TableColumn<MyEmployee, String> phoneNoColomn;

    @FXML
    private TextArea TextArea;
    @FXML
    private PieChart employeePie;

    @FXML
    private Button confirmAddEmployee;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void showEmployeeOnClick(ActionEvent event) throws IOException, ClassNotFoundException {
        ObservableList<MyEmployee> empList = FXCollections.observableArrayList();

        nameColomn.setCellValueFactory(new PropertyValueFactory<MyEmployee, String>("name"));
        idColomn.setCellValueFactory(new PropertyValueFactory<MyEmployee, Integer>("id"));
        genderColomn.setCellValueFactory(new PropertyValueFactory<MyEmployee, String>("gender"));
        postColomn.setCellValueFactory(new PropertyValueFactory<MyEmployee, String>("designation"));
        phoneNoColomn.setCellValueFactory(new PropertyValueFactory<MyEmployee, String>("phoneNo"));

        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("EmployeeList.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            MyEmployee emp;
            try {
                while (true) {
                    emp = (MyEmployee) ois.readObject();
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

    @FXML
    private void prevPage(ActionEvent event) throws IOException {
        Parent sceneA = FXMLLoader.load(getClass().getResource("CEOpage.fxml"));
        Scene sceneB = new Scene(sceneA);

        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg.setTitle("I am Back!!");
        stg.setScene(sceneB);
        stg.show();
    }

    @FXML
    private void loadPieChartOnClick(ActionEvent event) throws FileNotFoundException, IOException, ClassNotFoundException {
        

//        ArrayList<MyEmployee.> ll;
//        ObservableList<MyEmployee> employee = FXCollections.observableArrayList();
//        Random random = new Random();
//
//        ObservableList<PieChart.Data> list = FXCollections.observableArrayList();
//        File f = null;
//        FileInputStream fis = null;
//        ObjectInputStream ois = null;
//        
//        try {
//            f = new File("EmployeeList.bin");
//            fis = new FileInputStream(f);
//            ois = new ObjectInputStream(fis);
//            MyEmployee emp;
//            try {
//                while (true) {
//                    emp = (MyEmployee) ois.readObject();
//                    ll.add(emp.designation.charAt(8));
//                    employee.add(emp);
//                    System.out.println(emp.toString());
//                    
//                    
//                }
//            } catch (Exception e) {
//            }
//        } catch (IOException ex) {
//        } finally {
//            try {
//                if (ois != null) {
//                    ois.close();
//                }
//            } catch (IOException ex) {
//            }
//
//        }
//        employeePie.setData(list);
        
        

        Random random = new Random();
        String[] typesOfEmployee = {"Laywer", "Register", "Marketing Maneger", "Event Maneger", "Accountant"};
        ObservableList<PieChart.Data> list = FXCollections.observableArrayList();
        for (int i = 0; i < (typesOfEmployee.length); i++) {

            list.add(new PieChart.Data(typesOfEmployee[i], random.nextInt(17)));

            employeePie.setData(list);
        }
    }

}
