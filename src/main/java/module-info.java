module com.example.workshop2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.workshop2 to javafx.fxml;
    exports com.example.workshop2;
}