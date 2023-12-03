/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class LawyerRegisterController implements Initializable {

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
    private TextField nametextfield;
    @FXML
    private TextField IDtextfield;
    @FXML
    private TextField addresstextfield;
    @FXML
    private DatePicker DOEdatepicker;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showButtonOnclick(ActionEvent event) throws IOException {
        LawyerInfoTable i;
        i = new LawyerInfoTable(
                nametextfield.getText(),
                IDtextfield.getText(),
                DOEdatepicker.getValue(),
                addresstextfield.getText()
                
        );
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File xFile = null;
        
        try{
            xFile = new File("LawyerInfoToRegistor.bin");
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
                Logger.getLogger(LawyerRegisterController.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
            try{
                if(oos!=null){
                    oos.close();
                }
            }catch(IOException ex){
                Logger.getLogger(LawyerRegisterController.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
                   
                
    }    
    @FXML
    private void backbuttononclick(ActionEvent event)  throws IOException{
        SceneSwitcher toProfileScene = new SceneSwitcher("lawyer dashboard.fxml",event);
        toProfileScene.ConfirmSceneSwitch();
    }
    
}
