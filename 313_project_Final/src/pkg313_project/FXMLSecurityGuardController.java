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

public class FXMLSecurityGuardController implements Initializable {

    @FXML
    private Button bStart1;
    @FXML
    private Button bStop1;
    @FXML
    private MediaView MediaV1;

    @FXML
    MediaPlayer mediaplayer1;

    @FXML
    private void start(ActionEvent event) {
        if (mediaplayer1.getStatus() == PLAYING) {
            mediaplayer1.stop();
            mediaplayer1.play();
        } else {
            mediaplayer1.play();
        }
    }

    @FXML
    private void stop(ActionEvent event) {
        mediaplayer1.stop();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        String VUrl = "file:/C:/Users/pc/Desktop/313_project_Final/src/demo.mp4";
        Media media = new Media(VUrl);
        mediaplayer1 = new MediaPlayer(media);
        MediaV1.setMediaPlayer(mediaplayer1);

    }

}
