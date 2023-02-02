package ejercicio3;

public class Coche extends Vehiculo {
	//Constructor
	public Coche( double cantCil, double caball, String emi) {
		super(cantCil, caball, emi);
		// TODO Auto-generated constructor stub
	}
	
	public double calcularImp(int cas) {
		return super.cantEmi(cas) + (getCaball()*0.25);
	}

	@Override
	public String toString() {
		return "Coche [toString()=" + super.toString() + "]";
	}
	
	
}
