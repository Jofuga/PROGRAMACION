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
		player1.setNombre("Jonatan");
		player1.setApellidos("Fuentes García");
		player1.setLocalidad("Alfafar");
		player1.setEdad(29);
		player1.setId(1);
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
		setTitle("Datos Jugador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Cooper Black", Font.ITALIC, 14));
		lblNombre.setBounds(10, 65, 67, 29);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Cooper Black", Font.ITALIC, 14));
		lblApellidos.setBounds(10, 105, 80, 21);
		contentPane.add(lblApellidos);
		
		JLabel lblJugador = new JLabel("DATOS JUGADOR");
		lblJugador.setForeground(Color.RED);
		lblJugador.setFont(new Font("Cooper Black", Font.ITALIC, 16));
		lblJugador.setBounds(141, 11, 171, 21);
		contentPane.add(lblJugador);
		
		JLabel lblLocalidad = new JLabel("Localidad:");
		lblLocalidad.setFont(new Font("Cooper Black", Font.ITALIC, 14));
		lblLocalidad.setBounds(10, 147, 80, 21);
		contentPane.add(lblLocalidad);
		
		JLabel lblId = new JLabel("Puntos:");
		lblId.setFont(new Font("Cooper Black", Font.ITALIC, 14));
		lblId.setBounds(10, 199, 67, 21);
		contentPane.add(lblId);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(157, 156, -3, 12);
		contentPane.add(textPane_1);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(157, 65, 135, 21);
		contentPane.add(textField_1);
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(157, 105, 135, 21);
		contentPane.add(textField_2);
		
		TextField textField_3 = new TextField();
		textField_3.setBounds(157, 147, 135, 21);
		contentPane.add(textField_3);
		
		TextField textField_4 = new TextField();
		textField_4.setBounds(157, 199, 58, 22);
		contentPane.add(textField_4);
		
		JButton btnSiguiente = new JButton("Siguiente >>");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSiguiente.setBounds(301, 197, 123, 23);
		contentPane.add(btnSiguiente);
	}
}
