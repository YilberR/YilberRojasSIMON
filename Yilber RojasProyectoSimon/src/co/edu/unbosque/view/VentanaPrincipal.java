package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
	
	private Juego juego;

	public VentanaPrincipal() {
		setTitle("");
		setSize(400,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.gray);
		getContentPane().setLayout(null);	
		inicializarComponentes();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void inicializarComponentes() {
		juego=new Juego();
		juego.setBounds(2, 3, 389, 465);
		getContentPane().add(juego);
	}

	public Juego getJuego() {
		return juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}
}
