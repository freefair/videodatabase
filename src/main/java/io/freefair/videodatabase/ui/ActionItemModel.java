package io.freefair.videodatabase.ui;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import lombok.Getter;

import java.util.UUID;

@Getter
public class ActionItemModel {
	private UUID id;
	private StringProperty name = new SimpleStringProperty();
	private StringProperty description = new SimpleStringProperty();
	private DoubleProperty progress = new SimpleDoubleProperty();

	public ActionItemModel(ActionItem item) {
		id = item.getId();
		name.setValue(item.getName());
		description.setValue(item.getDescription());
		progress.setValue(item.getProgress());
	}
}
