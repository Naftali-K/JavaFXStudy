package sample;
/**
 * Created by Naftali on
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxPaddingAndSpacing extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        HBox hBox = new HBox(btn1, btn2, btn3);
        hBox.setPadding(new Insets(10)); //top, right, bottom, left = 10
//        hBox.setPadding(new Insets(20, 10, 15, 10)); //top - 20; right - 10; bottom - 15; left - 10
        //set only padding to hBox to scene, not between elements/objects
        hBox.setSpacing(30);

        Scene scene = new Scene(hBox, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
