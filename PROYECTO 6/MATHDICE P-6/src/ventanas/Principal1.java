package ventanas;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import juego.Jugador;
import juego.Login;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JTextPane;
import java.awt.TextField;
import java.awt.Window;

import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;


public class Principal1 extends JFrame {

	
	/**
	 * Nombramos atributos.
	 */
	private JPanel contentPane;
	private Jugador player1;
	private Ventanajuego v2;
	private Principal1 referencia;
	private Login login;

	
	/**
	 * Ventana visible.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal1 frame = new Principal1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Inicia aplicacion.
	 *   
	 */
	public Principal1() {
		setForeground(Color.BLACK);
		setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		
		
		referencia=this;
		
		player1=new Jugador();
		player1.setNombre("");
		player1.setApellidos("");
		player1.setLocalidad("");
		player1.setEdad(999);
		player1.setId(0);
		player1.setPuntos(0);
		
		
		// Etiqueta ventana //
		
		setTitle("MATH DICE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		// Etiqueta nombre //
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(new Color(0, 0, 255));
		lblNombre.setBounds(10, 37, 67, 29);
		lblNombre.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(lblNombre);
		
		
		// Etiqueta apellidos //
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setForeground(new Color(0, 0, 255));
		lblApellidos.setBounds(10, 70, 80, 21);
		lblApellidos.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(lblApellidos);
		
		
		// Etiqueta datos jugador //
		
		JLabel lblJugador = new JLabel("DATOS JUGADOR");
		lblJugador.setBounds(128, 10, 171, 21);
		lblJugador.setForeground(Color.RED);
		lblJugador.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		contentPane.add(lblJugador);
		
		
		// Etiqueta localidad //
		
		JLabel lblLocalidad = new JLabel("Localidad:");
		lblLocalidad.setForeground(new Color(0, 0, 255));
		lblLocalidad.setBounds(10, 102, 80, 21);
		lblLocalidad.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(lblLocalidad);
		
		
		// Etiqueta edad //
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setForeground(new Color(0, 0, 255));
		lblEdad.setBounds(10, 134, 67, 21);
		lblEdad.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(lblEdad);
		
		
		// Muestra campo texto mensaje datos //
		
		TextField text_fallos = new TextField();
		text_fallos.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		text_fallos.setBounds(10, 198, 263, 35);
		contentPane.add(text_fallos);
		
		
		// Muestra campo texto nombre //
		
		TextField text_nombre = new TextField();
		text_nombre.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		text_nombre.setBounds(151, 37, 135, 21);
		contentPane.add(text_nombre);
		
		
		// Espera intro para text_nombre //
		
		text_nombre.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0) {	
				
				
		// Al hacer intro se rellena campo //

		player1.setNombre(text_nombre.getText());
			}
		});
			
		
		//Muestra campo text_apellidos //
		
		TextField text_apellidos = new TextField();
		text_apellidos.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		text_apellidos.setBounds(151, 70, 135, 21);
		contentPane.add(text_apellidos);
		
		
		// Espera intro para text_apellidos //
		
		text_apellidos.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0) {	
				
    
		// Al hacer intro se rellena campo //
				
		player1.setApellidos(text_apellidos.getText())	;
			}
		});
			
		
		// Muestra campo text_localidad //
		
		TextField text_localidad = new TextField();
		text_localidad.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		text_localidad.setBounds(151, 102, 135, 21);
		contentPane.add(text_localidad);
		
		
		// Espera intro para text_localidad //
		
		text_localidad.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0) {	
				
				
		// Al hacer intro se rellena campo //
				
		player1.setLocalidad(text_localidad.getText())	;
			}
		});
			
		
		// Muestra campo text_edad //
		
		TextField text_edad = new TextField();
		text_edad.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		text_edad.setBounds(151, 133, 56, 22);
		contentPane.add(text_edad);
		
		
		// Espera intro para text_edad //
		
		text_edad.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0) {	
				
				
		// Al hacer intro se rellena campo, comprobando que sea numerico //
				
		if(player1.isNumeric(text_edad.getText())==true)
			player1.setEdad(Integer.parseInt(text_edad.getText()));
		else
			player1.setEdad(999);
			}
			});
		
		
		// Muestra botonJuega, espera intro y rellena campo //
		
		JButton botonJuega = new JButton("JUEGA!");
		botonJuega.setForeground(new Color(255, 0, 0));
		botonJuega.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		botonJuega.setBounds(301, 197, 123, 36);
		botonJuega.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player1.setNombre(text_fallos.getText());
				
				

				
			// Muestra el texto error o datos introducidos //
				
			if (player1.getEdad()==999)
				text_fallos.setText("Edad no es correcta. Pulse intro para continuar.");
			else if (player1.sonEspacios(player1.getNombre()))
				text_fallos.setText("Falta nombre o no ha pulsado intro.");
			else if (player1.sonEspacios(player1.getApellidos()))
				text_fallos.setText("Faltan apellidos o no ha pulsado intro.");
			else if (player1.sonEspacios(player1.getLocalidad()))
				text_fallos.setText("Falta localidad o no ha pulsado intro.");
			else 
				text_fallos.setText("Nuevo jugador: "+player1.getNombre()+" "+player1.getApellidos()+" "+player1.getLocalidad()+" de "+player1.getEdad()+" años");
			
			
			// Cierra ventana con referencia = cualquier atributo de la clase //
			
			referencia.dispose();
			
			
			// Nombra v2, importa jugador y muestra v2 //
			
			v2=new Ventanajuego();
			v2.setJugador(player1);
			v2.setVisible(true);
			}
		});
		contentPane.add(botonJuega);
	
	}

	
	//Se genera para poder crear principa1=v1 en ventana Login //
	
	public Principal1(Ventanajuego v22) {
		// TODO Auto-generated constructor stub
	}

	}
