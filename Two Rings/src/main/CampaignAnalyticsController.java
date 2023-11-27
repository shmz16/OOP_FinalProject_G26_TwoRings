/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
    private PieChart adByPlatform;
    @FXML
    private TextField lineChartLabel;

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
    }

    @FXML
    private void loadLineChartOnClick(ActionEvent event) {

        reacgOverTheYearLineChart.getData().clear();
        XYChart.Series<String, Number> series1 = new XYChart.Series<String, Number>();
        series1.getData().add(new XYChart.Data<String, Number>("Jan", 200));
        series1.getData().add(new XYChart.Data<String, Number>("Feb", 500));
        series1.getData().add(new XYChart.Data<String, Number>("Mar", 300));
        series1.getData().add(new XYChart.Data<String, Number>("Apr", 600));
        series1.setName("Pay-1");

        XYChart.Series<String, Number> series2 = new XYChart.Series<String, Number>();
        series2.getData().add(new XYChart.Data<String, Number>("Jan", 400));
        series2.getData().add(new XYChart.Data<String, Number>("Feb", 100));
        series2.getData().add(new XYChart.Data<String, Number>("Mar", 800));
        series2.getData().add(new XYChart.Data<String, Number>("Apr", 500));
        series2.setName("Pay-2");

        XYChart.Series<String, Number> series3 = new XYChart.Series<String, Number>();
        series3.getData().add(new XYChart.Data<String, Number>("Jan", 500));
        series3.getData().add(new XYChart.Data<String, Number>("Feb", 900));
        series3.getData().add(new XYChart.Data<String, Number>("Mar", 450));
        series3.getData().add(new XYChart.Data<String, Number>("Apr", 650));
        series3.setName("Pay-3");

        reacgOverTheYearLineChart.getData().addAll(series1, series2, series3);

        

    }

}
