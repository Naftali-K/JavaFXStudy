package sample.events;
/**
 * Created by Naftali on 04.07.2021
 * 11 section - 48 lesson
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class EventHandlingHelloWorld extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btnClickMe = new Button("Click Me");
            btnClickMe.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Hello World");
                }
            });

        BorderPane borderPane = new BorderPane();
            borderPane.setCenter(btnClickMe);

        Scene scene = new Scene(borderPane, 500, 500);

        primaryStage.setTitle("Event Handling");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
