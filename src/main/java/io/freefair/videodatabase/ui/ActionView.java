package io.freefair.videodatabase.ui;

import io.freefair.javafxdi.JavaFXHelper;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ActionView extends VBox {
	private List<ActionItemModel> items = new ArrayList<>();

	public ActionView() {
		JavaFXHelper.loadAndSet("actionView.fxml", this);
		this.setHeight(150.0);
		this.setWidth(150.0);
	}

	public void addAction(ActionItem actionItem) {
		ActionItemModel item = new ActionItemModel(actionItem);
		items.add(item);
		this.getChildren().add(new ActionItemView(item));
	}

	public void updateAction(ActionItem item) {
		findItemById(item.getId())
				.ifPresent(m -> m.getProgress().setValue(item.getProgress()));
	}

	public void removeAction(UUID id) {
		this.getChildren().stream().filter(i -> i.getClass().equals(ActionItemView.class))
				.filter(i -> ((ActionItemView) i).getItem().getId().equals(id))
				.findFirst().ifPresent(c -> this.getChildren().remove(c));
		findItemById(id)
				.ifPresent(model -> items.remove(model));
	}

	private Optional<ActionItemModel> findItemById(UUID id) {
		return items.stream().filter(i -> i.getId().equals(id)).findFirst();
	}

	public boolean containsAction(UUID id) {
		return findItemById(id).isPresent();
	}
}
