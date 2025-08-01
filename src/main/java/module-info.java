module mainpackage.cdbl {
    requires javafx.controls;
    requires javafx.fxml;


    opens mainpackage.cdbl to javafx.fxml;
    exports mainpackage.cdbl;
}