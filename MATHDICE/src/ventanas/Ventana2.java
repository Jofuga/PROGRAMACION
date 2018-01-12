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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Ventana2 extends JFrame {

	
	/**
	 * Nombra atributos.
	 */
	private JPanel contentPane;
	private Jugador player1;
	private JTextArea textArea;
	private JTextField text_operacion;
	
	
	// Jlabel de la imagenes //
	
	private JLabel dado1,dado2,dado3;
	private JLabel dado4,dado5;
	private JLabel dado6;
	
	
	
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
		textArea.setBounds(10, 22, 414, 40);
		contentPane.add(textArea);
		
		
		// Dado 1 //
		
		JLabel dado1 = new JLabel("falta conf img");
		dado1.setBounds(10, 86, 70, 76);
		contentPane.add(dado1);
		
		
		// Dado 2 //
		
		JLabel dado2 = new JLabel("falta conf img");
		dado2.setBounds(94, 86, 70, 76);
		contentPane.add(dado2);
		
		
		// Dado 3 //
		
		JLabel dado3 = new JLabel("falta conf img");
		dado3.setBounds(174, 86, 70, 76);
		contentPane.add(dado3);
		
		
		// Dado 4 //
		
		JLabel dado4 = new JLabel("falta conf img");
		dado4.setBounds(10, 173, 70, 76);
		contentPane.add(dado4);
		
		
		// Dado 5 //
		
		JLabel dado5 = new JLabel("falta conf img");
		dado5.setBounds(94, 173, 70, 76);
		contentPane.add(dado5);
		
		
		// Dado 12 //
		
		JLabel dado6 = new JLabel("falta conf img");
		dado6.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		dado6.setBounds(10, 260, 70, 76);
		contentPane.add(dado6);
		
		
		// boton + con listener //
		
		JButton botonsuma = new JButton("+");
		botonsuma.setForeground(new Color(255, 0, 0));
		botonsuma.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		botonsuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		botonsuma.setBounds(288, 119, 70, 34);
		contentPane.add(botonsuma);
		
		
		// boton - con listener //
		
		JButton botonresta = new JButton("-");
		botonresta.setForeground(new Color(255, 0, 0));
		botonresta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonresta.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		botonresta.setBounds(415, 119, 70, 32);
		contentPane.add(botonresta);
		
		
		// Boton para introducir operaciones y calculo //
		
		JButton btnNewButton = new JButton("MATHDICE");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(288, 226, 197, 40);
		contentPane.add(btnNewButton);
		
		
		// Texto muestra operacion a realizar //
		
		text_operacion = new JTextField();
		text_operacion.setForeground(new Color(0, 0, 255));
		text_operacion.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		text_operacion.setEnabled(false);
		text_operacion.setBounds(288, 173, 197, 40);
		contentPane.add(text_operacion);
		text_operacion.setColumns(10);
	}

	
	// Invoca clase jugador, coge los datos y los muestra como mensaje de bienvenida //
	
	public void setJugador (Jugador player1){
		this.player1=player1;
		textArea.setText("Bienvenido Sñr/a. "+player1.getApellidos()+" ¡Vamos a jugar!");
		
	}
	}