package ejercicio5;

public class Vendedor extends Empleado {
	//Fields
	private int cantidadV;
	private double incentivo;
	//COnstructor
	public Vendedor(String nombre, String apellidos, double sueldoB, int nEmpleado, int cantidadV, double incentivo) {
		super(nombre, apellidos, sueldoB, nEmpleado);
		this.cantidadV = cantidadV;
		this.incentivo = incentivo;
	}
	//Getter and setter
	
	public int getCantidadV() {
		return cantidadV;
	}

	public void setCantidadV(int cantidadV) {
		this.cantidadV = cantidadV;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	//Methods
	@Override
	public double calcularSueldoF() {
		// TODO Auto-generated method stub
		return super.getSueldoB() + (cantidadV * (100 * (1+incentivo)));
	}

	@Override
	public String toString() {
		return "Vendedor [cantidadV=" + cantidadV + ", incentivo=" + incentivo + ", toString()=" + super.toString()
				+ "]";
	}

	

	

}
