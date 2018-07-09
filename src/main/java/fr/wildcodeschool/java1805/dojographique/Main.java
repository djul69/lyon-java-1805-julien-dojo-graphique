package fr.wildcodeschool.java1805.dojographique;

import static java.lang.Thread.sleep;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import javax.swing.JFrame;

public class Main {
	public static void main(String... args) throws InterruptedException {
		final JFrame win = new JFrame("Anarchy");
		win.setDefaultCloseOperation(EXIT_ON_CLOSE);
		win.setSize(512, 512);
		final AnarchyPanel d = new AnarchyPanel();
		win.add(d);
		win.setVisible(true);

		final Anarchy v1 = new Anarchy();
		v1.setTailleTotale(d.getWidth(), d.getHeight());
		d.add(v1);

		final Anarchy v2 = new Anarchy(d.getWidth() / 2, d.getHeight() / 2, 40, 60);
		v2.setDy(-5);
		v2.setTailleTotale(d.getWidth(), d.getHeight());
		d.add(v2);

		while (true) {
			v1.deplacerAvecRebond(20_000_000);
			v2.deplacerAvecRebond(20_000_000);

			d.repaint();

			sleep(20);
		}
	}
}