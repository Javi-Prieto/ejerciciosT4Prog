package ejercicio6MasGuachi;

import java.util.Arrays;

public class Cliente {
	//Fields
	private String nombre, apellidos, dni;
	private Cuenta[] lista;
	//Constructor
	public Cliente(String nombre, String apellidos, String dni, Cuenta[] lista) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.lista = lista;
	}
	//Getter and setter
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Cuenta[] getLista() {
		return lista;
	}
	public void setLista(Cuenta[] lista) {
		this.lista = lista;
	}
	//toString
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", lista="
				+ Arrays.toString(lista) + "]";
	}
	
	
	
	
	
}
