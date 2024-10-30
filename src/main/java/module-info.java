module com.example.java_alkalmazasok_elmelet_beadando {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.jws;
    requires java.xml.ws;
    requires java.xml.bind;


    opens com.example.java_alkalmazasok_elmelet_beadando to javafx.fxml;
    exports com.example.java_alkalmazasok_elmelet_beadando;
}