package io.freefair.videodatabase;

import io.freefair.javafxdi.Application;

public class Main extends Application {
	public static void main(String[] args) {
		run(Main.class,"VideoDatabase", "main.fxml", args);
	}

	@Override
	protected void initParams() {
		setHeight(350);
		setWidth(400);

		addStylesheet("styles/styles.css");
	}
}
