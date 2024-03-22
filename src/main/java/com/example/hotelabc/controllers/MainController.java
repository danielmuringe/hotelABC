package com.example.hotelabc.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MainController {

    @FXML
    private Button welcomeButton;

    public void changeWelcomeButtonText() {
        welcomeButton.setText("Welcome to Hotel ABC!");
    }

}