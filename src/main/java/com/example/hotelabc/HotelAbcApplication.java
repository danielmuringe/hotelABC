package com.example.hotelabc;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import com.example.hotelabc.ApplicationUtils.FXMLTemplates;

public class HotelAbcApplication extends Application {

    // Load all FXML files
    private String templatesDirectory = "src/main/resources/com/example/hotelabc";
    public FXMLTemplates templates;

    @Override
    public void start(Stage stage) throws IOException {
        this.templates = new FXMLTemplates(this.templatesDirectory);

        // Load welcome page scene
        Scene scene = new Scene(templates.get("welcome-page").load(), 320, 240);

        // Setup stage
        stage.setTitle("Welcome User!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}