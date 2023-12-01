/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.FileInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AccountantViewProfitsSceneController implements Initializable {
    
    ArrayList<Payment> paymentList = new ArrayList<Payment>();

    @FXML
    private DatePicker profitsStartDate;
    @FXML
    private DatePicker profitsEndDate;
    @FXML
    private TableView<AccountantProfitsTableClass> profitsTable;
    @FXML
    private TableColumn<AccountantProfitsTableClass, String> profitsTableCustomerName;
    @FXML
    private TableColumn<AccountantProfitsTableClass, Integer> profitsTablePackage;
    @FXML
    private TableColumn<AccountantProfitsTableClass, LocalDate> profitsTableDate;
    @FXML
    private TableColumn<AccountantProfitsTableClass, Integer> profitsTablePrice;
    @FXML
    private Label earningsLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        profitsTableCustomerName.setCellValueFactory(new PropertyValueFactory<AccountantProfitsTableClass, String>("customerName"));
        profitsTablePackage.setCellValueFactory(new PropertyValueFactory<AccountantProfitsTableClass, Integer>("chosenPackageID"));
        profitsTableDate.setCellValueFactory(new PropertyValueFactory<AccountantProfitsTableClass, LocalDate>("paymentDate"));
        profitsTablePrice.setCellValueFactory(new PropertyValueFactory<AccountantProfitsTableClass, Integer>("paymentAmount"));
    }    

    @FXML
    private void accountantBackButtonOnClick(ActionEvent event) throws IOException {
        BackButton accountantBackButton = new BackButton(event);
        accountantBackButton.AccountantBackButton();
    }

    @FXML
    private void viewButton(ActionEvent event) {
        FileInputStream fis = null;
        
    }
    
}
