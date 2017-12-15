package ventanas;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import juego.jugador;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JTextPane;
import java.awt.TextField;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		//Nuevo Jugador//
		
		jugador player1=new jugador ();
		player1.setNombre("");
		player1.setApellidos("");
		player1.setLocalidad("");
		player1.setEdad(999);
		player1.setId(0);
		System.out.println(player1.toString());
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public principal() {
		
		jugador player1=new jugador ();
		player1.setNombre("");
		player1.setApellidos("");
		player1.setLocalidad("");
		player1.setEdad(999);
		player1.setId(0);
		
		//Etiqueta datos jugador
		setTitle("DATOS JUGADOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Etiqueta nombre
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 37, 67, 29);
		lblNombre.setFont(new Font("Cooper Black", Font.ITALIC, 14));
		contentPane.add(lblNombre);
		
		//Etiqueta apellidos
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(10, 70, 80, 21);
		lblApellidos.setFont(new Font("Cooper Black", Font.ITALIC, 14));
		contentPane.add(lblApellidos);
		
		//Etiqueta datos jugador (color y tipo letra)
		JLabel lblJugador = new JLabel("DATOS JUGADOR");
		lblJugador.setBounds(128, 10, 171, 21);
		lblJugador.setForeground(Color.RED);
		lblJugador.setFont(new Font("Cooper Black", Font.ITALIC, 16));
		contentPane.add(lblJugador);
		
		//Etiqueta localidad
		JLabel lblLocalidad = new JLabel("Localidad:");
		lblLocalidad.setBounds(10, 102, 80, 21);
		lblLocalidad.setFont(new Font("Cooper Black", Font.ITALIC, 14));
		contentPane.add(lblLocalidad);
		
		//Etiqueta puntos
		JLabel lblId = new JLabel("Edad:");
		lblId.setBounds(10, 134, 67, 21);
		lblId.setFont(new Font("Cooper Black", Font.ITALIC, 14));
		contentPane.add(lblId);
		
		//Muestra campo texto mensaje datos
		TextField textField = new TextField();
		textField.setBounds(10, 198, 263, 35);
		contentPane.add(textField);
		
		//Muestra campo texto nombre
		TextField textField_1 = new TextField();
		textField_1.setBounds(151, 37, 135, 21);
		contentPane.add(textField_1);
		
		//Espera intro para textfield
		textField_1.addActionListener(new ActionListener() {
		
			public void actionPerformed (ActionEvent arg0) {		
		//Al hacer intro se rellena campo
		player1.setNombre(textField.getText())	;
			}
		});
			
		//Muestra campo texto apellidos
		TextField textField_2 = new TextField();
		textField_2.setBounds(151, 70, 135, 21);
		contentPane.add(textField_2);
		//Espera intro para textfield
		textField_2.addActionListener(new ActionListener() {
		
			public void actionPerformed (ActionEvent arg0) {		
		//Al hacer intro se rellena campo
		player1.setNombre(textField.getText())	;
			}
		});
			
		
		//Muestra campo texto localidad
		TextField textField_3 = new TextField();
		textField_3.setBounds(151, 102, 135, 21);
		contentPane.add(textField_3);
		//Espera intro para textfield
		textField_3.addActionListener(new ActionListener() {
		
			public void actionPerformed (ActionEvent arg0) {		
		//Al hacer intro se rellena campo
		player1.setNombre(textField.getText())	;
			}
		});
			
		
		//Muestra campo texto edad
		TextField textField_4 = new TextField();
		textField_4.setBounds(151, 133, 56, 22);
		contentPane.add(textField_4);
		//Espera intro para textfield
		textField_4.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0) {		
		//Al hacer intro se rellena campo
		if(player1.isNumeric(textField_4.getText())==true)
			player1.setEdad(Integer.parseInt(textField_4.getText()));
		else
			player1.setEdad(999);
			}
			});
		
		//Asignacion datos de cada jugador
		player1.setNombre(textField_1.getText());
		player1.setApellidos(textField_2.getText());
		player1.setLocalidad(textField_3.getText());
		
		
		
		//Muestra boton
		JButton btnsiguiente = new JButton("JUEGA!");
		btnsiguiente.setBounds(301, 197, 123, 36);
		btnsiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			//Muestra el texto error o datos introducidos
			if (player1.getEdad()==999)
				textField.setText("Edad no es correcta. Pulse intro para continuar.");
			else if (player1.sonEspacios(player1.getNombre()))
				textField.setText("Falta nombre o no ha pulsado intro.");
			else if (player1.sonEspacios(player1.getApellidos()))
				textField.setText("Faltan apellidos o no ha pulsado intro.");
			else if (player1.sonEspacios(player1.getLocalidad()))
				textField.setText("Falta localidad o no ha pulsado intro.");
			else 
				textField.setText("Nuevo jugador: "+player1.getNombre()+" "+player1.getApellidos()+" "+player1.getLocalidad()+" de "+player1.getEdad()+" años");
			}
		});
		contentPane.add(btnsiguiente);
	
	}}

	