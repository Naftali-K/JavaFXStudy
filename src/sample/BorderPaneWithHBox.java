package sample;
/**
 * Created by Naftali on 2021-05-31
 * 4 section - 23 lesson
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class BorderPaneWithHBox extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    final double spacingHBox = 10;
    final Insets spacing = new Insets(10);

    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("File");
        Button btn2 = new Button("Menu");
        Button btn3 = new Button("New");
        Button btn4 = new Button("Save");
        Button btn5 = new Button("Exit");

        HBox hBox1 = new HBox();
            hBox1.getChildren().addAll(btn1, btn2, btn3);
            hBox1.setSpacing(spacingHBox); //option 1 - set spacing in the code

        HBox hBox2 = new HBox(spacingHBox); //option 2 - set spacing in the constructor
            hBox2.getChildren().addAll(btn4, btn5);

        BorderPane borderPane = new BorderPane();
            borderPane.setTop(hBox1);
            borderPane.setBottom(hBox2);
            borderPane.setPadding(spacing);

        Scene scene = new Scene(borderPane, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Border Pane With HBox");
        primaryStage.show();
    }
}
