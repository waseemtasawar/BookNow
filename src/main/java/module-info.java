module com.metrostate.edu.booknow {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.metrostate.edu.booknow to javafx.fxml;
    exports com.metrostate.edu.booknow;
}