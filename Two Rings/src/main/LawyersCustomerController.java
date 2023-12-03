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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class LawyersCustomerController implements Initializable {

    @FXML
    private Label tworingslogolabel;
    @FXML
    private Button helpcenterlabel;
    @FXML
    private Button settingslabel;
    @FXML
    private Button Aboutlabel;
    @FXML
    private Button dashboardlabel;
    @FXML
    private TableColumn<Customerlawyertable, String> usernamecolumn;
    
    @FXML
    private TableView<Customerlawyertable> lawyerCustomertable;
    
    @FXML
    private TableColumn<Customerlawyertable, String> emailaddcolumn;
    @FXML
    private TableColumn<Customerlawyertable, LocalDate> eventdatecolumn;
    @FXML
    private TableColumn<Customerlawyertable, Venue> locationcolumn;
    @FXML
    private TextArea lawyercustomertextarea;
    
    public ArrayList<CustomerLawyerModel> eventList= new ArrayList<CustomerLawyerModel>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        usernamecolumn.setCellValueFactory(new PropertyValueFactory<Customerlawyertable, String>("EventName"));
        emailaddcolumn.setCellValueFactory(new PropertyValueFactory<Customerlawyertable, String>("username"));
        
        eventdatecolumn.setCellValueFactory(new PropertyValueFactory<Customerlawyertable, LocalDate>("location"));
        locationcolumn.setCellValueFactory(new PropertyValueFactory<Customerlawyertable, Venue>("Eventdate"));
        
        // TODO
    }    

    @FXML
    private void showbuttonOnclick(ActionEvent event) {
        
        
        
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        File xFile = null;
        
        
        try{
            xFile = new File("Customer info to event manegment.bin");
            fis = new FileInputStream(xFile);
            ois = new ObjectInputStream(fis);
            CustomerLawyerModel tempVar;
            try{
                while(true){
                    tempVar = (CustomerLawyerModel) ois.readObject();
                    eventList.add(tempVar);
                }
            }
            catch(EOFException e){
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LawyersCustomerController.class.getName()).log(Level.SEVERE, null, ex);
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
            lawyerCustomertable.getItems().add(new Customerlawyertable(
                    eventList.get(i).username,
                    eventList.get(i).email,
                    eventList.get(i).eventdate,
                    eventList.get(i).venue)
            );
            i++;
        }
        
    
        
        
    }

    @FXML
    private void sendbuttonOnclick(ActionEvent event) {
       
        
        
        
        
    }

    @FXML
    private void backbuttononclick(ActionEvent event)  throws IOException{
        SceneSwitcher toProfileScene = new SceneSwitcher("lawyer dashboard.fxml",event);
        toProfileScene.ConfirmSceneSwitch();
    }
    
}
