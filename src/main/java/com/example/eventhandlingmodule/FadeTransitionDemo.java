package com.example.eventhandlingmodule;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FadeTransitionDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        Ellipse ellipse = new Ellipse(100, 100, 200, 150);
        ellipse.setFill(Color.AQUAMARINE);
        ellipse.setStroke(Color.BLACK);
        ellipse.centerXProperty().bind(pane.widthProperty().divide(2));
        ellipse.centerYProperty().bind(pane.heightProperty().divide(2));
        ellipse.radiusXProperty().bind(
                pane.widthProperty().multiply(0.4));
        ellipse.radiusYProperty().bind(
                pane.heightProperty().multiply(0.4));
        pane.getChildren().add(ellipse);
//        pane.getChildren().add(ellipse);

        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(3), ellipse);
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0.1);
        fadeTransition.setCycleCount(Timeline.INDEFINITE);
        fadeTransition.setAutoReverse(true);
        fadeTransition.play();

        ellipse.setOnMousePressed(e -> fadeTransition.pause());
        ellipse.setOnMouseReleased(e -> fadeTransition.play());

        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("Fade Transition Demo");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
