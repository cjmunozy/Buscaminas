module ec.edu.espol.buscaminas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens ec.edu.espol.buscaminas to javafx.fxml;
    exports ec.edu.espol.buscaminas;
    opens ec.edu.espol.controller to javafx.fxml;
    exports ec.edu.espol.controller;
    opens ec.edu.espol.model to javafx.fxml;
    exports ec.edu.espol.model;
}
