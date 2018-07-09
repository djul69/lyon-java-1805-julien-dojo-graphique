package fr.wildcodeschool.java1805.dojographique;

import java.util.Optional;
import java.util.stream.Stream;

import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {
	public @Override void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Anarchy!");

		final Canvas canvas = new Canvas(512, 512);

		final Anarchy v1 = new Anarchy();
		v1.setTailleTotale((int) canvas.getWidth(), (int) canvas.getHeight());

		final Anarchy v2 = new Anarchy((int) canvas.getWidth() / 2, (int) canvas.getHeight() / 2, 40, 60);
		v2.setDy(-5);
		v2.setTailleTotale((int) canvas.getWidth(), (int) canvas.getHeight());

		Stream.of(v1, v2).forEach(a -> a.dessiner(canvas.getGraphicsContext2D()));

		primaryStage.setScene(new Scene(new Group(canvas)));
		primaryStage.show();

		new AnimationTimer() {
			private Optional<Long> beforeOpt = Optional.empty();

			public @Override void handle(long now) {
				if (!beforeOpt.filter(before -> now - before < 20_000_000).isPresent()) {
					beforeOpt.ifPresent(before -> {
						canvas.getGraphicsContext2D().clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

						Stream.of(v1, v2).forEach(a -> {
							a.deplacerAvecRebond(now - before);
							a.dessiner(canvas.getGraphicsContext2D());
						});
					});
					beforeOpt = Optional.of(now);
				}
			}
		}.start();
	}

	public static void main(String... args) {
		launch(args);
	}
}