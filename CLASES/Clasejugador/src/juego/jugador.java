package juego;
import java.sql.Connection;
@SuppressWarnings("unused")

public class jugador {
	
	//Atributos//
	private String nombre;
	private String apellidos;
	private String localidad;
	private int edad;
	private int puntos;
	private int id;
	
	//definir datos privados de jugadores;
	//constructor//
	public jugador() {
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

	//Cadena datos jugador//
	public String toString (){
	return this.nombre+" "+this.apellidos+" "+this.localidad+" "+this.edad+" "+this.puntos+" "+this.id+" ";
	}
}


