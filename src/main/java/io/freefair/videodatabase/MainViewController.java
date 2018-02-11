package io.freefair.videodatabase;

import com.onexip.flexboxfx.FlexBox;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;

public class MainViewController {
	@FXML
	public FlexBox flexBox;
	@FXML
	public Button btn1;
	@FXML
	public Button btn2;
	@FXML
	public Button btn3;

	@FXML
	public void initialize() {
		btn1.textProperty().bind(btn1.minWidthProperty().asString());
		btn2.textProperty().bind(btn2.minWidthProperty().asString());
		btn3.textProperty().bind(btn3.minWidthProperty().asString());
	}
}
