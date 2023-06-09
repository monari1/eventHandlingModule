package com.example.eventhandlingmodule;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

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

//        CREATE AN ANIMATION FOR ALTERNATING TEXT
        Timeline animation = new Timeline(new KeyFrame(Duration.seconds(0.5), eventHandler));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

//        PAUSE AND RESUME ANIMATION
        text.setOnMouseClicked(e->{
            if(animation.getStatus()== Animation.Status.PAUSED)
                animation.play();
            else
                animation.pause();

        });

//        SCENE

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Timeline animation demo");
        primaryStage.setScene(scene);
        primaryStage.show();





    }
}
