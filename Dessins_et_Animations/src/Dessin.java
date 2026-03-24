import javax.swing.*;
import java.awt.*;

public class Dessin extends JFrame {
	public Dessin() {
		super("ISPM is the BEST"); // titre de la fenêtre

		this.setSize(640, 360); // largeur et hauteur de la fenêtre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // arrête le programme au fermeture de la fenêtre
		this.setVisible(true); // activer la visibilité de la fenêtre
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		// Bonhomme
		g.drawOval(30, 30, 60, 60); // tête
		g.drawLine(60, 90, 60, 230); // tronc
		g.drawLine(60, 120, 90, 200);// bras gauche
		g.drawLine(60, 120, 30, 200);// bras droit
		g.drawLine(60, 230, 90, 320);// jambe gauche
		g.drawLine(60, 230, 30, 320);// jambe droite

		// Maison, inspiration: https://pin.it/5uP09YHec
		// toit
		g.drawLine(240, 80, 520, 20);
		g.drawLine(200, 110, 450, 65);
		g.drawLine(200, 110, 240, 80);
		g.drawLine(450, 65, 520, 20);
		g.drawLine(520, 20, 600, 120);
		// mur
		g.drawLine(210, 108, 210, 270);
		g.drawLine(465, 56, 465, 320);
		g.drawLine(590, 107, 590, 260);
		g.drawLine(210, 270, 465, 320);
		g.drawLine(465, 320, 590, 260);
		// porte
		g.drawLine(250, 180, 250, 278);
		g.drawLine(300, 175, 300, 288);
		g.drawLine(250, 180, 300, 175);
		// fenêtre 1
		g.drawLine(350, 171, 350, 230);
		g.drawLine(390, 168, 390, 230);
		g.drawLine(440, 163, 440, 230);
		g.drawLine(350, 171, 440, 163);
		g.drawLine(350, 230, 440, 230);
		// fenêtre 2
		g.drawLine(500, 163, 500, 230);
		g.drawLine(565, 171, 565, 230);
		g.drawLine(500, 163, 565, 171);
		g.drawLine(500, 230, 565, 230);
	}
}
