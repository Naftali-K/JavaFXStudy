package sample;
/**
 * Created by Naftali on
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneOption extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Click Me");

        Label label = new Label();
        label.setText("You have not clicked the button.");

        //Now we have two things: Button and Label
        //Need make new Layout, and we will use: BorderPane
        //BorderPane - using Top, Left, Center, Right, Bottom

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(label); //put the label on the top box
        borderPane.setCenter(btn); //put button on the center box
//        borderPane.setBottom(btn); //put button on the bottom box
//        borderPane.setLeft(btn); //put button on the left box

        Scene scene = new Scene(borderPane, 250, 150);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
