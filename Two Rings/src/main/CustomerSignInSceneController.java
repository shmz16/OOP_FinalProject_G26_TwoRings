package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author LENOVO ThinkPad
 */
public class CustomerSignInSceneController implements Initializable {

    @FXML
    private TextField passcodeTextField;
    @FXML
    private AnchorPane forgetPasswordLabel;
    @FXML
    private Label errorLabel1;
    @FXML
    private Label errorLabel;
    @FXML
    private TextField userNameTextField;

    ArrayList<Customer> custList = new ArrayList<Customer>();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        File employeesFile = null;
        
        try {
            employeesFile = new File("EmployeeList.bin");
            fis = new FileInputStream(employeesFile);
            ois = new ObjectInputStream(fis);
            Customer tempCustomer;
            try {
                while (true) {
                    tempCustomer = (Customer) ois.readObject();
                    custList.add(tempCustomer);
                }
            } 
            catch (Exception e) {
            }
        } 
        catch (IOException ex) {
        }
        finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } 
            catch (IOException ex) {
            }
        }
    }    

    }    

    @FXML
    private void signInButtonOnClick(ActionEvent event) throws IOException{
        boolean loginSuccess = false;
        int i = 0;
        Customer currentCustomer = null;
        
        while (i < custList.size() || loginSuccess == false) {
            if (userNameTextField.getText()) == custList.get(i).username
                    && passcodeTextField.getText() == custList.get(i).password) {
                currentCustomer = custList.get(i);
                loginSuccess = true;
            }
        }
        if (loginSuccess == true) {    
            SceneSwitcher switchToCustomerDashboard = new SceneSwitcher("CostumerDashBoardScene", event);
            switchToCustomerDashboard.ConfirmSceneSwitch();
        }
        else {
            errorLabel1.setText("ID or password invalid. try again");
        }
        
          
    }

    @FXML
    private void creatAccountButtonOnClick(ActionEvent event) {
    }

    
}
