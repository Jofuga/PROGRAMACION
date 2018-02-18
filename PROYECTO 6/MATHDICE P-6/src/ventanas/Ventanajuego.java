package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import juego.Jugador;

import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Ventanajuego<Jlabel> extends JFrame {


	/**
 * Nombra atributos.
 */
private JPanel contentPane;
private JTextArea textArea;


// Array dados //

private ImageIcon[] dados3caras=new ImageIcon[3];
private ImageIcon[] dados6caras=new ImageIcon[6];
private ImageIcon[] dadosdocecaras=new ImageIcon[12];
private ImageIcon dadogris;


// Clase RANDOM para tiradas aleatorias //

private Random dado=new Random();


// Jlabel de la imagenes //

private JLabel dado1,dado2,dado3;
private JLabel dado4,dado5;
private JLabel dado6;

// Numero aleatorios para realizar el calculo //

private int[] numdados33=new int[3];
private int[] numdados66=new int[2];
private int numdados12;


// Clase que almacena Jugador //

private Jugador player1;
private JLabel nombrejugador;
private JLabel puntuacion;


// Jlabel botones de control + - mathdice //

private JButton botonsuma, botonresta, botonmathdice;


// Caja texto operaciones y resultado //

private JTextField text_operacion;


// Variables para el control de la aplicacion //

private boolean tocaNumero=true;
private boolean esSuma=true;
private int operacion=0;
private int numerosintroducidos=0;




// Jlabel resultadoOK //

private JLabel resultadoOK;
private JLabel resultadoLabel;
private JLabel resultado;


// Boton repetir //

private JButton repetir;




/**
 * Iniciar ventana
 */

 public class Random {

	private int nextInt(int i) {
		return 0;
	}

	public String getName() {
		return null;
	}

}



/**
 * Configurar ventana
 */


public Ventanajuego() {

	setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
	setTitle("JUEGO");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 871, 691);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);


	// textArea de mensaje de bienvenida //

	textArea = new JTextArea();
	textArea.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18));
	textArea.setBackground(SystemColor.menu);
	textArea.setEditable(false);
	textArea.setBounds(10, 22, 548, 40);
	contentPane.add(textArea);


	// Dado 1 //

	dado1 = new JLabel("");
	dado1.setBounds(10, 86, 181, 174);
	contentPane.add(dado1);

	// Dado 2 //

	dado2 = new JLabel("");
	dado2.setBounds(201, 86, 181, 174);
	contentPane.add(dado2);

	
	// Dado 3 //

	dado3 =  new JLabel("");
	dado3.setBounds(392, 86, 181, 174);
	contentPane.add(dado3);


	// Dado 4 //

	dado4 = new JLabel("");
	dado4.setBounds(10, 276, 181, 174);
	contentPane.add(dado4);


	// Dado 5 //

	dado5 = new JLabel("");
	dado5.setBounds(201, 276, 187, 174);
	contentPane.add(dado5);


	// Dado 12 //

	dado6 = new JLabel("");
	dado6.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
	dado6.setBounds(10, 446, 181, 174);
	contentPane.add(dado6);


	// boton + con listener //

	botonsuma = new JButton("+");
	botonsuma.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			if(!tocaNumero){
				text_operacion.setText(text_operacion.getText()+"+");
				tocaNumero=true;
				esSuma=true;
			}
		}
	});
	botonsuma.setForeground(new Color(255, 0, 0));
	botonsuma.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
	botonsuma.setBounds(583, 256, 70, 34);
	contentPane.add(botonsuma);


	// boton - con listener //

	botonresta = new JButton("-");
	botonresta.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(!tocaNumero){
				text_operacion.setText(text_operacion.getText()+"-");
				tocaNumero=true;
				esSuma=false;
		}
		}});
	botonresta.setForeground(new Color(255, 0, 0));
	botonresta.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
	botonresta.setBounds(754, 257, 70, 32);
	contentPane.add(botonresta);


	// Boton para introducir operaciones y calculo //

	//JButton
	botonmathdice = new JButton("MATHDICE");
	botonmathdice.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(numerosintroducidos>1){
				text_operacion.setText("Tu puntuación es "+String.valueOf(operacion));
				repetir.setEnabled(true);
			if((numdados12)==operacion){
				resultadoOK.setText("CORRECTO");
				botonmathdice.setEnabled(false);
				player1.setPuntos(player1.getPuntos()+5);
				puntuacion.setText("Tu puntuación es: "+player1.getPuntos());
			}else{
				resultadoOK.setText("Intentalo de nuevo");
				botonmathdice.setEnabled(false);
				}
			}
		}
	});


	botonmathdice.setForeground(new Color(255, 0, 0));
	botonmathdice.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
	botonmathdice.setBounds(583, 472, 241, 40);
	contentPane.add(botonmathdice);


	// Texto muestra operacion y resultado //

	text_operacion = new JTextField();
	text_operacion.setEditable(false);
	text_operacion.setForeground(new Color(0, 0, 255));
	text_operacion.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
	text_operacion.setBounds(583, 367, 241, 40);
	contentPane.add(text_operacion);
	text_operacion.setColumns(10);

	// Texto resultado Ok //


	resultadoOK = new JLabel("");
	resultadoOK.setBounds(583, 183, 241, 34);
	contentPane.add(resultadoOK);


	// Boton repetir //

	repetir = new JButton("Repetir");
	repetir.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		inicializarBotones();


		// Reactivar botonMATHDICE //

		botonmathdice.setEnabled(true);
		repetir.setEnabled(false);
		}
	});
	repetir.setForeground(new Color(255, 0, 0));
	repetir.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
	repetir.setBounds(662, 18, 162, 44);
	contentPane.add(repetir);


	// Texto puntuacion //

	puntuacion = new JLabel("Tu puntuacion es: 0");
	puntuacion.setForeground(new Color(255, 0, 255));
	puntuacion.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 24));
	puntuacion.setBounds(583, 567, 241, 53);
	contentPane.add(puntuacion);


	// Jugada inicial //

	inicializarBotones();

}

