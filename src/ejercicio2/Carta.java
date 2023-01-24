package ejercicio2;

public class Carta extends Documento{
	//Fields
	private String fecha;
	//COnstructor

	public Carta(String nombreEmp, String ciudad, String direccion, String fecha) {
		super(nombreEmp, ciudad, direccion);
		this.fecha = fecha;
	}
	//Getter and setter

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	//toString

	@Override
	public String toString() {
		return "Carta [fecha=" + fecha + ", toString()=" + super.toString() + "]";
	}
	//Method
	public void imprimirDoc() {
		super.imprimirDoc();
		System.out.println("\t\t " + fecha);
	}
}
