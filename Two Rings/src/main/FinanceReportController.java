/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class FinanceReportController implements Initializable {

    @FXML
    private TextArea totalMarraige;
    @FXML
    private TextArea mrrRetation;
    @FXML
    private TextArea avgSalesPerAccount;
    @FXML
    private TextArea totalAccounts;
    @FXML
    private ComboBox<String> postCombo;
    @FXML
    private ComboBox<String> serviceCombo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String[] typesOfEmployee = {"Laywer", "Register", "Marketing Maneger", "Event Maneger", "Accountant"};
        postCombo.getItems().addAll(typesOfEmployee);
        String[] Service = {"Marriage", "Consultation", "Advertising",
             "Seconed Marriage"};
        serviceCombo.getItems().addAll(Service);
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
    private void campaignAnalitycs(ActionEvent event) throws IOException {
        
        
        Parent sceneA = FXMLLoader.load(getClass().getResource("Campaign Analytics.fxml"));
        Scene sceneB = new Scene(sceneA);

        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg.setTitle("I am Back!!");
        stg.setScene(sceneB);
        stg.show();
    }

    @FXML
    private void show4TextFieldOnClick(ActionEvent event) {
        
        Random random = new Random();
        
        totalMarraige.setText(String.valueOf( random.nextInt(100)));
        avgSalesPerAccount.setText(String.valueOf( random.nextInt(100)));
        totalAccounts.setText(String.valueOf( random.nextInt(100)));
        mrrRetation.setText(String.valueOf( random.nextInt(100)));
        
        
        
    }

    @FXML
    private void salesPerMonthChartOnClick(ActionEvent event) {
    }
    
}
