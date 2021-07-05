package sample.events;
/**
 * Created by Naftali on 05.07.2021
 * 11 section - 49 lesson
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class EventHandlingClickCounter extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    int count = 0;

    @Override
    public void start(Stage primaryStage) {

        Button btnClickMe = new Button("Click Me");
            btnClickMe.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    count++;
                    System.out.println("You have clicked the button " + count + " times");
                }
            });

        BorderPane borderPane = new BorderPane();
            borderPane.setCenter(btnClickMe);

        Scene scene = new Scene(borderPane, 500, 500);

        primaryStage.setTitle("Event Click Counter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
