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

public class Ventana2 extends JFrame {

	
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
	JLabel nombrejugador;
	JLabel puntuacion;
	
	
	// Jlabel botones de control + - mathdice //
	
	private JButton suma,resta,mathdice;
	
	// Caja texto operaciones y resultado //
	
	private JTextField text_operacion;
	
	
	// Variables para el control de la aplicacion //
	
	private boolean tocaNumero=true;
	private int operacion=0;
	private int numerosintroducidos=0;
	private boolean esSuma=true;
	
	
	// Jlabel resultadoOK //
	
	private JLabel resultadoOK;
	private JLabel resultadoLabel;
	private JLabel resultado;
	
	
	// Boton repetir //
	
	private JButton repetir;
	
	
	
	
	/**
	 * Iniciar ventana
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 frame = new Ventana2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	public class Random {

		private int nextInt(int i) {
			// TODO Auto-generated method stub
			return 0;
		}

	}
	
	
	
	/**
	 * Configurar ventana
	 */
	
	
	public Ventana2() {
		
		setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		setTitle("JUEGO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		// textArea de mensaje de bienvenida //
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		textArea.setBackground(SystemColor.menu);
		textArea.setEditable(false);
		textArea.setBounds(10, 22, 251, 40);
		contentPane.add(textArea);
	
		
		// Dado 1 //
		
		JLabel dado1 = new JLabel("");
		dado1.setBounds(10, 86, 70, 76);
		contentPane.add(dado1);
		
		// Dado 2 //
		
		JLabel dado2 = new JLabel("");
		dado2.setBounds(90, 86, 60, 76);
		contentPane.add(dado2);
		
		
		// Dado 4 //
		
		JLabel dado4 = new JLabel("");
		dado4.setBounds(10, 173, 70, 76);
		contentPane.add(dado4);
		
				
				
		// Dado 3 //
				
		JLabel dado3 = new JLabel("");
		dado3.setBounds(174, 86, 70, 76);		
		contentPane.add(dado3);
		
		
		// Dado 5 //
		
		JLabel dado5 = new JLabel("");
		dado5.setBounds(94, 173, 70, 76);
		contentPane.add(dado5);
		
		
		// Dado 12 //
		
		JLabel dado6 = new JLabel("");
		dado6.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		dado6.setBounds(10, 260, 70, 76);
		contentPane.add(dado6);
		
		
		// boton + con listener //
		
		JButton botonsuma = new JButton("+");
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
		botonsuma.setBounds(288, 119, 70, 34);
		contentPane.add(botonsuma);
		
		
		// boton - con listener //
		
		JButton botonresta = new JButton("-");
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
		botonresta.setBounds(415, 119, 70, 32);
		contentPane.add(botonresta);
		
		
		// Boton para introducir operaciones y calculo //
		
		JButton botonmathdice = new JButton("MATHDICE");
		botonmathdice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(numerosintroducidos>1){
					text_operacion.setText("Tu operación es "+String.valueOf(operacion));
					repetir.setEnabled(true);
				if((numdados12)==operacion){
					resultadoOK.setText("CORRECTO");
					mathdice.setEnabled(false);
					player1.setPuntos(player1.getPuntos()+5);
					puntuacion.setText("Tu puntuación es: "+player1.getPuntos());
				}else{
					resultadoOK.setText("Inténtalo de nuevo");
					mathdice.setEnabled(false);
					}
				}
			}
		});
		
		
		botonmathdice.setForeground(new Color(255, 0, 0));
		botonmathdice.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		botonmathdice.setBounds(288, 226, 197, 40);
		contentPane.add(botonmathdice);
		
		
		// Texto muestra operacion y resultado //
		
		text_operacion = new JTextField();
		text_operacion.setEditable(false);
		text_operacion.setForeground(new Color(0, 0, 255));
		text_operacion.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		text_operacion.setBounds(288, 173, 197, 40);
		contentPane.add(text_operacion);
		text_operacion.setColumns(10);
		
		// Texto resultado Ok //
		
		JLabel resultadoOK = new JLabel("");
		resultadoOK.setBounds(234, 302, 124, 34);
		contentPane.add(resultadoOK);
		
		
		// Boton repetir //
		
		JButton repetir = new JButton("Repetir");
		repetir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			inicializarBotones();
			// Reactivar boton MATHDICE //
			
			mathdice.setEnabled(true);
			repetir.setEnabled(false);
			}
		});
		repetir.setForeground(new Color(255, 0, 0));
		repetir.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		repetir.setBounds(389, 20, 124, 23);
		contentPane.add(repetir);
		
		
		// Texto puntuacion //
		
		JLabel puntuacion = new JLabel("Tu puntuacion es: 0");
		puntuacion.setForeground(new Color(255, 0, 255));
		puntuacion.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		puntuacion.setBounds(368, 313, 145, 23);
		contentPane.add(puntuacion);
		
	}

	// Invoca clase jugador, coge los datos y los muestra como mensaje de bienvenida //
	
	public void setJugador (Jugador player1){
		this.player1=player1;
		textArea.setText("Bienvenido Sñr/a. "+player1.getApellidos()+" su puntuación es: "+player1.getPuntos());

		
	}
	
	// Operaciones Aritméticas //
	
	private void setOperation(int num) {
		numerosintroducidos++;
		if(numerosintroducidos>1){
			if(esSuma) operacion=operacion+num;
			else operacion=operacion-num;
		}else{
			operacion=num;
		}
	}
	
	private void inicializarBotones() {
		
		// Para cargar las imagenes de los Arrays //
		
		for(int i=0;i<dados3caras.length;i++){
			dados3caras[i]=new ImageIcon(getClass().getResource("/ventanas/img/dado"+String.valueOf(i+1)+"_3.png"));
		}
		for(int i=0;i<dados6caras.length;i++){
			dados6caras[i]=new ImageIcon(getClass().getResource("/ventanas/img/dado"+String.valueOf(i+1)+"_6.png"));
		}
		for(int i=0;i<dadosdocecaras.length;i++){
			dadosdocecaras[i]=new ImageIcon(getClass().getResource("/ventanas/img/dadodoce"+String.valueOf(i+1)+".png"));
		}
		dadogris=new ImageIcon(getClass().getResource("/ventanas/img/dadogris.png"));
		
	
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
		
		
		// Colocamos dados de 12 caras //
		
		numdados12=dado.nextInt(13);
		dado6.setIcon(dadosdocecaras[numdados12]);
		// Reset texts //
		resultadoLabel.setText("");
		resultadoOK.setText("");
		resultado.setText("");
		
		
		
		

		
		
		
	}
}