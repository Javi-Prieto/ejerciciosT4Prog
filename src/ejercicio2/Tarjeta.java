package ejercicio2;

public class Tarjeta extends Documento{
	//Fields
	private String telefono, email;
	//Constructor

	public Tarjeta(String nombreEmp, String ciudad, String direccion, String telefono, String email) {
		super(nombreEmp, ciudad, direccion);
		this.telefono = telefono;
		this.email = email;
	}
	
	//Getter and setter
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	//toString

	@Override
	public String toString() {
		return "Tarjeta [telefono=" + telefono + ", email=" + email + ", toString()=" + super.toString() + "]";
	}
	//Method
	public void imprimirDoc() {
		super.imprimirDoc();
		System.out.println("--------Datos de contacto--------");
		System.out.println(telefono);
		System.out.println(email);
	}
}
