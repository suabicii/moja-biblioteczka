package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;

public class TopMenuButtonsController {

    private MainController mainController;

    @FXML
    private ToggleGroup toggleButtons;

    @FXML
    void openLibrary() {
        System.out.println("openLibrary");
    }

    @FXML
    void openListBooks() {
        System.out.println("openListBooks");
    }

    @FXML
    void openStatistics() {
        System.out.println("openStatistics");
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
