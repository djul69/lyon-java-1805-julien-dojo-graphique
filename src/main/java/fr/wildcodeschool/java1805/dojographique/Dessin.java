package fr.wildcodeschool.java1805.dojographique;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Dessin extends JPanel {
	private final List<VisageRond> listeDesVisageRonds = new ArrayList<>();

	public void ajouterObjet(VisageRond v) {
		if (!listeDesVisageRonds.contains(v)) {
			listeDesVisageRonds.add(v);
			repaint();
		}
	}

	public void pause(int duree) {
		try {
			Thread.sleep(duree);
		} catch (Exception e) {
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (final VisageRond v : listeDesVisageRonds) {
			v.dessiner(g);
		}
	}
}