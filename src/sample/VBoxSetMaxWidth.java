package sample;
/**
 * Created by Naftali on 2021-05-30
 * 4 section - 19 lesson
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxSetMaxWidth extends Application {

    private final Double buttonWidth = 150.0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Number One");
        Button btn2 = new Button("Two");
        Button btn3 = new Button("The Third Button");

        //3 options make VBox layout
        //option 1
        VBox vBox = new VBox(20, btn1, btn2, btn3);
        vBox.setPadding(new Insets(10));
        vBox.setAlignment(Pos.TOP_RIGHT);

//        btn1.setMaxWidth(Double.MAX_VALUE); // MAX_VALUE - set width of buttons max size of scene
//        btn2.setMaxWidth(Double.MAX_VALUE);
//        btn3.setMaxWidth(Double.MAX_VALUE);

        btn1.setMaxWidth(buttonWidth);
        btn2.setMaxWidth(buttonWidth);
        btn3.setMaxWidth(buttonWidth);

        Scene scene = new Scene(vBox, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("VBox SetMaxWidth Example");
        primaryStage.show();

    }
}
