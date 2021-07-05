package sample.events;
/**
 * Created by Naftali on 05.07.2021
 * 11 section - 51 lesson
 */

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class EventHandlingKeyEvents extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        TextField textField = new TextField();
            textField.setOnKeyPressed(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent event) {
                    System.out.println("Key Pressed: " + event.getText() + " Code: " + event.getCode());
                }
            });

            textField.setOnKeyReleased(event -> { //new option with use lambda
                System.out.println("Key Released: " + event.getText() + " Character: " + event.getCharacter());
            });

            textField.setOnKeyTyped(event -> {
                System.out.println("Key Typed: " + event.getCode());
            });

        BorderPane borderPane = new BorderPane();
            borderPane.setTop(textField);

        Scene scene = new Scene(borderPane, 600, 600);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Event Handling Key Events");
        primaryStage.show();

    }
}
