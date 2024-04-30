package com.example.lab12;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField num1;

    @FXML
    private Button plusButton;

    @FXML
    private TextField num2;

    @FXML
    private Label outputLabel;

    @FXML
    private Button clearButton;

    @FXML
    private void CalculateSum() {
        try {
            int number1 = Integer.parseInt(num1.getText());
            int number2 = Integer.parseInt(num2.getText());
            int sum = number1 + number2;
            outputLabel.setText("" + sum);
        }
        catch (NumberFormatException e) {
            outputLabel.setText("Invalid input. Please enter integers.");
        }
    }

    @FXML
    private void ClearText() {
        num1.clear();
        num2.clear();
        outputLabel.setText("");
    }
}
