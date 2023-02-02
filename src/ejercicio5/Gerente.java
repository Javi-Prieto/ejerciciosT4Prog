package ejercicio5;

public class Gerente extends Empleado {
	@Override
	public String toString() {
		return "Gerente [toString()=" + super.toString() + "]";
	}
	//COnstructor
	public Gerente(String nombre, String apellidos, double sueldoB, int nEmpleado) {
		super(nombre, apellidos, sueldoB, nEmpleado);
		// TODO Auto-generated constructor stub
	}
	//Methods
	@Override
	public double calcularSueldoF() {
		return super.getSueldoB() * (1-0.15);
	}

}
