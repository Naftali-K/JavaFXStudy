package sample;
/**
 * Created by Naftali on 2021-05-31
 * 4 section - 20 lesson
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class GroupExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Button Number 1");
        Button btn2 = new Button("Button 2");

        Group group = new Group();
            group.getChildren().addAll(btn1, btn2);
//            group.getChildren().add(btn1);
//            group.getChildren().add(btn2);

        Scene scene = new Scene(group, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Group Example");
        primaryStage.show();
    }
}
