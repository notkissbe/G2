package hu.notkissbe.g;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class HelloController {
    @FXML
    private Label welcomeText;

    Media media = new Media(new File("seatbelt.mp3").toURI().toString());
    MediaPlayer mp = new MediaPlayer(media);

    boolean isClicked = false;



    @FXML
    protected void onGButtonClick() {
        if(isClicked){
            mp.stop();
            isClicked = false;
        }
        else{
            mp.play();
            isClicked = true;
        }
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Információ!");
        a.show();
    }
}