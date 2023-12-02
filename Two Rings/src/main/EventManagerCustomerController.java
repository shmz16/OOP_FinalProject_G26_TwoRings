/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private TableView<Customertable> CustomerEventtable;
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
   
    
    public ArrayList<Event> eventList= new ArrayList<Event>();
    
    

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
        File xFile = null;
        
        
        try{
            xFile = new File("Customer info to event manegment.bin");
            fis = new FileInputStream(xFile);
            ois = new ObjectInputStream(fis);
            Event tempEvent;
            try{
                while(true){
                    tempEvent = (Event) ois.readObject();
                    eventList.add(tempEvent);
                }
            }
            catch(EOFException e){
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(EventManagerCustomerController.class.getName()).log(Level.SEVERE, null, ex);
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
        while(i<=eventList.size()){
            CustomerEventtable.getItems().add(new Customertable(
                    eventList.get(i).eventname,
                    eventList.get(i).username,
                    eventList.get(i).venue,
                    eventList.get(i).eventdate)
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
