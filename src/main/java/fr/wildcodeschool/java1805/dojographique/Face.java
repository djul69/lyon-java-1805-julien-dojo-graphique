package fr.wildcodeschool.java1805.dojographique;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class Face implements GraphicElement {
	private final int x, y, width, height;
	private final Paint color;

	public Face() {
		this(0, 0);
	}

	public Face(int x, int y) {
		this(x, y, 50, 50, Color.RED);
	}

	public Face(int x, int y, int width, int height, Paint color) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public @Override void draw(GraphicsContext gc) {
		gc.setStroke(color);

		gc.strokeOval(x, y, width, height);
		

		gc.strokeLine(x + width *1/4, y + height*2/3, x + width *3/4, y + height*2/3);
		gc.strokeOval(x + width *1/4, y + height*1/3, width*0.10, height*0.10);
		gc.strokeOval(x + width *3/5, y + height*1/3, width*0.10, height*0.10);
	}
}