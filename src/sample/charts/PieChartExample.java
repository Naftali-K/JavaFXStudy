package sample.charts;
/**
 * Created by Naftali on 14.06.2021
 * 9 section - 37 lesson
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PieChartExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        PieChart pieChart = new PieChart();

        PieChart.Data desktopData = new PieChart.Data("Desktop", 213);
        PieChart.Data phoneData = new PieChart.Data("Phone", 67);
        PieChart.Data tabletData = new PieChart.Data("Tablet", 36);

        pieChart.getData().addAll(desktopData, phoneData, tabletData);

        BorderPane borderPane = new BorderPane();
            borderPane.setCenter(pieChart);

        Scene scene = new Scene(borderPane, 300, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Pie Chart Example");
        primaryStage.show();
    }
}
