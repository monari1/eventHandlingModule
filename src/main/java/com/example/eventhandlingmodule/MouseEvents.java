package com.example.eventhandlingmodule;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEvents extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        Text text = new Text(20, 20, "Move your mouse");
        pane.getChildren().addAll(text);

        text.setOnMouseDragged(e-> {
            text.setX(e.getX());
            text.setY(e.getY());


        });

        Scene scene = new Scene(pane, 300, 100);
        primaryStage.setTitle("MOUSE EVENT DEMO");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
