package ejercicio2;

public class Documento {
	//Fields
	private String nombreEmp, ciudad, direccion;
	//Constructor

	public Documento(String nombreEmp, String ciudad, String direccion) {
		super();
		this.nombreEmp = nombreEmp;
		this.ciudad = ciudad;
		this.direccion = direccion;
	}
	//Getter and setter

	public String getNombreEmp() {
		return nombreEmp;
	}

	public void setNombreEmp(String nombreEmp) {
		this.nombreEmp = nombreEmp;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	//toString

	@Override
	public String toString() {
		return "Documento [nombreEmp=" + nombreEmp + ", ciudad=" + ciudad + ", direccion=" + direccion + "]";
	}
	//Method
	public void imprimirDoc() {
		System.out.println(nombreEmp);
		System.out.println(ciudad + ", " + direccion);
	}
}
