package fr.wildcodeschool.java1805.dojographique;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {
	public @Override void start(Stage primaryStage) {
		primaryStage.setTitle("Anarchy!");
		final Canvas canvas = new Canvas(512, 512);

		new ApplicationContent().create().draw(canvas.getGraphicsContext2D());

		primaryStage.setScene(new Scene(new Group(canvas)));
		primaryStage.show();
	}

	public static void main(String... args) {
		launch(args);
	}
}