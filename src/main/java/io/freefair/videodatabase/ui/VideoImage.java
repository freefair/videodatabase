package io.freefair.videodatabase.ui;

import io.freefair.javafxdi.JavaFXHelper;
import javafx.scene.layout.AnchorPane;
import org.springframework.stereotype.Controller;

public class VideoImage extends AnchorPane {
	public VideoImage() {
		JavaFXHelper.loadAndSet("videoImage.fxml", this);
		this.setHeight(150.0);
		this.setWidth(150.0);
	}
}
