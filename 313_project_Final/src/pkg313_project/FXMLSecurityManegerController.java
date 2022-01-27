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

public class FXMLSecurityManegerController implements Initializable {

    @FXML
    private Button bStart2;
    @FXML
    private Button bStop2;
    @FXML
    private MediaView MediaV2;

    @FXML
    MediaPlayer mediaplayer2;

    @FXML
    private void start(ActionEvent event) {
        if (mediaplayer2.getStatus() == PLAYING) {
            mediaplayer2.stop();
            mediaplayer2.play();
        } else {
            mediaplayer2.play();
        }
    }

    @FXML
    private void stop(ActionEvent event) {
        mediaplayer2.stop();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        String VUrl = "file:/C:/Users/pc/Desktop/313_project_Final/src/demo.mp4";
        Media media = new Media(VUrl);
        mediaplayer2 = new MediaPlayer(media);
        MediaV2.setMediaPlayer(mediaplayer2);

    }

}
