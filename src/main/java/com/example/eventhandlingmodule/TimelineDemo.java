package com.example.eventhandlingmodule;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TimelineDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
        Text text = new Text(20, 50, "Programming is fun");
        text.setFill(Color.RED);
        pane.getChildren().add(text);
//        CREATE HANDLER FOR CHANGING TEXT
        EventHandler<ActionEvent> eventHandler = e->{
            if (text.getText().length()!=0){
                text.setText("");
            }
            else
                text.setText("Programming is Fun");
        };



    }
}
