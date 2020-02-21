package io.freefair.videodatabase;

import io.freefair.javafxdi.JavaFXHelper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class MainWindowController {

	@FXML
	public AnchorPane rootPane;

	@FXML
	public void initialize() {
		JavaFXHelper.replaceRoot(rootPane, "mainView.fxml");
	}

	@FXML
	public void close(ActionEvent ignore) {
		System.exit(0);
	}
}
