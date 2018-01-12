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

public class Ventana2 extends JFrame {

	/**
	 * 
	 */
	private JPanel contentPane;
	private Jugador player1;
	private JTextArea textArea;
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		textArea.setBackground(SystemColor.menu);
		textArea.setEditable(false);
		textArea.setBounds(10, 22, 414, 40);
		contentPane.add(textArea);
	}

	public void setJugador (Jugador player1){
		this.player1=player1;
		textArea.setText("Bienvenido Sñr/a. "+player1.toString()+"¡Vamos a jugar!");
		
	}
	}