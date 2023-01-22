module calculadora {
    requires javafx.controls;
    requires javafx.fxml;

    opens calculadora to javafx.fxml;
    opens calculadora.calc to javafx.fxml;
    opens calculadora.marco to javafx.fxml;
    exports calculadora;
}
