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
    private TableColumn<Customerlawyertable, Venue> eventdatecolumn;
    @FXML
    private TableColumn<Customerlawyertable, LocalDate> locationcolumn;
    @FXML
    private TextArea lawyercustomertextarea;
    
    public ArrayList<> eventList= new ArrayList<>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showbuttonOnclick(ActionEvent event) {
    }

    @FXML
    private void sendbuttonOnclick(ActionEvent event) {
        usernamecolumn.setCellvalueFactory(PropertyValueFactory<Customerlawyertable,String>("username: "));
        emailaddcolumn.setCellvalueFactory(PropertyValueFactory<Customerlawyertable,String>("emailadd: "));
        eventdatecolumn.setCellvalueFactory(PropertyValueFactory<Customerlawyertable,LocalDate>("eventdate: "));
        locationcolumn.setCellvalueFactory(PropertyValueFactory<Customerlawyertable,Venue>("location:  "));
        
        
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
            lawyerCustomertable.getItems().add(new Customerlawyertable(
                    eventList.get(i).username,
                    eventList.get(i).emailadd,
                    eventList.get(i).eventdate,
                    eventList.get(i).location)
            );
            i++;
        }
        
    }

    @FXML
    private void backbuttononclick(ActionEvent event)  throws IOException{
        SceneSwitcher toProfileScene = new SceneSwitcher("lawyer dashboard.fxml",event);
        toProfileScene.ConfirmSceneSwitch();
    }
    
}
