module com.example.eventhandlingmodule {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eventhandlingmodule to javafx.fxml;
    exports com.example.eventhandlingmodule;
}