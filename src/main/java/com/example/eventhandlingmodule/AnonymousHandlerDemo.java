package com.example.eventhandlingmodule;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AnonymousHandlerDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Text text = new Text(40, 40 , "Programming is fun");

        Pane pane = new Pane(text);

        Button btUp = new Button("Up");
        Button btDown = new Button("Down");
        Button btRight= new Button("Right");
        Button btLeft = new Button("Left");

        HBox hBox = new HBox(btUp, btDown, btRight, btLeft);
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane(pane);
        borderPane.setBottom(hBox);

//        create register handler
        btUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                text.setY(text.getY()>10?text.getY()-5:10);

            }
        });
        btUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                text.setY(text.getY()>10?text.getY()-5:10);

            }
        });
        btDown.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                text.setY(text.getY()<pane.getHeight()?text.getY()+5: pane.getHeight());

            }
        });
        btRight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                text.setX(text.getX()<pane.getWidth()-100?text.getX()+5: pane.getWidth()-100);

            }
        });

        btLeft.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                text.setX(text.getY()>0?text.getX()-5:0);

            }
        });
        Scene scene = new Scene(borderPane, 400, 200);
        primaryStage.setTitle("Anonymous Handler");
        primaryStage.setScene(scene);
        primaryStage.show();






    }
}
