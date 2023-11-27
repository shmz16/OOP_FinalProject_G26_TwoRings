/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class SceneSwitcher {
    private String FXMLfile;
    private ActionEvent event;

    public SceneSwitcher(String FXMLfile, ActionEvent event) {
        this.FXMLfile = FXMLfile;
        this.event = event;
    }
    
    public void ConfirmSceneSwitch() throws IOException{
        Parent targetSceneParent = FXMLLoader.load(getClass().getResource(FXMLfile));
        Scene targetScene = new Scene(targetSceneParent);
        Stage currentStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        currentStage.setScene(targetScene);
    };
}
