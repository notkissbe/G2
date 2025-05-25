module hu.notkissbe.g {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens hu.notkissbe.g to javafx.fxml;
    exports hu.notkissbe.g;
}