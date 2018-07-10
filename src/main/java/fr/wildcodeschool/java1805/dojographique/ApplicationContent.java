package fr.wildcodeschool.java1805.dojographique;

import javafx.scene.paint.Color;

public class ApplicationContent {
	public GraphicElement create() {
		final Container content = new Container();
		Anarchy signe = new Anarchy();
		Face visage = new Face();
		content.addElement(signe);
		content.addElement(new Anarchy(200, 200, 100, 100, Color.GREEN));
		content.addElement(visage);
		return content;
	}
}