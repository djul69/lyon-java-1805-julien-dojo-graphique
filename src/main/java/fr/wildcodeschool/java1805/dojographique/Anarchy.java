package fr.wildcodeschool.java1805.dojographique;

import java.awt.Graphics;

import javafx.scene.canvas.GraphicsContext;

public class Anarchy {
	private int largeurTotale, hauteurTotale;

	private int xhg = 0;
	private int yhg = 0;
	private int largeur = 50;
	private int hauteur = 50;
	private int dx = 5;
	private int dy = 5;

	public Anarchy() {
	}

	public Anarchy(int xg, int yg) {
		xhg = xg;
		yhg = yg;
	}

	public Anarchy(int xg, int yg, int larg, int haut) {
		xhg = xg;
		yhg = yg;

		largeur = larg;
		hauteur = haut;
	}

	public int getDx() {
		return dx;
	}

	public void setDx(int v) {
		this.dx = v;
	}

	public int getDy() {
		return dy;
	}

	public void setDy(int v) {
		this.dy = v;
	}

	public void inverserDx() {
		dx = -dx;
	}

	public void inverserDy() {
		dy = -dy;
	}

	public void inverserDxEtDy() {
		dx = -dx;
		dy = -dy;
	}

	public void deplacer() {
		xhg += dx;
		yhg += dy;
	}

	public void deplacerAvecRebond(long duration) {
		if (bordGaucheAtteint() || bordDroitAtteint())
			inverserDx();
		if (bordHautAtteint() || bordBasAtteint())
			inverserDy();
		xhg += dx * (duration / 20_000_000);
		yhg += dy * (duration / 20_000_000);
	}

	public boolean bordGaucheAtteint() {
		return (xhg < 0);
	}

	public boolean bordDroitAtteint() {
		return ((xhg + largeur) > largeurTotale);
	}

	public boolean bordHautAtteint() {
		return (yhg < 0);
	}

	public boolean bordBasAtteint() {
		return ((yhg + hauteur) >= hauteurTotale);
	}

	public void setTailleTotale(int largeurTotale, int hauteurTotale) {
		this.largeurTotale = largeurTotale;
		this.hauteurTotale = hauteurTotale;
	}

	public void dessiner(Graphics g) {
		g.drawOval(xhg, yhg, largeur, hauteur);

		g.drawLine(xhg + largeur / 2, yhg, xhg, yhg + hauteur);
		g.drawLine(xhg + largeur / 2, yhg, xhg + largeur, yhg + hauteur);
		g.drawLine(xhg, yhg + hauteur / 2, xhg + largeur, yhg + hauteur / 2);
	}

	public void dessiner(GraphicsContext gc) {
		gc.strokeOval(xhg, yhg, largeur, hauteur);

		gc.strokeLine(xhg + largeur / 2, yhg, xhg, yhg + hauteur);
		gc.strokeLine(xhg + largeur / 2, yhg, xhg + largeur, yhg + hauteur);
		gc.strokeLine(xhg, yhg + hauteur / 2, xhg + largeur, yhg + hauteur / 2);
	}
}