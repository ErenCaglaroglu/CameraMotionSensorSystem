package pkg313_project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import static javafx.scene.media.MediaPlayer.Status.PLAYING;
import javafx.scene.media.MediaView;

public class FXMLGeneralManegerContoller implements Initializable {

    @FXML
    private Button bStart;
    @FXML
    private Button bStop;
    @FXML
    private MediaView MediaV;
    @FXML
    private MediaView redMedia;
    @FXML
    MediaPlayer mediaplayer;
    @FXML
    MediaPlayer redMediaplayer;

    @FXML
    private void start(ActionEvent event) {
        if (mediaplayer.getStatus() == PLAYING) {
            mediaplayer.stop();
            mediaplayer.play();
        } else {
            mediaplayer.play();
        }
    }

    @FXML
    private void stop(ActionEvent event) {
        mediaplayer.stop();

    }

    public void initialize(URL url, ResourceBundle rb) {

        String VUrl = "file:/C:/Users/pc/Desktop/313_project_Final/src/demo.mp4";
        Media media = new Media(VUrl);
        Media AredMedia = new Media(VUrl);
        redMediaplayer = new MediaPlayer(AredMedia);
        mediaplayer = new MediaPlayer(media);

        MediaV.setMediaPlayer(mediaplayer);
        redMedia.setMediaPlayer(redMediaplayer);

        redMediaplayer.play();

    }

}
