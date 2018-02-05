package juego;

import javax.swing.ImageIcon;

import ventanas.Principal1;
import ventanas.Ventana2;
public class Login {

	public static void main(String[] args) {
		
		
		// Ventana del juego //
		
		Ventana2 v2=new Ventana2();
		
		
		// Creamos ventana Principal1 //
		Principal1 v1=new Principal1(v2);
		v1.setVisible(true);
		
		
	}


}
