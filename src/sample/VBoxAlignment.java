package sample;
/**
 * Created by Naftali on 2021-05-30
 * 4 section - 18 lesson
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxAlignment extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        //3 options make VBox layout
        //option 1
        VBox vBox = new VBox(20, btn1, btn2, btn3);
            vBox.setPadding(new Insets(10));
            vBox.setAlignment(Pos.BOTTOM_LEFT);

        Scene scene = new Scene(vBox, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("VBox Alignment Example");
        primaryStage.show();

    }
}
