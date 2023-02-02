package ejercicio3;

public class Furgoneta extends Vehiculo {
	//Fields
	private double cantMer = 500;
	//COnstructor
	public Furgoneta( double cantCil, double caball, String emi) {
		super( cantCil, caball, emi);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Furgoneta [cantMer=" + cantMer + ", toString()=" + super.toString() + "]";
	}
	public double calcularImp(int cas) {
		return super.cantEmi(cas) + cantMer;
	}
	
}
