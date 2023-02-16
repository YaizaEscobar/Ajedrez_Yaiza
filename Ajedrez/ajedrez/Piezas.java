package ajedrez;

import javax.swing.*;
import java.awt.*;

public class Piezas extends JFrame {

	int anchoCasilla = 50;
	int altoCasilla = 50;

	public Piezas() {
		
		setTitle("Pieza de Ajedrez");
		setSize(anchoCasilla, altoCasilla);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				dibujarPeon(g);
			}
		};
		add(panel);
	}

	private void dibujarPeon(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillOval(10, 10, 30, 30);
	}

	public static void main(String[] args) {
		Piezas pieza = new Piezas();
		pieza.setVisible(true);
	}
}
