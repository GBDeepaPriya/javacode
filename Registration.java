package application;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.Window;

public class A2Q4 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle(" JavaFX Registration Form");

        // Create the registration form grid pane
        GridPane gridPane = createRegistrationFormPane();
        // Add UI controls to the registration form grid pane
        addUIControls(gridPane);
        // Create a scene with registration form grid pane as the root node
        Scene scene = new Scene(gridPane, 800, 500);
        // Set the scene in primary stage	
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }


    private GridPane createRegistrationFormPane() {
        // Instantiate a new Grid Pane
        GridPane gridPane = new GridPane();

        // Position the pane at the center of the screen, both vertically and horizontally
        gridPane.setAlignment(Pos.CENTER);

        // Set a padding of 20px on each side
        gridPane.setPadding(new Insets(40, 40, 40, 40));

        // Set the horizontal gap between columns
        gridPane.setHgap(10);

        // Set the vertical gap between rows
        gridPane.setVgap(10);

        return gridPane;
    }

    private void addUIControls(GridPane gridPane) {
        // Add Header
        Label headerLabel = new Label("Employee Registration Form");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        gridPane.add(headerLabel, 0,0,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(10, 0,10,0));

        // Add Name Label
        Label nameLabel = new Label("Enter your Name              :");
        gridPane.add(nameLabel, 0,1);

        // Add Name Text Field
        TextField nameField = new TextField("Enter your name");
        nameField.setPrefHeight(20);
        gridPane.add(nameField, 1,1);


        // Add Gender Label
        Label genderLabel = new Label("Select your Gender           :");
        gridPane.add(genderLabel, 0, 2);
        
        RadioButton r1 = new RadioButton("male"); 
        RadioButton r2 = new RadioButton("female"); 
        gridPane.add(r1, 1, 2);
        gridPane.add(r2,2, 2);

        // Add DOB Label
        Label dateLabel = new Label("Enter Date of Birth            : ");
        gridPane.add(dateLabel, 0, 3);
        
        //Creating a date picker
        DatePicker datePicker = new DatePicker();        
        gridPane.add(datePicker, 1, 3);

        // Add state Label
        Label stateLabel = new Label("Select your State              :");
        gridPane.add(stateLabel, 0, 4);
     
        //Choice box for states 
        ChoiceBox<String> statechoiceBox = new ChoiceBox<String>(); 
        statechoiceBox.getItems().addAll
        ("Karnataka", "Kerala", "Telangana", "Tripura", "Uttara Pradesh",
        "Maharashtra","Madhya pradesh","Gujarat","Odisha","Assam","Andra pradesh",
        "Bihar","Rajastan","Tamilnadu","Jammu Kashmira","Goa","Haryana","Panjab","West Bengal"); 
        gridPane.add(statechoiceBox, 1, 4);
        
        // Add Qualification Label
        Label qualificationLabel = new Label("Select your Qualification  :");
        gridPane.add(qualificationLabel, 0, 5);
        
        //check box for education Qualification
        CheckBox ugCheckBox = new CheckBox("UG"); 
        CheckBox pgCheckBox = new CheckBox("PG");
        CheckBox phdCheckBox = new CheckBox("PhD"); 
        gridPane.add(ugCheckBox, 1, 5);
        gridPane.add(pgCheckBox, 2, 5);
        gridPane.add(phdCheckBox, 3, 5);
        
        
        // Add Register Button
        Button submitButton = new Button("Register");
        submitButton.setPrefHeight(40);
        submitButton.setDefaultButton(true);
        submitButton.setPrefWidth(100);
        gridPane.add(submitButton, 0, 8, 2, 1);
        GridPane.setHalignment(submitButton, HPos.CENTER);
        GridPane.setMargin(submitButton, new Insets(20, 0,20,0));

        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(nameField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your name");
                    return;
                }
               
                showAlert(Alert. AlertType.INFORMATION, gridPane.getScene().getWindow(), "Registration Successful!", "Registration status ");
            }
        });
    }

    private void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(message);
        //alert.setContentText(message);
        Separator separator = new Separator();
		separator.setPrefWidth(180);
		
        alert.setContentText("Employee Registration successful!!");
        alert.initOwner(owner);
        alert.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
