package fr.wildcodeschool.java1805.dojographique;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class AnarchyPanel extends JPanel {
	private final List<Anarchy> circles = new ArrayList<>();

	public void add(Anarchy v) {
		circles.add(v);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (final Anarchy v : circles) {
			v.dessiner(g);
		}
	}
}