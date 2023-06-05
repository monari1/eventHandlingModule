package com.example.eventhandlingmodule;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FlagRisingAnimation extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        ImageView imageView = new ImageView("eventHandlingModule/src/main/images/download.gif");

        pane.getChildren().add(imageView);
        PathTransition pt = new PathTransition(Duration.seconds(10), new Line(100, 200, 100 , 0), imageView);

        pt.setCycleCount(5);
        pt.play();
        Scene scene = new Scene(pane, 250, 200);

        primaryStage.setTitle("Flag rising");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
