package sample.fullExamples;
/**
 * Created by Naftali on 13.06.2021
 * 8 section - 36 lesson
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuCustomItemsExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");

        MenuItem newItem = new MenuItem("New");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");

        fileMenu.getItems().addAll(newItem, saveItem, exitItem);

        menuBar.getMenus().addAll(fileMenu);


        BorderPane borderPane = new BorderPane();
            borderPane.setTop(menuBar);

        Scene scene = new Scene(borderPane, 300, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Menu Custom Items Example");
        primaryStage.show();
    }
}
