/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author User
 */
public class BackButton {
    
    private ActionEvent event;

    public BackButton(ActionEvent event) {
        this.event = event;
    }
    
    public void AccountantBackButton() throws IOException{
        SceneSwitcher accountantBackToDashboard = new SceneSwitcher("AccountantDashboardScene.fxml", event);
        accountantBackToDashboard.ConfirmSceneSwitch();
    };
    
    public void MarketingBackButton() throws IOException{
        SceneSwitcher marketingBackToDashboard = new SceneSwitcher("MarketingDashboardScene.fxml", event);
        marketingBackToDashboard.ConfirmSceneSwitch();
    };
}
