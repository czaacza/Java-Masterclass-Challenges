module sample.scenebuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.scenebuilder to javafx.fxml;
    exports sample.scenebuilder;
}