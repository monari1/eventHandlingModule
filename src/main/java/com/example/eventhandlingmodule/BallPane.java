package com.example.eventhandlingmodule;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
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

    public  void play(){
        animation.play();
    }
    public  void pause(){
        animation.pause();
    }
    public  void increaseSpeed(){
        animation.setRate(animation.getRate()+1);
    }
    public  void decreaseSpeed(){
        animation.setRate(animation.getRate()>0 ? animation.getRate()-0.1:0);

    }
    public DoubleProperty rateProperty(){
        return animation.rateProperty();
    }
    protected  void moveBall(){
        if (x < radius|| x > getWidth()-radius){
            dx *= -1; // check boundaries
        }

        if (x < radius|| y > getHeight()-radius){
            dy *= -1; // check boundaries
        }

//        adjust ball position

        x += dx;
        y += dy;

        circle.setCenterX(x);
        circle.setCenterY(y);
    }


}
