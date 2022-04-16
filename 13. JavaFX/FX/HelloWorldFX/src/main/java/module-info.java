module pl.czacza.helloworldfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.czacza.helloworldfx to javafx.fxml;
    exports pl.czacza.helloworldfx;
}