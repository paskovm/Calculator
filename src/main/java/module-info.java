module com.metodipaskov.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.metodipaskov.calculator to javafx.fxml;
    exports com.metodipaskov.calculator;
}