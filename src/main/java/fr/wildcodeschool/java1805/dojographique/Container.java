package fr.wildcodeschool.java1805.dojographique;

import java.util.HashSet;
import java.util.Set;

import javafx.scene.canvas.GraphicsContext;

public class Container implements GraphicElement {
	private final Set<GraphicElement> elements = new HashSet<>();

	public void addElement(GraphicElement element) {
		elements.add(element);
	}

	public @Override void draw(GraphicsContext gc) {
		// TODO
	}
}