package com.example.hellofx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
    private static final String INITIAL_MESSAGE = "Welcome to JavaFX!";

    @Override
    public void start(Stage stage) {
        Label message = new Label(INITIAL_MESSAGE);

        Button clickMeButton = new Button("Click Me");
        clickMeButton.setOnAction(event ->
            message.setText("Great! You clicked the button.")
        );

        Button resetButton = new Button("Reset");
        resetButton.setOnAction(event -> message.setText(INITIAL_MESSAGE));

        VBox layout = new VBox(20, message, clickMeButton, resetButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 500, 300);
        stage.setTitle("My First JavaFX Application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
