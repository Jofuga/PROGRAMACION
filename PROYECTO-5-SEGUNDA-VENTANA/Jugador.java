package juego;
import java.sql.Connection;
@SuppressWarnings("unused")

public class Jugador {

	//Atributos//
	private String nombre;
	private String apellidos;
	private String localidad;
	private int edad;
	private int puntos;
	private int id;
	
	//definir datos privados de jugadores;
	//constructor//
	public Jugador() {

	}	
	// Getters y Setters//
	//nombre	
	public String getNombre ()  {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//Apellidos	
	public String getApellidos ()  {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	//localidad	
	public String getLocalidad ()  {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	//Edad	
	public int getEdad()  {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	// Puntos	
	public int getPuntos()  {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	//id	
	public int getId()  {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//Comprueba que edad es un numero
	public boolean isNumeric(String text) {
		try {
			Integer.parseInt(text);
			return true;
		} catch(NumberFormatException nfe){
			return false;
	}}
	
	public Boolean sonEspacios(String text)  
	{
	for(int i=0; i<text.length(); i++)
		if(text.charAt(i) != ' ')
			return false; 
			return true;
	}

	//Cadena datos jugador//
	public String toString (){
	return this.nombre+" "+this.apellidos+" de la localidad de "+this.localidad+". \n Tienes "+this.edad+" años. ";
	}
}