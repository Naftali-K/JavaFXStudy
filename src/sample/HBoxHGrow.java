package sample;
/**
 * Created by Naftali on 2021-05-26
 * 4 section - 15 lesson
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class HBoxHGrow extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        HBox hBox = new HBox(btn1, btn2, spacer, btn3);
        HBox.setMargin(btn1, new Insets(10));
        HBox.setMargin(btn2, new Insets(10));
        HBox.setMargin(btn3, new Insets(10));

        Scene scene = new Scene(hBox, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("HBoxHGrow");
        primaryStage.show();

    }
}
