package sample.tableViewAddressBookExample;
/**
 * Created by Naftali on 11.07.2021
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AddressBookExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Label addressBookLabel = new Label("Address Book");
            addressBookLabel.setFont(new Font("Arial", 20));

        TableView table = new TableView();

        TableColumn nameColumn = new TableColumn("Name");
        TableColumn typeColumn = new TableColumn("Type");
        TableColumn constrainColumn = new TableColumn("Constrain");
        TableColumn refTableColumn = new TableColumn("Ref Table");
        TableColumn refColumnColumn = new TableColumn("Ref Column");
        TableColumn formatColumn = new TableColumn("Format");
        TableColumn lengthColumn = new TableColumn("Length");
        TableColumn precisionColumn = new TableColumn("Precision");
        TableColumn emptyColumn = new TableColumn("Empty");
        TableColumn defaultValueColumn = new TableColumn("Default Value");
        TableColumn dateColumn = new TableColumn("Date");
            TableColumn startDateColumn = new TableColumn("Data Start");
            TableColumn endDataColumn = new TableColumn("Data End");
            dateColumn.getColumns().addAll(startDateColumn, endDataColumn);

        table.getColumns().addAll(nameColumn, typeColumn, constrainColumn, refTableColumn, refColumnColumn,
                formatColumn, lengthColumn, precisionColumn, emptyColumn, defaultValueColumn, dateColumn);

        VBox vBox = new VBox(20);
            vBox.setPadding(new Insets(10));
            vBox.getChildren().addAll(addressBookLabel, table);

        Scene scene = new Scene(vBox, 1000, 400);

        primaryStage.setTitle("Address Book");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
