package io.freefair.videodatabase;

import io.freefair.javafxdi.Application;
import javafx.scene.Scene;

public class Main extends Application {
	public static void main(String[] args) {
		run("VideoDatabase", "main.fxml", args);
	}

	@Override
	protected void initParams() {
		setHeight(350);
		setWidth(400);
	}

	@Override
	protected void initScene(Scene scene) {
		scene.getStylesheets().add("styles/styles.css");
	}
}
