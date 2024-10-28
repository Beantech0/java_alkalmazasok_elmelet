module com.example.java_alkalmazasok_elmelet_beadando {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_alkalmazasok_elmelet_beadando to javafx.fxml;
    exports com.example.java_alkalmazasok_elmelet_beadando;
}