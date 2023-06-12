package com.example.eventhandlingmodule;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ClockAnimation extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ClockPane clock = new ClockPane();
        EventHandler<ActionEvent> eventHandler = e->{
            clock.setCurrentTime();
        };

        Timeline animation = new Timeline(new KeyFrame(Duration.seconds(1), eventHandler));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        Scene scene = new Scene(clock, 600, 600);
        primaryStage.setTitle("Clock animation");
        primaryStage.setScene(scene);
        primaryStage.show();



    }
}
