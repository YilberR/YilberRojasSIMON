package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import co.edu.unbosque.model.Archivo;
import co.edu.unbosque.model.persistence.Propiedades;
import co.edu.unbosque.model.persistence.X;
import co.edu.unbosque.view.Juego;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {

	private static int a = 0;
	private static int b = 0;
	private static int c = 0;
	private static int d = 0;
	private Propiedades prop;
	int cont=0;
	int cont2=0;
	private VentanaPrincipal vista;
	private X x;
	private Archivo e;	

	public Controller() {
		e = new Archivo();
		prop = new Propiedades();
		vista = new VentanaPrincipal();
		x=new X();
		asignarOyentes();
		funcionar();
	}

	private void funcionar() {
		JOptionPane.showMessageDialog(null, (e.gestionarPopiedades()));
	

			ScheduledExecutorService service= Executors.newSingleThreadScheduledExecutor();
			Runnable case1=()-> vista.getJuego().getBoton_5().setText("");
			service.scheduleAtFixedRate(case1, 2, 1,TimeUnit.SECONDS);	
			Runnable case2=()-> vista.getJuego().getBoton_6().setText("");
			service.scheduleAtFixedRate(case2, 2, 1,TimeUnit.SECONDS);
			Runnable case3=()-> vista.getJuego().getBoton_7().setText("");
			service.scheduleAtFixedRate(case3, 2, 1,TimeUnit.SECONDS);
			Runnable case4=()-> vista.getJuego().getBoton_8().setText("");
			service.scheduleAtFixedRate(case4, 2, 1,TimeUnit.SECONDS);
			
		}
	public void asignarOyentes() {
		vista.getJuego().getBoton_1().addActionListener(this);
		vista.getJuego().getBoton_2().addActionListener(this);
		vista.getJuego().getBoton_3().addActionListener(this);
		vista.getJuego().getBoton_4().addActionListener(this);
		vista.getJuego().getBoton_9().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
			try{
				if(e.getActionCommand().equals("Bot1")) {	
				x.num1[cont]=1;
				
			}else if(e.getActionCommand().equals("Bot2")) {
				x.num1[cont]=2;
				
			}else if(e.getActionCommand().equals("Bot3")) {
				x.num1[cont]=4;
				
			}else if(e.getActionCommand().equals("Bot4")) {			
				x.num1[cont]=3;

			}}catch(Exception e1) {
				JOptionPane.showMessageDialog(null, "Excedió el número de clicks");
				
			} if(e.getActionCommand().equals("Bot9")){								
				if(x.num1[0]==vista.getJuego().num2[0]&&
						x.num1[1]==vista.getJuego().num2[1]&&
								x.num1[2]==vista.getJuego().num2[2]&&
										x.num1[3]==vista.getJuego().num2[3]) {	
					JOptionPane.showMessageDialog(null, "FELICIDADES GANÓ");
					System.exit(0);
				}else if(x.num1[0]!=vista.getJuego().num2[0]||
							x.num1[1]!=vista.getJuego().num2[1]||
								x.num1[2]!=vista.getJuego().num2[2]||                                                                                                           
									x.num1[3]!=vista.getJuego().num2[3]) {
					JOptionPane.showMessageDialog(null, "PERDISTE :c");
					System.exit(0);
				}
			}
	cont++;}

}
			
	



		
	
	
	
	
	
	
	
	
	
	
	
