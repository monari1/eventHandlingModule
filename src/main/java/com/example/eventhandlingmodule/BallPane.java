package com.example.eventhandlingmodule;

import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class BallPane extends Pane {
//    we start by initializing and declaring variables
    public  final double radius = 20;
    private double x = radius, y = radius;
    private double dx = 1, dy = 1;

    private Circle circle = new Circle(x, y, radius);

    private Timeline animation;


}
