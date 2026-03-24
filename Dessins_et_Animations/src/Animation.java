import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation extends JPanel implements ActionListener {
	private int x;
	private int vitesse;

	public Animation() {
		x = 0;
		vitesse = 1;
		Timer timer = new Timer(10, this);

		timer.start();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillOval(x, 50, 30, 30);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		x += vitesse;

		if (x >= getWidth()) vitesse *= -1;

		if (x <= 0) vitesse *= -1;

		repaint();
	}
}
