package com.example.q1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Question1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.add(new ImageView(new Image("image/united_kingdom.png")), 0, 0);
        pane.add(new ImageView(new Image("image/canada.png")), 1, 0);
        pane.add(new ImageView(new Image("image/china.png")), 0, 1);
        pane.add(new ImageView(new Image("image/united_states.png")), 1, 1);
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Sheet6_Q1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
