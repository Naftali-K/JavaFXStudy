package sample.fullExamples;
/**
 * Created by Naftali on 2021-06-07
 * 6 section
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginPage extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label emailLabel = new Label("Email");
        Label passwordLabel = new Label("Password");

        Button submitBtn = new Button("Submit");
        Button clearBtn = new Button("Clear");

        TextField emailTextField = new TextField();
            emailTextField.setPromptText("Email");
        PasswordField passwordField = new PasswordField();
            passwordField.setPromptText("Password");

        GridPane gridPane = new GridPane();
            gridPane.setPadding(new Insets(15));
            gridPane.setHgap(10);
            gridPane.setVgap(10);
            gridPane.setAlignment(Pos.CENTER);

            gridPane.add(emailLabel, 0, 0);
            gridPane.add(emailTextField, 1, 0);

            gridPane.add(passwordLabel, 0, 1);
            gridPane.add(passwordField, 1, 1);

            gridPane.add(submitBtn, 0, 2);
            gridPane.add(clearBtn, 1, 2);

        Scene scene = new Scene(gridPane, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Login Page");
        primaryStage.show();
    }
}
