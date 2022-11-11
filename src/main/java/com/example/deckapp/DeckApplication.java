package com.example.deckapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DeckApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("deckSample.fxml"));
        stage.setTitle("Deque");
        stage.setScene(new Scene(root, 1280, 800));
        stage.show();
    }
}