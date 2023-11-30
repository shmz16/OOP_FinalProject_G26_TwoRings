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
    private TableView<Employee> empolyeTable;
    @FXML
    private TableColumn<Employee, String> nameColomn;
    @FXML
    private TableColumn<Employee, Integer> idColomn;
    @FXML
    private TableColumn<Employee, String> genderColomn;
    @FXML
    private TableColumn<Employee, String> postColomn;
    @FXML
    private Label pieChartInfoLabel;
    @FXML
    private TableColumn<Employee, String> phoneNoColomn;

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
        ObservableList<Employee> empList = FXCollections.observableArrayList();

        nameColomn.setCellValueFactory(new PropertyValueFactory<Employee, String>("name"));
        idColomn.setCellValueFactory(new PropertyValueFactory<Employee, Integer>("id"));
        genderColomn.setCellValueFactory(new PropertyValueFactory<Employee, String>("gender"));
        postColomn.setCellValueFactory(new PropertyValueFactory<Employee, String>("designation"));
        phoneNoColomn.setCellValueFactory(new PropertyValueFactory<Employee, String>("phoneNo"));

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

//        ObjectInputStream ois = null;
//        try {
//            Employee e;
//            ois = new ObjectInputStream(new FileInputStream("EmpListObsject.bin"));
//            e = (Employee) ois.readObject();
//            empolyeTable.getItems().add(e);
//            //s = (Student) ois.readObject(); tableView.getItems().add(s);            
//
//        } catch (Exception ex) {
//            try {
//                if (ois != null) {
//                    ois.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            ex.printStackTrace();
//        }
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
//        List <Employee> desigList = new ArrayList<>();
//        
//        ObservableList<PieChart.Data> list = FXCollections.observableArrayList();
//        File f = null;
//        FileInputStream fis = null;
//        ObjectInputStream ois = null;
//        Random random = new Random();
//        try {
//            f = new File("EmployeeList.bin");
//            fis = new FileInputStream(f);
//            ois = new ObjectInputStream(fis);
//            Employee emp;
//            try {
//                while (true) {
//                    emp = (Employee) ois.readObject();
//                    
//
//                    desigList.add(emp);
//                    
//                    System.out.println(emp.toString());
//
//                }
//                
//
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
//
//        }
//        ArrayList<String> allDesig = (desigList,"designation");
        
        

        Random random = new Random();
        String[] typesOfEmployee = {"Laywer", "Register", "Marketing Maneger", "Event Maneger", "Accountant"};
        ObservableList<PieChart.Data> list = FXCollections.observableArrayList();
        for (int i = 0; i < (typesOfEmployee.length); i++) {

            list.add(new PieChart.Data(typesOfEmployee[i], random.nextInt(1500)));

            employeePie.setData(list);
        }
    }

}
