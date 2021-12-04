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
    requires org.apache.commons.lang3;
    requires commons.codec;
    requires org.apache.commons.collections4;
    requires org.apache.logging.log4j;
    requires java.net.http;
    requires jdk.httpserver;
    requires org.jetbrains.annotations;
    requires io.reactivex.rxjava2;
    requires io.vertx.core;
    requires vertx.rx.java;
    requires rxjava;
    requires jmh.core;

    exports com.huyhoang.ch01;
    opens com.huyhoang.ch01 to javafx.fxml;
    exports com.huyhoang.ch12;
    opens com.huyhoang.ch12 to javafx.fxml;
}