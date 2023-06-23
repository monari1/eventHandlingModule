package com.example.eventhandlingmodule;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class USMap extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        MapPane map = new MapPane();
        Scene scene = new Scene(map, 1200, 800);
        primaryStage.setTitle("US MAP BY COLOR");
        map.setOnKeyPressed(e->{
            if (e.getCode()== KeyCode.UP){
                map.enlarge();

            } else if (e.getCode()== KeyCode.DOWN){
                map.shrink();}
        });
map.requestFocus();

    }

}
