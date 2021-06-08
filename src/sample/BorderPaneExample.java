package sample;
/**
 * Created by Naftali on 2021-05-31
 * 4 section - 22 lesson
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("File");
        Button btn2 = new Button("Menu");
        Button btn3 = new Button("New");
        Button btn4 = new Button("Save");
        Button btn5 = new Button("Exit");
        Button btn6 = new Button("Button Number 6");

        BorderPane borderPane = new BorderPane();
            borderPane.setCenter(btn1);
            borderPane.setTop(btn2);
            borderPane.setBottom(btn3);
            borderPane.setLeft(btn4);
            borderPane.setRight(btn5);
//        BorderPane.setAlignment(btn6, Pos.TOP_RIGHT); //not working

            borderPane.setPadding(new Insets(10));

        Scene scene = new Scene(borderPane, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Border Pane Example");
        primaryStage.show();
    }
}
