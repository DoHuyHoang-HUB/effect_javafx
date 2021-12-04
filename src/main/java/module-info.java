module com.huyhoang.javafx_project {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.media;
    requires javafx.web;
    requires java.sql;
    requires org.postgresql.jdbc;

    opens com.huyhoang.javafx_project to javafx.fxml;
    exports com.huyhoang.javafx_project;
}