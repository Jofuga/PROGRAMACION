import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("unused")
public class bailando extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textoizq;
	private JTextField textoder;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bailando frame = new bailando();
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
	public bailando() {
		setTitle("Bailando");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textoizq = new JTextField();
		textoizq.setBounds(10, 95, 130, 28);
		contentPane.add(textoizq);
		textoizq.setColumns(10);
		
		textoder = new JTextField();
		textoder.setBounds(294, 95, 130, 28);
		contentPane.add(textoder);
		textoder.setColumns(10);
		// boton pasa texto izquierda a derecha
		JButton botonader = new JButton(">>>");
		botonader.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//si se aprieta pasa texto izquierda derecha
				textoder.setText (textoizq.getText());
				//deja blanco izq
				textoizq.setText ("");
			}
		});
		botonader.setBounds(162, 29, 89, 23);
		contentPane.add(botonader);
		//boton pasa texto derecha a izquierda
		JButton botonaizq = new JButton("<<<");
		botonaizq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//si se aprieta pasa text derecha a izquierda
				textoizq.setText(textoder.getText ());
				//deja en blanco der
				textoder.setText ("");
			}
		});
		botonaizq.setBounds(162, 160, 89, 23);
		contentPane.add(botonaizq);
	}
}
