package juego;

import javax.swing.ImageIcon;

import ventanas.Principal1;
import ventanas.Ventanajuego;
public class Login {

	public static void main(String[] args) {
		
		// Ventana del juego //
		
		Ventanajuego v2=new Ventanajuego();
		
		// Creamos ventana Principal1 //
		Principal1 v1=new Principal1(v2);
		v1.setVisible(true);
		
		// Ventana del juego //
		
				v2.setVisible(true);
		
	}


}
