package sample.charts;
/**
 * Created by Naftali on 14.06.2021
 * 9 section - 38 lesson
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BarChartExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        CategoryAxis categoryAxis = new CategoryAxis(); //category - is x axis (horisontal)
            categoryAxis.setLabel("Devices"); //name of category (x axis)

        NumberAxis numberAxis = new NumberAxis(); //numbers - is y axis (vertical)
            numberAxis.setLabel("Visits");

        BarChart barChart = new BarChart(categoryAxis, numberAxis); //set names to x and y for BarChart

        XYChart.Series dataOfChart = new XYChart.Series();
            dataOfChart.setName("Visit the devices 2021");

            dataOfChart.getData().add(new XYChart.Data("Desktop", 178));
            dataOfChart.getData().add(new XYChart.Data("Phone", 65));
            dataOfChart.getData().add(new XYChart.Data("Tablet", 23));

        barChart.getData().add(dataOfChart);

        BorderPane borderPane = new BorderPane();
            borderPane.setCenter(barChart);

        Scene scene = new Scene(borderPane, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Bar Chart Example");
        primaryStage.show();

    }
}
