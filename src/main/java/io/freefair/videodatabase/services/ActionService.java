package io.freefair.videodatabase.services;

import io.freefair.videodatabase.ui.ActionItem;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class ActionService {
	private List<IActionObserver> observerList = new ArrayList<>();

	public void observe(IActionObserver actionObserver) {
		observerList.add(actionObserver);
	}

	public void unobserve(IActionObserver actionObserver) {
		observerList.remove(actionObserver);
	}

	public void distributeNew(ActionItem item) {
		observerList.forEach(o -> o.newAction(item));
	}

	public void distributeUpdate(ActionItem item) {
		observerList.forEach(o -> o.actionUpdate(item));
	}

	public void distributeDelete(ActionItem item) {
		observerList.forEach(o -> o.deleteAction(item));
	}
}
