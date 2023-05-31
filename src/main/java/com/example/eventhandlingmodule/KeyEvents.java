package com.example.eventhandlingmodule;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KeyEvents extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Text text = new Text(20, 20, "Move using arrow");

        pane.getChildren().addAll(text);

        text.setOnKeyPressed(
                e->{
                    switch (e.getCode()){
                        case DOWN : text.setY(text.getY() + 10); break;
                        case UP: text.setY(text.getY() - 10); break;
                        case LEFT : text.setX(text.getX() - 10); break;
                        case RIGHT : text.setX(text.getX() + 10); break;
                        default:
                            if (e.getText().length()>0)
                                text.setText(e.getText());



                    }
                }
        );

        Scene scene = new Scene(pane);
        primaryStage.setTitle("demo key event");
        primaryStage.setScene(scene);
        primaryStage.show();

        text.requestFocus();

    }
}
