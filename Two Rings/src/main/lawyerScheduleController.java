/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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
public class lawyerScheduleController implements Initializable {

    @FXML
    private Label tworingslogolabel;
    @FXML
    private Button helpcenterlabel;
    @FXML
    private Button settingslabel;
    @FXML
    private Button aboutlabel;
    @FXML
    private Button profilelabel;
    @FXML
    private DatePicker datepicker;
    @FXML
    private TextField customerusername;
    @FXML
    private TextField eventnametextfield;
   
    @FXML
    private TableView<ScheduleTable> lawyertable;
    @FXML
    private TableColumn<ScheduleTable, String> Customertable;
   
    @FXML
    private TableColumn<ScheduleTable, String> Eventdatecolumn;
    @FXML
    private TableColumn<ScheduleTable, String> Eventnamecolumn;
    
   
   


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Customertable.setCellValueFactory(new PropertyValueFactory<ScheduleTable, String>("Customertable"));
        Eventnamecolumn.setCellValueFactory(new PropertyValueFactory<ScheduleTable, String>("Eventdatecolumn"));
        
        Eventdatecolumn.setCellValueFactory(new PropertyValueFactory<ScheduleTable, String>("Eventnamecolumn"));
        
        try {
            binFileToTable();
            
            
            // TODO
        } catch (IOException ex) {
            Logger.getLogger(lawyerScheduleController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(lawyerScheduleController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    @FXML
    private void backbuttonOnClick(ActionEvent event) throws IOException{
        SceneSwitcher toProfileScene = new SceneSwitcher("lawyer dashboard.fxml",event);
        toProfileScene.ConfirmSceneSwitch();
    }
    

    @FXML
    private void addButtonOnClick(ActionEvent event) throws IOException, FileNotFoundException, ClassNotFoundException {
        NewSchedule i;
        i = new NewSchedule(
                customerusername.getText(),
                
                datepicker.getValue(),
                eventnametextfield.getText()
                
        );
        
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File xFile = null;
        
        try{
            xFile = new File("NewSchedule.bin");
            if(xFile.exists()){
                fos = new FileOutputStream(xFile);
                oos = new AppendableObjectOutputStream(fos);
            }else{
                fos = new FileOutputStream(xFile);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(i);
            System.out.println("write object successful");
           
            }catch (IOException ex){
                Logger.getLogger(lawyerScheduleController.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
            try{
                if(oos!=null){
                    oos.close();
                }
            }catch(IOException ex){
                Logger.getLogger(lawyerScheduleController.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
        binFileToTable();
        
        
    }

    @FXML
    private void signoutbuttonOnclick(ActionEvent event) {
    }

    @FXML
    private void savebuttonOnclick(ActionEvent event) {
    }

    @FXML
    private void reloadButtonOnclick(ActionEvent event) {
    }
    private void binFileToTable() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObservableList<ScheduleTable> loadedInstances = FXCollections.observableArrayList();

        File myFile = new File("NewSchedule.bin");

        if (myFile.exists())
        {
            FileInputStream fis = new FileInputStream(myFile);

            ObjectInputStream ois = new ObjectInputStream(fis);
         
            try
            {
                
               while (true)
                {
                    NewSchedule ns1 = (NewSchedule) ois.readObject();
                    
                    loadedInstances.add(new ScheduleTable(ns1));
                }
            }
            catch (EOFException ex)
            {
                lawyertable.setItems(loadedInstances);
            }
        }
    }

}
