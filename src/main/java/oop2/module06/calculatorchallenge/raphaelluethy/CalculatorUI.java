package oop2.module06.calculatorchallenge.raphaelluethy;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CalculatorUI extends GridPane {
    private final Label current = new Label();
    List<Button> numButtons = new ArrayList<>();
    private Button plus;
    private Button minus;
    private Button multiply;
    private Button divide;
    private Button modulo;
    private Button dot;
    private Button clear;
    private Button equal;
    private Button changeSign;

    public CalculatorUI() {
        initSelf();
        initButtons();
        initLayout();

    }

    private void initSelf() {
        String stylesheet = getClass().getResource("styles.css").toExternalForm();
        getStylesheets().add(stylesheet);
    }

    private void initButtons() {
        for (int i = 0; i < 10; i++) {
            numButtons.add(createButton("" + i));
        }

        for (Button b : numButtons) {
            b.setOnAction(e -> {
                current.setText(current.getText() + b.getText());
            });
        }

        plus = createButton("+");
        minus = createButton("-");
        multiply = createButton("*");
        divide = createButton("/");
        modulo = createButton("%");
        dot = createButton(".");
        clear = createButton("AC");
        equal = createButton("=");
        changeSign = createButton("+/-");

        plus.setOnAction(e -> {
            current.setText(current.getText() + plus.getText() + " ");
        });
        minus.setOnAction(e -> {
            current.setText(current.getText() + " " + minus.getText() + " ");
        });

    }

    private void initLayout() {
        ColumnConstraints cc = new ColumnConstraints();
        cc.setHgrow(Priority.ALWAYS);
        getColumnConstraints().addAll(cc, cc, cc, cc);

        RowConstraints rc = new RowConstraints();
        rc.setVgrow(Priority.ALWAYS);
        getRowConstraints().addAll(rc, rc, rc, rc, rc, rc);

        current.setText("0");
        current.setMaxWidth(Double.MAX_VALUE);
        current.setMinWidth(getWidth());

        current.setAlignment(Pos.CENTER_RIGHT);

        current.setMinHeight(15);
        current.setMaxHeight(Double.MAX_VALUE);

        add(current, 0, 0, 4, 1);

        add(clear, 0, 1);

        add(changeSign, 1, 1);
        add(divide, 3, 1);
        add(multiply, 3, 2);
        add(modulo, 2, 1);

        add(numButtons.get(7), 0, 2);
        add(numButtons.get(8), 1, 2);
        add(numButtons.get(9), 2, 2);
        add(minus, 3, 3);

        add(numButtons.get(4), 0, 3);
        add(numButtons.get(5), 1, 3);
        add(numButtons.get(6), 2, 3);
        add(plus, 3, 4);

        add(numButtons.get(1), 0, 4);
        add(numButtons.get(2), 1, 4);
        add(numButtons.get(3), 2, 4);
        add(equal, 3, 5, 1, 1);

        add(numButtons.get(0), 0, 5, 2, 1);
        add(dot, 2, 5);


    }

    private Button createButton(String s) {
        Button button = new Button(s);
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        return button;
    }

}
