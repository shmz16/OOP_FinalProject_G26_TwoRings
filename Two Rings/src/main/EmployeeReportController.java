/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

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
    private TableColumn<Employee, String> idColomn;
    @FXML
    private TableColumn<Employee, String> genderColomn;
    @FXML
    private TableColumn<Employee, String> salryColomn;
    @FXML
    private TableColumn<Employee, String> postColomn;
    @FXML
    private TableColumn<Employee, String> DOJColomn;
    @FXML
    private TableColumn<Employee, String> ratingColomn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void prevPage(ActionEvent event) throws IOException {
        SceneSwitcher ceoSC = new SceneSwitcher("CEOpage.fxml", event);
        ceoSC.ConfirmSceneSwitch();

    }
    
}
