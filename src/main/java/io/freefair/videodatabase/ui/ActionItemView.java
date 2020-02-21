package io.freefair.videodatabase.ui;

import io.freefair.javafxdi.JavaFXHelper;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;
import lombok.Getter;

public class ActionItemView extends VBox {
	@Getter
	private ActionItemModel item;

	@FXML
	public ProgressBar progressBar;

	@FXML
	public Label titleLabel;

	@FXML
	public Label descriptionLabel;

	public ActionItemView(ActionItemModel item) {
		this.item = item;
		JavaFXHelper.loadAndSet("actionItemView.fxml", this);

		progressBar.progressProperty().bind(item.getProgress());
		titleLabel.textProperty().bind(item.getName());
		descriptionLabel.textProperty().bind(item.getDescription());
	}
}
