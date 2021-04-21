package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Juego extends JPanel {

	private JLabel etiqueta_numero1;
	public int num2[];
	private JButton boton_1;
	private JButton boton_2;
	private JButton boton_3;
	private JButton boton_4;
	private JButton boton_5;
	private JButton boton_6;
	private JButton boton_7;
	private JButton boton_8;
	private JButton boton_9;
	int x = (int) Math.floor(Math.random()*4+1);
	int a= (int) Math.floor(Math.random()*4+1);
	int b= (int) Math.floor(Math.random()*4+1);
	int v = (int) Math.floor(Math.random()*4+1);
	
	public Juego() {
		
		num2=new int[4];
		cadena1();
		setLayout(null);
		inicializarComponentes();
		setVisible(true);	
}

	public void cadena1() {
		num2[0]=x;
		num2[1]=a;
		num2[2]=b;
		num2[3]=v;
		
	}

	private void inicializarComponentes() {		

		setBackground(Color.WHITE);
		setBorder(new TitledBorder("SIMÓN"));
		
		etiqueta_numero1 = new JLabel("Sigue esta secuencia: ");
		etiqueta_numero1.setBounds(50, 40, 130, 20);
		add(etiqueta_numero1);
		
		boton_1 = new JButton("1");
		boton_1.setBounds(45, 140, 150, 100);
		boton_1.setBackground(Color.yellow);
		boton_1.setActionCommand("Bot1");
		add(boton_1);

			
		boton_2 = new JButton("2");
		boton_2.setBounds(200, 140, 150, 100);
		boton_2.setBackground(Color.CYAN);
		boton_2.setActionCommand("Bot2");
		add(boton_2);

		boton_3 = new JButton("4");
		boton_3.setBounds(200, 245, 150, 100);
		boton_3.setBackground(Color.red);
		boton_3.setActionCommand("Bot3");
		add(boton_3);

		boton_4 = new JButton("3");
		boton_4.setBounds(45, 245, 150, 100);
		boton_4.setBackground(Color.green);
		boton_4.setActionCommand("Bot4");
		add(boton_4);
		
		
		boton_5 = new JButton(""+x);	
		boton_5.setBounds(85, 70, 50, 50);
		boton_5.setBackground(Color.white);
		boton_5.setBorder(BorderFactory.createLineBorder(Color.black));
		boton_5.setActionCommand("Bot5");
		add(boton_5);
		

		
		boton_6 = new JButton(""+a);
		boton_6.setBounds(140, 70, 50, 50);
		boton_6.setBackground(Color.white);
		boton_6.setBorder(BorderFactory.createLineBorder(Color.black));
		boton_6.setActionCommand("Bot6");
		add(boton_6);

		
		boton_7 = new JButton(""+b);
		boton_7.setBounds(195, 70, 50, 50);
		boton_7.setBackground(Color.white);
		boton_7.setBorder(BorderFactory.createLineBorder(Color.black));
		boton_7.setActionCommand("Bot7");
		add(boton_7);

		
		boton_8 = new JButton(""+v);
		boton_8.setBounds(250, 70, 50, 50);
		boton_8.setBackground(Color.white);
		boton_8.setBorder(BorderFactory.createLineBorder(Color.black));
		boton_8.setActionCommand("Bot8");		
		add(boton_8);
		
		boton_9 = new JButton("TERMINAR");
		boton_9.setBounds(150, 370, 100, 50);
		boton_9.setBackground(Color.LIGHT_GRAY);
		boton_9.setBorder(BorderFactory.createLineBorder(Color.black));
		boton_9.setActionCommand("Bot9");
		add(boton_9);
	}	
	public JLabel getEtiqueta_numero1() {
		return etiqueta_numero1;
	}

	public void setEtiqueta_numero1(JLabel etiqueta_numero1) {
		this.etiqueta_numero1 = etiqueta_numero1;
	}

	public JButton getBoton_1() {
		return boton_1;
	}

	public void setBoton_1(JButton boton_1) {
		this.boton_1 = boton_1;
	}

	public JButton getBoton_2() {
		return boton_2;
	}

	public void setBoton_2(JButton boton_2) {
		this.boton_2 = boton_2;
	}

	public JButton getBoton_3() {
		return boton_3;
	}

	public void setBoton_3(JButton boton_3) {
		this.boton_3 = boton_3;
	}

	public JButton getBoton_4() {
		return boton_4;
	}

	public void setBoton_4(JButton boton_4) {
		this.boton_4 = boton_4;
	}

	public JButton getBoton_5() {
		return boton_5;
	}

	public void setBoton_5(JButton boton_5) {
		this.boton_5 = boton_5;
	}

	public JButton getBoton_6() {
		return boton_6;
	}

	public void setBoton_6(JButton boton_6) {
		this.boton_6 = boton_6;
	}

	public JButton getBoton_7() {
		return boton_7;
	}

	public void setBoton_7(JButton boton_7) {
		this.boton_7 = boton_7;
	}

	public JButton getBoton_8() {
		return boton_8;
	}

	public void setBoton_8(JButton boton_8) {
		this.boton_8 = boton_8;
	}

	public JButton getBoton_9() {
		return boton_9;
	}

	public void setBoton_9(JButton boton_9) {
		this.boton_9 = boton_9;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}

		
}










