// Invoca clase jugador, coge los datos y los muestra como mensaje de bienvenida //

public void setJugador (Jugador player1){
	this.player1=player1;
	textArea.setText("Bienvenido Sr/a. "+player1.getApellidos()+" su puntuacion es: "+player1.getPuntos());

}


	// Operaciones Aritmeticas //
	

	private void setOperation(int num) {
		numerosintroducidos++;
		if(numerosintroducidos>1){
			if(esSuma) operacion=operacion+num;
			else operacion=operacion-num;
		}else{
			operacion=num;
		}
	}
	
	
	// Implementamos clase inner de ListenerDados para modificar metodo //
	
	private class ListenerDados implements MouseListener {
	
		@Override//Palabra reservada que avisamos al compilador que hemos modificado un metodo conforme a mis necesidades
		public void mouseClicked(MouseEvent e) {
			JLabel dado = (JLabel) e.getSource();//Identifica el Jlabel sobre el cual he hecho click y lo guardas en dado. (Será los numeros: 1,2,3,4 y 5).Valor recuperado del setName declarado en los bucles for 
			int numDado = Integer.valueOf(dado.getName());//Transformar a numero entero para obtener el valor.
			if(tocaNumero){//Control de saber si toca un numero o una operacion de esta manera no se pueden duplicar signos ni numeros.
	
				if(numDado<4){//Corresponde a las variables lblDado11, lblDado12, lblDado13.
					text_operacion.setText(text_operacion.getText()+String.valueOf(numdados33[numDado]));//Ejemplo: lblDado11 numDado-1=0 escogera el numero en posicion 0 del array y lo incrementara 1 lo transformara en valor y lo añadera al getText Contenido
				}else{//Corresponde a las variables lblDado21, lblDado22
					text_operacion.setText(text_operacion.getText()+String.valueOf(numdados66[numDado]));
				}
				dado.removeMouseListener(this);//Borra MouseListener del Jlabel
				dado.setIcon(dadogris);//Añade imagen del dado gris
				tocaNumero=false;//Variable semaforo en false (para impedir seleccionar dos dados a la vez o dos signos a la vez).
				
				// Condición para añadir la operacion junto al contenido que haya en la caja "boxOperaciones" //
				
				if(numDado<4){
						setOperation(numdados33[numDado]);
				}else{
						setOperation(numdados66[numDado]);
				}
			}
		}
	
		
		//Metodos asociados a la clase MouseListener (deberá tener todos los metodos):
	
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	// Implementamos clase inner de Suma para modificar metodo //
	
	
	private class Suma implements MouseListener{
	
		@Override//Palabra reservada que avisamos al compilador que hemos modificado un metodo conforme a mis necesidades
		public void mouseClicked(MouseEvent e) {
				if(!tocaNumero){
					text_operacion.setText(text_operacion.getText()+"+");
					tocaNumero=true;
					esSuma=true;
				}
			}
		
		//Metodos asociados a la clase MouseListener (deberá tener todos los metodos) //
		
		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
	
	
	// Implementamos clase inner de Resta para modificar metodo //
	
	private class Resta implements MouseListener{
	
		@Override//Palabra reservada que avisamos al compilador que hemos modificado un metodo conforme a mis necesidades //
		
		public void mouseClicked(MouseEvent e) {
			if(!tocaNumero){
				text_operacion.setText(text_operacion.getText()+"-");
				tocaNumero=true;
				esSuma=false;
			}
		}
		
		//Metodos asociados a la clase MouseListener (deberá tener todos los metodos) // 
		
		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
	
	
	private void inicializarBotones() {
	
		
	// Para cargar las imagenes de los Arrays //

	for(int i=0;i<dados3caras.length;i++){
		dados3caras[i]=new ImageIcon(getClass().getResource("img/dado"+String.valueOf(i+1)+"_3.png"));
	}
	for(int i=0;i<dados6caras.length;i++){
		dados6caras[i]=new ImageIcon(getClass().getResource("img/dado"+String.valueOf(i+1)+"_6.png"));
	}
	for(int i=0;i<dadosdocecaras.length;i++){
		dadosdocecaras[i]=new ImageIcon(getClass().getResource("img/dadodoce_"+String.valueOf(i+1)+".png"));
	}
	dadogris=new ImageIcon(getClass().getResource("img/dadogris.png"));


	// Colocamos dados de 3 caras //

	for(int i=0;i<numdados33.length;i++) numdados33[i]=dado.nextInt(3);

		dado1.setIcon(dados3caras[numdados33[0]]);
	dado1.setName("1");
	dado2.setIcon(dados3caras[numdados33[1]]);
	dado2.setName("2");
	dado3.setIcon(dados3caras[numdados33[2]]);
	dado3.setName("3");
	dado1.addMouseListener(new ListenerDados());
	dado2.addMouseListener(new ListenerDados());
	dado3.addMouseListener(new ListenerDados());


	// Colocamos dados de 6 caras //

	for(int i=0;i<numdados66.length;i++) numdados66[i]=dado.nextInt(6);
	dado4.setIcon(dados6caras[numdados66[0]]);
	dado4.setName("4");
	dado5.setIcon(dados6caras[numdados66[1]]);
	dado5.setName("5");
	dado4.addMouseListener(new ListenerDados());
	dado5.addMouseListener(new ListenerDados());
	
	// Resetamos semaforo //
	
	tocaNumero=true;
	esSuma=true;
	operacion=0;
	numerosintroducidos=0;

	// Colocamos dados de 12 caras //

	numdados12=dado.nextInt(12);
	dado6.setIcon(dadosdocecaras[numdados12]);
	// Reset texts //
	//Por aquÃ­ te aparecen errores porque parece que alguno de estos labels no estÃ¡n puestos en el jframe
	//resultadoLabel.setText("");
	resultadoOK.setText("");
	//resultado.setText("");
	
	
	

	
	
	
	
}
}
