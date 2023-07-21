package com.example.eventhandlingmodule;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class USMap extends Application {


    @Override
    public void start(Stage primaryStage) {
        MapPane map = new MapPane();
        Scene scene = new Scene(map, 1200, 800);
        primaryStage.setTitle("US MAP BY COLOR");
        primaryStage.setScene(scene);
        primaryStage.show();

        map.setOnKeyPressed(e->{
            if (e.getCode()== KeyCode.UP){
                map.enlarge();

            }
            else if (e.getCode()== KeyCode.DOWN){
                map.shrink();}
        });
map.requestFocus();

    }

}
