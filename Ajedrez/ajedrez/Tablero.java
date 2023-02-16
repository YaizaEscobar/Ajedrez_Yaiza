/**
 * Juego Ajedrez en Java
 * @author Yaiza
 */

package ajedrez;

import javax.swing.*;
import java.awt.*;

/**
 * 
 * clase hija del Jframe para mostrar el tablero
 *
 */
public class Tablero extends JFrame {
	int filas = 8;
	int columnas = 8;
	int anchoCasilla = 50;
	int altoCasilla = 50;

	/**
	 * metodo para crear el tablero en swing
	 */
	public Tablero() {

		setTitle("Tablero de Ajedrez");
		setSize(anchoCasilla * columnas, altoCasilla * filas);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel(new GridLayout(filas, columnas));
		panel.setPreferredSize(new Dimension(anchoCasilla * columnas, altoCasilla * filas));
		add(panel);

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				JPanel casilla = new JPanel();
				if ((i + j) % 2 == 0) {
					casilla.setBackground(Color.WHITE);
				} else {
					casilla.setBackground(Color.BLACK);
				}
				panel.add(casilla);
			}
		}
	}

	public static void main(String[] args) {
		Tablero tablero = new Tablero();
		tablero.setVisible(true);
	}
	
	
	

}
