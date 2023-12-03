/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.Observable;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class CampaignAnalyticsController implements Initializable {

    @FXML
    private LineChart<String, Number> reacgOverTheYearLineChart;
    @FXML
    private TextField lineChartLabel;
    @FXML
    private PieChart adPieChart;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void prevPage(ActionEvent event) throws IOException {

        Parent sceneA = FXMLLoader.load(getClass().getResource("FinanceReport.fxml"));
        Scene sceneB = new Scene(sceneA);

        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg.setTitle("Finance Report!!");
        stg.setScene(sceneB);
        stg.show();
    }

    @FXML
    private void loadPieChartOnClick(ActionEvent event) {
        Random random = new Random();
        ObservableList<PieChart.Data> list = FXCollections.observableArrayList();
        list.add(new PieChart.Data("FaceBook", random.nextInt(1500)));
        list.add(new PieChart.Data("YouTube", random.nextInt(1500)));
        list.add(new PieChart.Data("Twitter", 535));
        list.add(new PieChart.Data("Television Ad", 1682));
        adPieChart.setData(list);
        
        
//        for(PieChart.Data data: adPieChart.getData()){
//            data.getNode().addEventHandler(int MOUSE_CLICKED, EventType eventType);
//            
//        }
    
    }

    @FXML
    private void loadLineChartOnClick(ActionEvent event) {
        
        Random random = new Random();
        

        reacgOverTheYearLineChart.getData().clear();
        XYChart.Series<String, Number> fbAd = new XYChart.Series<String, Number>();
        fbAd.getData().add(new XYChart.Data<String, Number>("Jan", random.nextInt(100)));
        fbAd.getData().add(new XYChart.Data<String, Number>("Feb", random.nextInt(100)));
        fbAd.getData().add(new XYChart.Data<String, Number>("Mar", random.nextInt(100)));
        fbAd.getData().add(new XYChart.Data<String, Number>("Apr", random.nextInt(100)));
        fbAd.getData().add(new XYChart.Data<String, Number>("May", random.nextInt(100)));
        fbAd.getData().add(new XYChart.Data<String, Number>("Jun", random.nextInt(100)));
        fbAd.getData().add(new XYChart.Data<String, Number>("Jul", random.nextInt(100)));
        fbAd.getData().add(new XYChart.Data<String, Number>("Aug", random.nextInt(100)));
        fbAd.getData().add(new XYChart.Data<String, Number>("Sep", random.nextInt(100)));
        fbAd.getData().add(new XYChart.Data<String, Number>("Oct", random.nextInt(100)));
        fbAd.getData().add(new XYChart.Data<String, Number>("Nov", random.nextInt(100)));
        fbAd.getData().add(new XYChart.Data<String, Number>("Dec", random.nextInt(100)));
        fbAd.setName("FaceBook Ad");

        XYChart.Series<String, Number> tvAd = new XYChart.Series<String, Number>();
        
        tvAd.getData().add(new XYChart.Data<String, Number>("Jan", random.nextInt(100)));
        tvAd.getData().add(new XYChart.Data<String, Number>("Feb", random.nextInt(100)));
        tvAd.getData().add(new XYChart.Data<String, Number>("Mar", random.nextInt(100)));
        tvAd.getData().add(new XYChart.Data<String, Number>("Apr", random.nextInt(100)));
        tvAd.getData().add(new XYChart.Data<String, Number>("May", random.nextInt(100)));
        tvAd.getData().add(new XYChart.Data<String, Number>("Jun", random.nextInt(100)));
        tvAd.getData().add(new XYChart.Data<String, Number>("Jul", random.nextInt(100)));
        tvAd.getData().add(new XYChart.Data<String, Number>("Aug", random.nextInt(100)));
        tvAd.getData().add(new XYChart.Data<String, Number>("Sep", random.nextInt(100)));
        tvAd.getData().add(new XYChart.Data<String, Number>("Oct", random.nextInt(100)));
        tvAd.getData().add(new XYChart.Data<String, Number>("Nov", random.nextInt(100)));
        tvAd.getData().add(new XYChart.Data<String, Number>("Dec", random.nextInt(100)));
        tvAd.setName("TV Comercial");

        XYChart.Series<String, Number> youtube = new XYChart.Series<String, Number>();
        youtube.getData().add(new XYChart.Data<String, Number>("Jan", random.nextInt(100)));
        youtube.getData().add(new XYChart.Data<String, Number>("Feb", 6));
        youtube.getData().add(new XYChart.Data<String, Number>("Mar", 226));
        youtube.getData().add(new XYChart.Data<String, Number>("Apr", 67));
        youtube.getData().add(new XYChart.Data<String, Number>("May", 43));
        youtube.getData().add(new XYChart.Data<String, Number>("Jun", 34));
        youtube.getData().add(new XYChart.Data<String, Number>("Jul", 43));
        youtube.getData().add(new XYChart.Data<String, Number>("Aug", 45));
        youtube.getData().add(new XYChart.Data<String, Number>("Sep", 4));
        youtube.getData().add(new XYChart.Data<String, Number>("Oct", 252));
        youtube.getData().add(new XYChart.Data<String, Number>("Nov", 2));
        youtube.getData().add(new XYChart.Data<String, Number>("Dec", 28));
        youtube.setName("YouTube Ad");
        
        XYChart.Series<String, Number> twitter = new XYChart.Series<String, Number>();
        twitter.getData().add(new XYChart.Data<String, Number>("Jan", random.nextInt(100)));
        twitter.getData().add(new XYChart.Data<String, Number>("Feb", random.nextInt(100)));
        twitter.getData().add(new XYChart.Data<String, Number>("Mar", random.nextInt(100)));
        twitter.getData().add(new XYChart.Data<String, Number>("Apr", random.nextInt(100)));
        twitter.getData().add(new XYChart.Data<String, Number>("May", random.nextInt(100)));
        twitter.getData().add(new XYChart.Data<String, Number>("Jun", random.nextInt(100)));
        twitter.getData().add(new XYChart.Data<String, Number>("Jul", random.nextInt(100)));
        twitter.getData().add(new XYChart.Data<String, Number>("Aug", random.nextInt(100)));
        twitter.getData().add(new XYChart.Data<String, Number>("Sep", random.nextInt(100)));
        twitter.getData().add(new XYChart.Data<String, Number>("Oct", random.nextInt(100)));
        twitter.getData().add(new XYChart.Data<String, Number>("Nov", random.nextInt(100)));
        twitter.getData().add(new XYChart.Data<String, Number>("Dec", random.nextInt(100)));
        twitter.setName("twitter Ad");

        reacgOverTheYearLineChart.getData().addAll(fbAd, tvAd, youtube,twitter);

    }

    @FXML
    private void ddddddddddD(ActionEvent event) {
    }

}
