module com.example.proyecto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyecto to javafx.fxml;
    opens com.example.proyecto.model to javafx.base;
    opens com.example.proyecto.controller to java.fxml;
    exports com.example.proyecto;
}