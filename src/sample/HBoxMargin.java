package sample;
/**
 * Created by Naftali on 2021-05-26
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxMargin extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        HBox hBox = new HBox(btn1, btn2, btn3);
        hBox.setPadding(new Insets(10));
        hBox.setSpacing(30);

//        HBox.setMargin(btn1, new Insets(10)); //right way to set margin to nodes
        hBox.setMargin(btn1, new Insets(10)); //version set margin to nodes from lessons
        hBox.setMargin(btn2, new Insets(20, 30, 40, 50));



        Scene scene = new Scene(hBox, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
