package com.example.eventhandlingmodule;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ResizableCircleRectangle extends Application {

    private Circle  circle = new Circle(60);
    private Rectangle rectangle = new Rectangle(120, 120);

    private StackPane pane = new StackPane();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        circle.setFill(Color.AQUAMARINE);
        rectangle.setFill(Color.YELLOWGREEN);
        rectangle.setStroke(Color.BLUE);
        pane.getChildren().addAll(rectangle, circle);

        Scene scene = new Scene(pane, 140 , 140);
        primaryStage.setTitle("Resizable Rectangle and Circl");
        primaryStage.setScene(scene);
        primaryStage.show();

        pane.widthProperty().addListener(ov-> resize());
        pane.heightProperty().addListener(ov-> resize());

    }

    public void resize(){
        double length = Math.min(pane.getWidth(), pane.getHeight());
        circle.setRadius(length/2 -15);
        rectangle.setHeight(length - 30);
        rectangle.setWidth(length - 30);
    }
}
