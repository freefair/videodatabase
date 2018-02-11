package io.freefair.videodatabase;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

public class JavaFXHelper {

	public static Parent loadFile(String filename) {
		try {
			return new FXMLLoader().load(Thread.currentThread().getContextClassLoader().getResourceAsStream(filename));
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	public static void loadAndSet(String filename, AnchorPane controlNode) {
		FXMLLoader fxmlLoader = new FXMLLoader(Thread.currentThread().getContextClassLoader().getResource(filename));
		fxmlLoader.setRoot(controlNode);
		fxmlLoader.setController(controlNode);
		try {
			fxmlLoader.load();
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	public static void addToAnchorFull(AnchorPane pane, Node child) {
		pane.getChildren().add(child);
		AnchorPane.setBottomAnchor(child, 0.0);
		AnchorPane.setTopAnchor(child, 0.0);
		AnchorPane.setLeftAnchor(child, 0.0);
		AnchorPane.setRightAnchor(child, 0.0);
	}

	public static void replaceRoot(AnchorPane rootPane, String s) {
		rootPane.getChildren().clear();
		addToAnchorFull(rootPane, loadFile(s));
	}
}
