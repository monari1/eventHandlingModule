package com.example.eventhandlingmodule;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SiepTriangle extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        SieptrianglePane pane = new SieptrianglePane();
        TextField tfOrder = new TextField();
        tfOrder.setOnAction(e -> pane.setOrder(Integer.parseInt(tfOrder.getText())));
        tfOrder.setPrefColumnCount(4);
        tfOrder.setAlignment(Pos.BOTTOM_RIGHT);


        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(new Label("enter an order: "), tfOrder);
        hBox.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(hBox);

        Scene scene = new Scene(borderPane, 300, 300);
        primaryStage.setTitle("Fractals demo");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    static class SieptrianglePane extends Pane{

    }
}
