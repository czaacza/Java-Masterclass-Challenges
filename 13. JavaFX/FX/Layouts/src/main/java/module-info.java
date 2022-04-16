module sample.layouts {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.layouts to javafx.fxml;
    exports sample.layouts;
}