package com.example.java_alkalmazasok_elmelet_beadando;

//import csomag1.MNBArfolyamServiceSoap;
//import csomag1.MNBArfolyamServiceSoapImpl;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

import java.util.Random;

public class JavaAlkalmazasokBeadandoController {

    public MenuBar menuBar;
    @FXML
    private VBox rootVBox;


    //---------------------------------------------
    // Párhuzamos programozás feladatok:
    @FXML private Label szimplaMpLabel;
    @FXML private Label duplaMpLabel;
    @FXML private Button randomLabelStartButton;
    Random rand = new Random();
    //---------------------------------------------


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
        //MNBArfolyamServiceSoapImpl impl = new MNBArfolyamServiceSoapImpl();
        /*MNBArfolyamServiceSoap service = impl.getCustomBindingMNBArfolyamServiceSoap();
        try {
            System.out.println(service.getInfo());
//            System.out.println(service.getCurrentExchangeRates());
//            System.out.println(service.getExchangeRates("2022-08-14","2022-09-14","EUR"));
        } catch (Exception e) {
            System.err.print(e);
        }*/
    }


    public void SoapLetoltes2(ActionEvent actionEvent) {
    }

    public void SoapGrafikon(ActionEvent actionEvent) {
    }

    Timeline idozito1mp = new Timeline(
            new KeyFrame(Duration.seconds(1),
                    e -> {
                        int rand_int1 = rand.nextInt(10000000);
                        szimplaMpLabel.setText(Integer.toString(rand_int1));
                    }));

    Timeline idozito2mp = new Timeline(
            new KeyFrame(Duration.seconds(2),
                    e -> {
                        int rand_int1 = rand.nextInt(10000000);
                        duplaMpLabel.setText(Integer.toString(rand_int1));
                    }));

    @FXML
    private void startRandomLabelTexting()
    {
        idozito1mp.setCycleCount(Timeline.INDEFINITE);
        idozito2mp.setCycleCount(Timeline.INDEFINITE);

        idozito1mp.play();
        idozito2mp.play();
    }


    }

