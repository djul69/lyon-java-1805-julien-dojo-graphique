package fr.wildcodeschool.java1805.dojographique;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Main {
	public static void main(String[] args) {
		JFrame laFenetre = new JFrame("VISAGES ANIMES");
		laFenetre.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		laFenetre.setSize(512, 512);

		Dessin d = new Dessin();
		VisageRond v1 = new VisageRond();
		v1.setDessin(d);
		d.ajouterObjet(v1);

		VisageRond v2 = new VisageRond(d.getWidth() / 2, d.getHeight() / 2, 40, 60);
		v2.setDy(-5);
		v2.setDessin(d);
		d.ajouterObjet(v2);

		laFenetre.add(d);

		laFenetre.setVisible(true);

		while (true) {
			v1.deplacerAvecRebond();
			v2.deplacerAvecRebond();

			d.repaint();

			d.pause(20);
		}
	}
}