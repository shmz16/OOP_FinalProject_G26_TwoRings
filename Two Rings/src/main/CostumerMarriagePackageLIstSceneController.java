/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author LENOVO ThinkPad
 */
public class CostumerMarriagePackageLIstSceneController implements Initializable {

    @FXML
    private DatePicker eventdatepik;
    @FXML
    private ComboBox<String> eventCombobox;
    private TableColumn<MarriagePackageTable, String> codeCol;
    private TableColumn<MarriagePackageTable, String> pkgCol;
    private TableColumn<MarriagePackageTable, String> priceCol;
    @FXML
    private TextArea packagesTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String[] countryCodes = Locale.getISOCountries();

        // Create an array to store country names
        String[] countryNames = new String[countryCodes.length];

        // Populate the array with country names
        for (int i = 0; i < countryCodes.length; i++) {
            Locale locale = new Locale("", countryCodes[i]);
            countryNames[i] = locale.getDisplayCountry();
           
        }
        eventCombobox.getItems().addAll(countryNames);
    }    

    @FXML
    private void signOutButtonOnClick(ActionEvent event) throws IOException{
           SceneSwitcher switchTolawyerScene = new SceneSwitcher("SignInScene.fxml", event);
        switchTolawyerScene.ConfirmSceneSwitch();
    }

    @FXML
    private void helpcenteronclick(ActionEvent event)throws IOException{
           SceneSwitcher switchTolawyerScene = new SceneSwitcher("CostumerHelpCenterScene.fxml", event);
        switchTolawyerScene.ConfirmSceneSwitch();
    }

    @FXML
    private void aboutbuttononclick(ActionEvent event) throws IOException{
           SceneSwitcher switchTolawyerScene = new SceneSwitcher("CostumerHelpCenterScene.fxml", event);
        switchTolawyerScene.ConfirmSceneSwitch();
    }

    @FXML
    private void homebuttononclick(ActionEvent event)throws IOException{
           SceneSwitcher switchTolawyerScene = new SceneSwitcher("CostumerAboutScene.fxml", event);
        switchTolawyerScene.ConfirmSceneSwitch();
    }

    @FXML
    private void backbuttononclick(ActionEvent event)throws IOException{
           SceneSwitcher switchTolawyerScene = new SceneSwitcher("CostumerDashBoardScene.fxml", event);
        switchTolawyerScene.ConfirmSceneSwitch();
    }

    @FXML
    private void donebuttononclick(ActionEvent event) {
         MarriagePackageTable i = new MarriagePackageTable(
                eventdatepik.getValue(),
                eventCombobox.getValue());
        
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Customer Marriage Package info.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);
            System.out.println("write object sucessfull ");

        } catch (IOException ex) {
            Logger.getLogger(CostumerMarriagePackageLIstSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(CostumerMarriagePackageLIstSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        ObservableList<MarriagePackageTable> venueschedules = FXCollections.observableArrayList();
        
            codeCol.setCellValueFactory(new PropertyValueFactory<>("code"));
            pkgCol.setCellValueFactory(new PropertyValueFactory<>("pkg"));
            priceCol.setCellValueFactory(new PropertyValueFactory<>("Price"));
            
        
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("Customer Marriage Package info.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            MarriagePackageTable p;
            try {
                while (true) {
                    p = (MarriagePackageTable) ois.readObject();
                    venueschedules.add(p);
                }
            } catch (IOException | ClassNotFoundException e) {
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }
        }
        MarriagePackageTable.setItems(venueschedules);
    }

    
}
