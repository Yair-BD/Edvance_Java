module com.example.fx_project {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.fx_project to javafx.fxml;
    exports com.example.fx_project;
}