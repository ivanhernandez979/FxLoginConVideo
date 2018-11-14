package paquete_nuevo;

import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Controller {

	@FXML
	private MediaView mediaView;

	public void initialize() {

		Media media1 = new Media(getClass().getResource("20395.mp4").toExternalForm());
		MediaPlayer player = new MediaPlayer(media1);
		mediaView.setMediaPlayer(player);
		player.setCycleCount(player.INDEFINITE);
		player.setVolume(0.5);
		player.play();

	}
}