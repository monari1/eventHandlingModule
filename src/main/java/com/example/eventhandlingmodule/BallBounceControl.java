package com.example.eventhandlingmodule;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class BallBounceControl extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BallPane ballPane = new BallPane();

//        pause and resume animation
        ballPane.setOnMousePressed(e-> ballPane.pause());
        ballPane.setOnMouseReleased(e-> ballPane.play());

//        increaese and decrease animation speed

        ballPane.setOnKeyPressed(e->{

            if (e.getCode()== KeyCode.UP){
                ballPane.increaseSpeed();
            } else if (e.getCode()== KeyCode.DOWN) {
                ballPane.decreaseSpeed();

            }
        });

        Scene scene = new Scene(ballPane, 300, 300);
        primaryStage.setTitle("Bounce Ball Control");
        primaryStage.setScene(scene);
        primaryStage.show();

//        must request focus after the primary stage is displayed

        ballPane.requestFocus();

    }
}
