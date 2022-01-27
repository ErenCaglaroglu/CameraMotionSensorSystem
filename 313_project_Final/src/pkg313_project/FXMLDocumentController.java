package pkg313_project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField textUser = new TextField();
    @FXML
    private PasswordField textPass = new PasswordField();
    @FXML
    private Button bLogin = new Button();

    @FXML
    private void handleButtonAction(ActionEvent event) {

        textUser.setText("GM");
        textPass.setText("123");

        if (textPass.getText().equals("123") && textUser.getText().equals("GM")) {
            try {
                Stage stage = new Stage();
                AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("generalManeger.fxml"));
                stage.setScene(new Scene(root));
                stage.setTitle("General Maneger Panel");
                stage.initModality(Modality.WINDOW_MODAL);
                stage.initOwner(((Node) event.getSource()).getScene().getWindow());

                stage.show();

            } catch (IOException e) {

                e.printStackTrace();
            }
        } else if (textPass.getText().equals("123") && textUser.getText().equals("SecM")) {
            try {
                Stage stage = new Stage();
                AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("securityManager.fxml"));
                stage.setScene(new Scene(root));
                stage.setTitle("Security Maneger Panel");
                stage.initModality(Modality.WINDOW_MODAL);
                stage.initOwner(((Node) event.getSource()).getScene().getWindow());

                stage.show();

            } catch (IOException e) {

                e.printStackTrace();
            }

        } else if (textPass.getText().equals("123") && textUser.getText().equals("SecG")) {
            try {
                Stage stage = new Stage();
                AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("securityGuard.fxml"));
                stage.setScene(new Scene(root));
                stage.setTitle("Security Guard Panel");
                stage.initModality(Modality.WINDOW_MODAL);
                stage.initOwner(((Node) event.getSource()).getScene().getWindow());

                stage.show();

            } catch (IOException e) {

                e.printStackTrace();
            }

        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("INVALID PASSWORD OR USERNAME");
            alert.setContentText("PLEASE TRY AGAIN");
            alert.showAndWait();

        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
