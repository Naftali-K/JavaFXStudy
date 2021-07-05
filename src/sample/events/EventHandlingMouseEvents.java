package sample.events;
/**
 * Created by Naftali on 05.07.2021
 * 11 section - 50 lesson
 */

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class EventHandlingMouseEvents extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Label label = new Label("Type of event");

        Circle circle = new Circle(100, 300, 75);
            circle.setFill(Color.RED);
            circle.setStrokeWidth(5);

            circle.setOnMouseEntered(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    label.setText("Type of event: Mouse Entered");
                }
            });

            circle.setOnMouseExited(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    label.setText("Type of event: Mouse Exited");
                }
            });

            circle.setOnMousePressed(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    label.setText("Type of event: Mouse Pressed");
                }
            });

        BorderPane borderPane = new BorderPane();
            borderPane.setTop(label);
            borderPane.setCenter(circle);
            borderPane.setPadding(new Insets(10));

        Scene scene = new Scene(borderPane, 700, 700);

        primaryStage.setTitle("Event Handling Mouse Events");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
