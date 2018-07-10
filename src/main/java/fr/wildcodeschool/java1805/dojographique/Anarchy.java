package fr.wildcodeschool.java1805.dojographique;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Anarchy implements GraphicElement {
	private final int x, y, width, height;

	public Anarchy() {
		this(0, 0);
	}

	public Anarchy(int x, int y) {
		this(x, y, 50, 50);
	}

	public Anarchy(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public @Override void draw(GraphicsContext gc) {
		gc.setFill(Color.BLACK);

		gc.strokeOval(x, y, width, height);

		gc.strokeLine(x + width / 2, y, x, y + height);
		gc.strokeLine(x + width / 2, y, x + width, y + height);
		gc.strokeLine(x, y + height / 2, x + width, y + height / 2);
	}
}