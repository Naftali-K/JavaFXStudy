package sample.fullExamples;
/**
 * Created by Naftali on 13.06.2021
 * 8 section
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        MenuBar menuBar = new MenuBar();

        // Menu ---------------------------
        Menu fileMenu = new Menu("File");

        MenuItem newMenuItem = new MenuItem("New");
        MenuItem saveMenuItem = new MenuItem("Save");
        MenuItem exitMenuItem = new MenuItem("Exit");

        fileMenu.getItems().addAll(newMenuItem, saveMenuItem, exitMenuItem);

        // Web Menu ------------------------
        Menu webMenu = new Menu("Web");

        CheckMenuItem htmlMenuItem = new CheckMenuItem("HTML");
            htmlMenuItem.setSelected(true);
        CheckMenuItem cssMenuItem = new CheckMenuItem("CSS");
            cssMenuItem.setSelected(true);

        webMenu.getItems().addAll(htmlMenuItem, cssMenuItem);

        //SQL Menu -------------------------
        Menu sqlMenu = new Menu("SQL");

        ToggleGroup toggleGroup = new ToggleGroup();

        RadioMenuItem mySqlItem = new RadioMenuItem("MySQL");
            mySqlItem.setToggleGroup(toggleGroup);
        RadioMenuItem oracleItem = new RadioMenuItem("Oracle");
            oracleItem.setToggleGroup(toggleGroup);

        Menu tutorialMenu = new Menu("Tutorial");

        MenuItem javaItem = new MenuItem("Java");
        MenuItem javaFxItem = new MenuItem("JavaFX");
        MenuItem swingItem = new MenuItem("Swing");

        tutorialMenu.getItems().addAll(javaItem, javaFxItem, swingItem);

        sqlMenu.getItems().addAll(mySqlItem, oracleItem, tutorialMenu);

        //add all menu to menu bar
        menuBar.getMenus().addAll(fileMenu, webMenu, sqlMenu);


        BorderPane borderPane = new BorderPane();
            borderPane.setTop(menuBar);

        Scene scene = new Scene(borderPane, 300, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Menu Bar");
        primaryStage.show();

    }
}
