module com.hotel {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.hotel to javafx.fxml;
    exports com.hotel;
}
