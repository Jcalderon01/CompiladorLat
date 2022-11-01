module com.example.interfazfinallat {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires antlr;


    opens com.example.interfazfinallat to javafx.fxml;
    exports com.example.interfazfinallat;
}