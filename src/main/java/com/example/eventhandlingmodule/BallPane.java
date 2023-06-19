package com.example.eventhandlingmodule;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BallPane extends Pane {
//    we start by initializing and declaring variables
    public  final double radius = 20;
    private double x = radius, y = radius;
    private double dx = 1, dy = 1;
    private Circle circle = new Circle(x, y, radius);
    private Timeline animation;

//    creating the ball and animation

    public BallPane(){
        circle.setFill(Color.YELLOW);
        circle.setStroke(Color.BLACK);
        getChildren().add(circle);
        animation = new Timeline(
                new KeyFrame(Duration.seconds(0.5), e->moveBall())
        );
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

    }


}
