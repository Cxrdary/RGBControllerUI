module com.rgbcontrollercr.rgblightcontrollerui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.rgbcontrollercr.rgblightcontrollerui to javafx.fxml;
    exports com.rgbcontrollercr.rgblightcontrollerui;
}