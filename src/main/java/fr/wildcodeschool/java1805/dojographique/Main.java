package fr.wildcodeschool.java1805.dojographique;

import static java.lang.Thread.sleep;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import javax.swing.JFrame;

public class Main {
	public static void main(String... args) throws InterruptedException {
		final JFrame win = new JFrame("Anarchy");
		win.setDefaultCloseOperation(EXIT_ON_CLOSE);
		win.setSize(512, 512);

		Dessin d = new Dessin();
		VisageRond v1 = new VisageRond();
		v1.setDessin(d);
		d.ajouterObjet(v1);

		VisageRond v2 = new VisageRond(200, 200, 40, 60);
		v2.setDy(-5);
		v2.setDessin(d);
		d.ajouterObjet(v2);

		win.add(d);
		win.setVisible(true);

		while (true) {
			v1.deplacerAvecRebond();
			v2.deplacerAvecRebond();

			d.repaint();

			sleep(20);
		}
	}
}