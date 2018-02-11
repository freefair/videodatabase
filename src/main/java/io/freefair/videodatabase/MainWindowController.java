package io.freefair.videodatabase;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class MainWindowController {

	@FXML
	public AnchorPane rootPane;

	@FXML
	public void initialize() {
		JavaFXHelper.replaceRoot(rootPane, "mainView.fxml");
	}
}
