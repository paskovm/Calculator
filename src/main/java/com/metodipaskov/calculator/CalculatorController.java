package com.metodipaskov.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculatorController {

    private Double firstNumber, secondNumber, result;
    private String operator;
    private boolean calcCompleted = false;

    @FXML
    private TextField displayField;

    public void buttonAns() {
        if (firstNumber != null && operator != null && !displayField.getText().isEmpty() && !displayField.getText().isBlank()) {
            secondNumber = Double.parseDouble(displayField.getText());


            if (operator.equals("+"))
                result = firstNumber + secondNumber;
            else if (operator.equals("-"))
                result = firstNumber - secondNumber;
            else if (operator.equals("*"))
                result = firstNumber * secondNumber;
            else if (operator.equals("/"))
                result = firstNumber / secondNumber;

            displayField.setText(String.valueOf(result));
            operator = null;
            firstNumber = null;
            secondNumber = null;
            result = null;
            calcCompleted = true;
        }
    }

    public void buttonC() {
        String value = displayField.getText();
        value = value.substring(0, value.length() - 1);

        displayField.setText(value);
    }

    public void buttonDel() {
        operator = null;
        firstNumber = null;
        secondNumber = null;
        result = null;
        displayField.setText("");
        calcCompleted = false;
    }

    public void buttonPlus() {
        if (!displayField.getText().isEmpty() && !displayField.getText().isBlank()) {
            firstNumber = Double.parseDouble(displayField.getText());
            operator = "+";
            displayField.setText("");
        }
    }

    public void buttonMinus() {
        if (!displayField.getText().isEmpty() && !displayField.getText().isBlank()) {
            firstNumber = Double.parseDouble(displayField.getText());
            operator = "-";
            displayField.setText("");
        }
    }

    public void buttonMultiply() {
        if (!displayField.getText().isEmpty() && !displayField.getText().isBlank()) {
            firstNumber = Double.parseDouble(displayField.getText());
            operator = "*";
            displayField.setText("");
        }
    }

    public void buttonDivide() {
        if (!displayField.getText().isEmpty() && !displayField.getText().isBlank()) {
            firstNumber = Double.parseDouble(displayField.getText());
            operator = "/";
            displayField.setText("");
        }
    }

    public void buttonDot() {
        if (calcCompleted)
            displayField.setText("");

        if (displayField.getText().isEmpty())
            displayField.setText(".");
        else
            displayField.setText(displayField.getText() + ".");
    }

    public void button0() {
        if (calcCompleted)
            displayField.setText("");

        if (displayField.getText().isEmpty())
            displayField.setText("0");
        else
            displayField.setText(displayField.getText() + "0");
    }

    public void button1() {
        if (calcCompleted)
            displayField.setText("");

        if (displayField.getText().isEmpty())
            displayField.setText("1");
        else
            displayField.setText(displayField.getText() + "1");
    }

    public void button2() {
        if (calcCompleted)
            displayField.setText("");

        if (displayField.getText().isEmpty())
            displayField.setText("2");
        else
            displayField.setText(displayField.getText() + "2");
    }

    public void button3() {
        if (calcCompleted)
            displayField.setText("");

        if (displayField.getText().isEmpty())
            displayField.setText("3");
        else
            displayField.setText(displayField.getText() + "3");
    }

    public void button4() {
        if (calcCompleted)
            displayField.setText("");

        if (displayField.getText().isEmpty())
            displayField.setText("4");
        else
            displayField.setText(displayField.getText() + "4");
    }

    public void button5() {
        if (calcCompleted)
            displayField.setText("");

        if (displayField.getText().isEmpty())
            displayField.setText("5");
        else
            displayField.setText(displayField.getText() + "5");
    }

    public void button6() {
        if (calcCompleted)
            displayField.setText("");

        if (displayField.getText().isEmpty())
            displayField.setText("6");
        else
            displayField.setText(displayField.getText() + "6");
    }

    public void button7() {
        if (calcCompleted)
            displayField.setText("");

        if (displayField.getText().isEmpty())
            displayField.setText("7");
        else
            displayField.setText(displayField.getText() + "7");
    }

    public void button8() {
        if (calcCompleted)
            displayField.setText("");

        if (displayField.getText().isEmpty())
            displayField.setText("8");
        else
            displayField.setText(displayField.getText() + "8");
    }

    public void button9() {
        if (calcCompleted)
            displayField.setText("");

        if (displayField.getText().isEmpty())
            displayField.setText("9");
        else
            displayField.setText(displayField.getText() + "9");
    }


}
