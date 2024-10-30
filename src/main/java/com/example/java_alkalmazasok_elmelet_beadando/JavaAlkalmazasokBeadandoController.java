package com.example.java_alkalmazasok_elmelet_beadando;

import csomag1.MNBArfolyamServiceSoap;
import csomag1.MNBArfolyamServiceSoapImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class JavaAlkalmazasokBeadandoController {

    public MenuBar menuBar;
    @FXML
    private VBox rootVBox;

    private Button SoapDownload;
    
    @FXML
    private void SoapLetoltesClick() {
        System.out.println("Letöltés menüpont kiválasztva!");
        if (SoapDownload == null) {
            SoapDownload = new Button("Letöltés");
            rootVBox.getChildren().add(SoapDownload);
            SoapDownload.setOnAction(this::handleSoapDownloadClick);
        }
    }

    public void handleSoapDownloadClick(ActionEvent event) {
        System.out.println("Soap Letöltés start");
        MNBArfolyamServiceSoapImpl impl = new MNBArfolyamServiceSoapImpl();
        MNBArfolyamServiceSoap service = impl.getCustomBindingMNBArfolyamServiceSoap();
        try {
            System.out.println(service.getInfo());
//            System.out.println(service.getCurrentExchangeRates());
//            System.out.println(service.getExchangeRates("2022-08-14","2022-09-14","EUR"));
        } catch (Exception e) {
            System.err.print(e);
        }
    }


    public void SoapLetoltes2(ActionEvent actionEvent) {
    }

    public void SoapGrafikon(ActionEvent actionEvent) {
    }
}