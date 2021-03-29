package oop2.module06.calculatorchallenge.raphaelluethy;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;

public class CalculatorApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        Parent rootPanel = new CalculatorUI();

        Scene scene = new Scene(rootPanel);
        primaryStage.setMinWidth(300);
        primaryStage.setMinHeight(500);


        primaryStage.setTitle("Calculator");
        // Looks nice but useless
//        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
