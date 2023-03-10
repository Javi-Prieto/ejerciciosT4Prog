package ejercicio5;

public abstract class  Empleado {
	//Fields
	private String nombre, apellidos;
	private double sueldoB;
	private int nEmpleado;
	//COnstructor
	public Empleado(String nombre, String apellidos, double sueldoB, int nEmpleado) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sueldoB = sueldoB;
		this.nEmpleado = nEmpleado;
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
	public double getSueldoB() {
		return sueldoB;
	}
	public void setSueldoB(double sueldoB) {
		this.sueldoB = sueldoB;
	}
	public int getnEmpleado() {
		return nEmpleado;
	}
	public void setnEmpleado(int nEmpleado) {
		this.nEmpleado = nEmpleado;
	}
	//toString
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", sueldoB=" + sueldoB + ", nEmpleado="
				+ nEmpleado + "]";
	}
	//Methods
	public abstract double calcularSueldoF();
}
