import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class miperfil1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtJonatanFuentes;
	private JTextField txtFuentesGarca;
	private JTextField textField;
	private JTextField txtJfuentesggmailcom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					miperfil1 frame = new miperfil1();
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
	public miperfil1() {
		setTitle("Perfil1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 25, 78, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(10, 77, 78, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(10, 142, 46, 14);
		contentPane.add(lblEdad);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 195, 46, 14);
		contentPane.add(lblEmail);
		
		txtJonatanFuentes = new JTextField();
		txtJonatanFuentes.setText("Jonatan");
		txtJonatanFuentes.setBounds(10, 46, 131, 20);
		contentPane.add(txtJonatanFuentes);
		txtJonatanFuentes.setColumns(10);
		
		txtFuentesGarca = new JTextField();
		txtFuentesGarca.setText("Fuentes Garc\u00EDa");
		txtFuentesGarca.setBounds(10, 102, 131, 20);
		contentPane.add(txtFuentesGarca);
		txtFuentesGarca.setColumns(10);
		
		textField = new JTextField();
		textField.setText("28");
		textField.setBounds(10, 164, 66, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtJfuentesggmailcom = new JTextField();
		txtJfuentesggmailcom.setText("jfuentesg17@gmail.com");
		txtJfuentesggmailcom.setBounds(10, 220, 180, 20);
		contentPane.add(txtJfuentesggmailcom);
		txtJfuentesggmailcom.setColumns(10);
	}
}
