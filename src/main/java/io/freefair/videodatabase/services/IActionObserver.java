package io.freefair.videodatabase.services;

import io.freefair.videodatabase.ui.ActionItem;

public interface IActionObserver {
	void newAction(ActionItem item);
	void actionUpdate(ActionItem item);
	void deleteAction(ActionItem item);
}
