package fr.wildcodeschool.java1805.dojographique;

import java.util.HashSet;
import java.util.Set;

import javafx.scene.canvas.GraphicsContext;

public class Container implements AnimationElement {
	private final Set<AnimationElement> elements = new HashSet<>();

	public void addElement(AnimationElement element) {
		elements.add(element);
	}

	public @Override void update(long now) {
		// TODO
	}

	public @Override void draw(GraphicsContext gc) {
		// TODO
	}
}