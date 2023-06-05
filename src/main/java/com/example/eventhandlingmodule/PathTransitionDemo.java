package com.example.eventhandlingmodule;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PathTransitionDemo extends Application {
    Pane pane = new Pane();

    Rectangle rectangle = new Rectangle(0, 0 , 25, 50);

    Circle circle = new Circle(125, 100, 50);


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        rectangle.setFill(Color.BLUE);
        circle.setFill(Color.AQUAMARINE);
        pane.getChildren().add(circle);
        pane.getChildren().add(rectangle);

//        path transition
        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.seconds(4));
        pt.setPath(circle);
        pt.setNode(rectangle);
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(true);

        // setting the event

        circle.setOnMousePressed(e -> pt.pause());
        circle.setOnMouseReleased(e -> pt.play());

        // end

//        event to listen and resize triangle size based on pane
//        pane.widthProperty().addListener(ov-> resize());
//        pane.heightProperty().addListener(ov-> resize());

//        end

        Scene scene = new Scene(pane, 250, 200);
        scene.setFill(Color.DARKGRAY);
        primaryStage.setTitle("Demo PathTransition Animation");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

//    public void resize(){
//        double length = Math.min(pane.getWidth(), pane.getHeight());
//        circle.setRadius(length/2 );
//        rectangle.setHeight(length/2 - 60);
//        rectangle.setWidth(length/2 - 60);
//    }
}
