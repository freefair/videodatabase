package io.freefair.videodatabase.controller;

import com.onexip.flexboxfx.FlexBox;
import io.freefair.videodatabase.services.ActionService;
import io.freefair.videodatabase.services.IActionObserver;
import io.freefair.videodatabase.ui.ActionItem;
import io.freefair.videodatabase.ui.ActionView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.springframework.stereotype.Controller;

@Controller
public class MainViewController implements IActionObserver {
	private final ActionService actionService;

	@FXML
	public FlexBox flexBox;

	@FXML
	public ActionView actionView;
	private ActionItem actionItem;

	public MainViewController(ActionService actionService) {
		this.actionService = actionService;
	}

	@FXML
	public void initialize() {
		actionItem = new ActionItem("Test", "Test description", 0.1);
		actionView.addAction(actionItem);
		actionService.observe(this);
	}

	@FXML
	public void doAction(ActionEvent actionEvent) {
		actionItem.setProgress(actionItem.getProgress() + 0.1);
		actionView.updateAction(actionItem);
	}

	@Override
	public void newAction(ActionItem item) {
		actionView.addAction(item);
	}

	@Override
	public void actionUpdate(ActionItem item) {
		actionView.updateAction(item);
	}

	@Override
	public void deleteAction(ActionItem item) {
		actionView.removeAction(item.getId());
	}
}
