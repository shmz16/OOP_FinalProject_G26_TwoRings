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
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class CEOMeetingController implements Initializable {

    @FXML
    private DatePicker meetingDate;
    @FXML
    private TextField timeTextField;
    @FXML
    private Button bookBT;
    @FXML
    private TableView<Meeting> meetingTable;
    @FXML
    private TableColumn<Meeting, String> meetingWithColomn;
    @FXML
    private TableColumn<Meeting, LocalDate> meetingDateColomn;
    @FXML
    private TableColumn<Meeting, String> meetingTimeColomn;
    @FXML
    private ComboBox<String> meetingWithCombo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String[] ll = {"Laywer", "Register", "Marketing Maneger", "Event Maneger", "Accountant"};
        meetingWithCombo.getItems().addAll(ll);

    }

    @FXML
    private void bookMeetingOnClick(ActionEvent event) {
        ObservableList<Meeting> meetingIns = FXCollections.observableArrayList();
        String meetWithVal = meetingWithCombo.getValue();
        LocalDate meetingDay = meetingDate.getValue();
        String time = timeTextField.getText();

        Meeting meet1 = new Meeting(meetingDay, meetWithVal, time);

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("MeetingDateFile.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);

            }
            Meeting temp = new Meeting(meetingDay, meetWithVal, time);

            oos.writeObject(temp);
            System.out.println(temp);

        } catch (IOException ex) {
            Logger.getLogger(CEOMeetingController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(CEOMeetingController.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
        bookBT.setText("Metting Booked!");
    }

    @FXML
    private void showMeetingTable(ActionEvent event) throws IOException, ClassNotFoundException {
        ObservableList<Meeting> observableMettinglist = FXCollections.observableArrayList();

        meetingWithColomn.setCellValueFactory(new PropertyValueFactory<Meeting, String>("meetingWith"));
        meetingTimeColomn.setCellValueFactory(new PropertyValueFactory<Meeting, String>("meetingTime"));
        meetingDateColomn.setCellValueFactory(new PropertyValueFactory<Meeting, LocalDate>("meetingdate"));

        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("MeetingDateFile.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Meeting emp;
            try {
                while (true) {
                    System.out.println("Hello Again");
                    emp = (Meeting) ois.readObject();
                    System.out.println("Reading file");
                    observableMettinglist.add(emp);
                    System.out.println(emp.toString());

                }
            } catch (Exception e){
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
        meetingTable.setItems(observableMettinglist);
    }

    @FXML
    private void prevPage(ActionEvent event) throws IOException {

        SceneSwitcher meet = new SceneSwitcher("CEOpage.fxml", event);
        meet.ConfirmSceneSwitch();
    }

}
