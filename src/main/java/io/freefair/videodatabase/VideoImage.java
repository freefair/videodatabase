package io.freefair.videodatabase;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;

public class VideoImage extends AnchorPane {
	public VideoImage() {
		JavaFXHelper.loadAndSet("videoImage.fxml", this);
		this.setHeight(150.0);
		this.setWidth(150.0);
	}
}
