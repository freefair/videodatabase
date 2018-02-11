package io.freefair.videodatabase;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent rootNode = JavaFXHelper.loadFile("main.fxml");

		Scene scene = new Scene(rootNode, 400, 200);
		scene.getStylesheets().add("styles/styles.css");

		stage.setTitle("Video Database");
		stage.setMinHeight(200);
		stage.setMinWidth(400);
		stage.setScene(scene);
		stage.show();
	}
}
