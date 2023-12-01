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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class EventManagerCustomerController implements Initializable {

    @FXML
    private Label TworingsLogolabel;
    @FXML
    private Button helpcenterlabel;
    @FXML
    private Button settingslabel;
    @FXML
    private Button Aboutlabel;
    @FXML
    private Button dashboardlabel;
    @FXML
    private TextField nametextfield;
    @FXML
    private TextField timeTextfield;
    @FXML
    private DatePicker eventdatepicker;
    @FXML
    private Button showbutton;
    @FXML
    private ComboBox<?> locationcombobox;
    @FXML
    private TableView<String> CustomerEventtable;
    @FXML
    private TableColumn<Customertable, String> EventNameColumn;
    @FXML
    private TableColumn<Customertable, String> usernameColumn;
    @FXML
    private TableColumn<Customertable, String> Customernametable;
    @FXML
    private TableColumn<Customertable, Venue> locationTable;
    @FXML
    private TableColumn<Customertable, LocalDate> Eventdatecolumn;
    @FXML
    private TableColumn<Customertable, String> commentcolumn;
    
    public ArrayList<Event> empList= new ArrayList<Event>();
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        EventNameColumn.setCellValueFactory(new PropertyValueFactory<Customertable, String>("EventName"));
        usernameColumn.setCellValueFactory(new PropertyValueFactory<Customertable, String>("username"));
        
        locationTable.setCellValueFactory(new PropertyValueFactory<Customertable, Venue>("location"));
        Eventdatecolumn.setCellValueFactory(new PropertyValueFactory<Customertable, LocalDate>("Eventdate"));
        
        // TODO
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        File employeeFile = null;
        
        
        try{
            employeeFile = new File("Customer info to event manegment.bin");
            fis = new FileInputStream(employeeFile);
            ois = new ObjectInputStream(fis);
            Employee tempEmp;
            try{
                while(true){
                    tempEmp = (Employee) ois.readObject();
                    empList.add(tempEmp);
                }
            }
            catch(IOException | ClassNotFoundException e){
            }
            
        }
        catch (IOException ex){
            
        }
        finally {
            try{
                if (ois != null){
                    ois.close();
                }
            }
            catch(IOException e){
        }
        }
        int i =0;
        while(i<=empList.size()){
            CustomerEventtable.getItems().add(new Customertable(
                    empList.get(i).eventname,
                    empList.get(i).username,
                   
                    empList.get(i).venue,
                    empList.get(i).eventdate
            );
            i++;
        }
        
    } 


        
    @FXML
    private void backbuttonOnclick(ActionEvent event)  throws IOException{
        SceneSwitcher toProfileScene = new SceneSwitcher("EventManager Dashboard.fxml",event);
        toProfileScene.ConfirmSceneSwitch();
    }
    
}
