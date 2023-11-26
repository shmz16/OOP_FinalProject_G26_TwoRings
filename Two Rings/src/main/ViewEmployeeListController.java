/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.IOException;
import java.net.URL;
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
    private TableColumn<Employee, Integer> serialColomn;
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showEmployeeOnClick(ActionEvent event) {
        
        
        ObservableList<Employee> EmployeeList FXCollections.observableArrayList();
        
        serialColomn.setCellFactory(new PropertyValueFactory<Employee, String>("1"));
        nameColomn.setCellFactory(new PropertyValueFactory<Employee, String>("firstName"+" lastName"));
        nameColomn.setCellFactory(new PropertyValueFactory<Employee, String>("firstName"+" lastName"));
        
        
    }

    @FXML
    private void loadPieChartOnClick(ActionEvent event) {
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
