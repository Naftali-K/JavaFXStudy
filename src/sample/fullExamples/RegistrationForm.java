package sample.fullExamples;
/**
 * Created by Naftali on 08.06.2021
 * 7 section
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RegistrationForm extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Label nameLabel = new Label("Name");
        Label dateOfBirthLabel = new Label("Date of Birth");
        Label genderLabel = new Label("Gender");
        Label technologiesKnownLabel = new Label("Technologies Known");
        Label educationQualificationLabel = new Label("Education Qualification");
        Label locationLabel = new Label("Location");

        TextField nameTextField = new TextField();
            nameTextField.setPromptText("Your Name");

        DatePicker dateOfBirthDatePicker = new DatePicker();

        ToggleGroup genderToggleGroup = new ToggleGroup(); //Group for radio. Also not giving decide both buttons, becouse one group
        RadioButton maleRadio = new RadioButton("male"); //Radio Buttons for group ToggleGroup
            maleRadio.setToggleGroup(genderToggleGroup);
        RadioButton femaleRadio = new RadioButton("female");
            femaleRadio.setToggleGroup(genderToggleGroup);

        CheckBox javaCheckBox = new CheckBox("Java");
        CheckBox dotNetCheckBox = new CheckBox("DotNet");

        ListView educationItems = new ListView();
            educationItems.getItems().add("Engineering");
            educationItems.getItems().add("MCA");
            educationItems.getItems().add("MBA");
            educationItems.getItems().add("Graduation");
            educationItems.getItems().add("MTech");

        ChoiceBox locationChoiceBox = new ChoiceBox();
            locationChoiceBox.getItems().addAll("US", "UK", "India", "Australia", "Europe", "Russia", "Israel");

        Button registerBtn = new Button("Register");
        Button cleanBtn = new Button("Clean");
        HBox buttonsHBox = new HBox();
            buttonsHBox.setSpacing(10);
            buttonsHBox.getChildren().add(registerBtn);
            buttonsHBox.getChildren().add(cleanBtn);



        GridPane gridPane = new GridPane();
            gridPane.setMinSize(500, 500);
            gridPane.setPadding(new Insets(15));
            gridPane.setHgap(10);
            gridPane.setVgap(10);

            gridPane.add(nameLabel, 0, 0);
            gridPane.add(nameTextField, 1, 0);

            gridPane.add(dateOfBirthLabel, 0, 1);
            gridPane.add(dateOfBirthDatePicker, 1, 1);

            gridPane.add(genderLabel, 0, 2);
            gridPane.add(maleRadio, 1, 2);
            gridPane.add(femaleRadio, 2, 2);

            gridPane.add(technologiesKnownLabel, 0, 3);
            gridPane.add(javaCheckBox, 1, 3);
            gridPane.add(dotNetCheckBox, 2, 3);

            gridPane.add(educationQualificationLabel, 0, 4);
            gridPane.add(educationItems, 1, 4);

            gridPane.add(locationLabel, 0, 5);
            gridPane.add(locationChoiceBox, 1, 5);

            gridPane.add(buttonsHBox, 2, 6);

        Scene scene = new Scene(gridPane, 700, 600);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Registration Form");
        primaryStage.show();

    }
}
