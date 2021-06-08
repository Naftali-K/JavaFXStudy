package sample;
/**
 * Created by Naftali on 2021-05-22
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxOption extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Button 1"); //for not use 2 lines, can add in constructor text to btn = btn1.setText("Button 1")
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        //add btns to HBox by constructor
        HBox hBox = new HBox(btn1, btn2, btn3);

        //option to add btns after made object HBox
//        HBox hBox = new HBox();
//        hBox.getChildren().addAll(btn1, btn2, btn3);

        Scene scene = new Scene(hBox, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
