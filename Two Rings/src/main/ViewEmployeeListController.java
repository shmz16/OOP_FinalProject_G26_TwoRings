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

    @FXML
    private TableView<Employee> empolyeTable;
    @FXML
    private TableColumn<Employee, String> nameColomn;
    @FXML
    private TableColumn<Employee, String> idColomn;
    @FXML
    private TableColumn<Employee, String> genderColomn;
    @FXML
    private TableColumn<Employee, String> postColomn;
    @FXML
    private PieChart pieChart;
    @FXML
    private Label pieChartInfoLabel;
    @FXML
    private TableColumn<Employee, String> phoneNoColomn;
    private ArrayList<Employee> employeeList = new ArrayList<>();
    @FXML
    private TextArea TextArea;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
//        nameColomn.setCellFactory(new PropertyValueFactory<Employee, String>("Name"));
//        idColomn.setCellFactory(new PropertyValueFactory<Employee, String>("employeeId"));
//        genderColomn.setCellFactory(new PropertyValueFactory<Employee, String>("gender"));
//        postColomn.setCellFactory(new PropertyValueFactory<Employee, String>("position"));
//        phoneNoColomn.setCellFactory(new PropertyValueFactory<Employee, String>("contactNumber"));
//        
    }

    @FXML
    private void showEmployeeOnClick(ActionEvent event) throws IOException, ClassNotFoundException {
        
        
        

        ObjectInputStream ois=null;
         try {
            Employee e;
            ois = new ObjectInputStream(new FileInputStream("EmpListObsject.bin"));
            e = (Employee) ois.readObject();
            empolyeTable.getItems().add(e);
            //s = (Student) ois.readObject(); tableView.getItems().add(s);            
            
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
        }

        
    }

    @FXML
        private void prevPage
        (ActionEvent event) throws IOException {
            Parent sceneA = FXMLLoader.load(getClass().getResource("CEOpage.fxml"));
            Scene sceneB = new Scene(sceneA);

            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stg.setTitle("I am Back!!");
            stg.setScene(sceneB);
            stg.show();
        }

    @FXML
    private void loadPieChartOnClick(ActionEvent event) {
    }

    }
