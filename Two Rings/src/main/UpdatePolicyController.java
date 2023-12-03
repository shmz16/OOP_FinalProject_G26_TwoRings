/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class UpdatePolicyController implements Initializable {

    @FXML
    private TextArea policyTextArea;
    private String policy = "Privacy Policy for Two Rings\n"
            + "\n"
            + "Last Updated: 23/11/2023\n"
            + "\n"
            + "This page informs you of our policies regarding the collection, use, and disclosure of Personal Information we receive from users of the Site.\n"
            + "\n"
            + "1. Information Collection and Use:\n"
            + "\n"
            + "a. Personal Information:\n"
            + "\n"
            + "While using our Site, we may ask you to provide us with certain personally identifiable information that can be used to contact or identify you (\"Personal Information\"). Personally identifiable information may include, but is not limited to, your name, email address, phone number, and other information required for marriage registration.\n"
            + "b. Log Data:\n"
            + "\n"
            + "Like many site operators, we collect information that your browser sends whenever you visit our Site (\"Log Data\"). This Log Data may include information such as your computer's Internet Protocol (\"IP\") address, browser type, browser version, and the pages of our Site that you visit.\n"
            + "2. Use of Personal Information:\n"
            + "\n"
            + "We may use your Personal Information to contact you with newsletters, marketing, or promotional materials related to marriage registration services.\n"
            + "3. Cookies:\n"
            + "\n"
            + "Cookies are files with small amounts of data, which may include an anonymous unique identifier. Cookies are sent to your browser from a web site and stored on your computer's hard drive. Like many sites, we use \"cookies\" to collect information. You can instruct your browser to refuse all cookies or to indicate when a cookie is being sent.\n"
            + "4. Security:\n"
            + "\n"
            + "The security of your Personal Information is important to us, but remember that no method of transmission over the Internet, or method of electronic storage, is 100% secure. While we strive to use commercially acceptable means to protect your Personal Information, we cannot guarantee its absolute security.\n"
            + "5. Changes to This Privacy Policy:\n"
            + "\n"
            + "This Privacy Policy is effective as of [Date] and will remain in effect except with respect to any changes in its provisions in the future, which will be in effect immediately after being posted on this page.\n"
            + "\n"
            + "We reserve the right to update or change our Privacy Policy at any time, and you should check this Privacy Policy periodically. Your continued use of the Service after we post any modifications to the Privacy Policy on this page will constitute your acknowledgment of the modifications and your consent to abide and be bound by the modified Privacy Policy.\n"
            + "\n"
            + "6. Contact Us:\n"
            + "\n"
            + "If you have any questions about this Privacy Policy, please contact us at tworings@gmail.com.";
    Policy temp = new Policy(policy);

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        policyTextArea.clear();
        policyTextArea.setText(temp.getPolicy());

    }

    @FXML
    private void prevPage(ActionEvent event) throws IOException {
        SceneSwitcher ceoSc = new SceneSwitcher("CEOpage.fxml", event);
        ceoSc.ConfirmSceneSwitch();

    }

    @FXML
    private void updatePolicyOnClick(ActionEvent event) {
        String update = policyTextArea.getText();
        temp.setPolicy(update);
        policyTextArea.setText(temp.getPolicy());
    }

    @FXML
    private void updatePolicyOnClickButTextFile(ActionEvent event) {
        File f = null;
        FileWriter fw = null;
//        FileChooser fc = null;

        try {
              f = new File("Policy.text");
//            fc = new FileChooser();
//
//            f = fc.showSaveDialog(null);
              fw = new FileWriter(f);

            if (f == null) {

                return;
            }
            if (f.exists()) {
                fw = new FileWriter(f, true);
            } else {
                fw = new FileWriter(f);
            }

            fw.write(policyTextArea.getText());

        } catch (IOException ex) {
            Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }

            } catch (IOException ex) {
                Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        policyTextArea.clear();

        Scanner sc;
//        String str;
//        String[] tokens;
        try {
            f = new File("Policy.txt");

//            f = fc.showOpenDialog(null);
            sc = new Scanner(f);
            if (f.exists()) {

                while (sc.hasNextLine()) {
                    policyTextArea.setText(sc.nextLine());
                }
            } else {
               
            }
        } catch (IOException ex) {
            Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
    }

    // Now reading the text file and writing it to the policy TextArea,
    @FXML
    private void textF(ActionEvent event) {

//        policyTextArea.clear();
//        File f = null;
//        //FileReader fw = null;
//        Scanner sc;
//        String str;
//        String[] tokens;
//        try {
//            //f = new File("EmpText.txt");
//            FileChooser fc = new FileChooser();
//            f = fc.showOpenDialog(null);
//            sc = new Scanner(f);
//            if (f.exists()) {
//                outputTextArea.appendText("Content of Emp.txt:\n");
//                while (sc.hasNextLine()) {
//                    str = sc.nextLine();
//                    tokens = str.split(",");
//                    outputTextArea.appendText(
//                            "Id=" + tokens[0]
//                            + ", Name=" + tokens[1]
//                            + ", Designation=" + tokens[2]
//                            + ", Salary=" + tokens[3] + "\n"
//                    );
//                }
//            } else {
//                outputTextArea.setText("oops! Emp.txt does not exist...");
//            }
//        } catch (IOException ex) {
//            Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//        }
    }

}
