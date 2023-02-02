package ejercicio3;

public class Motocicleta extends Vehiculo {
	//COnstructor
	public Motocicleta(double cantCil, double caball, String emi) {
		super(cantCil, caball, emi);
		// TODO Auto-generated constructor stub
	}
	
	
	//Methods
	public double calcularImp(int cas) {
		return super.cantEmi(cas) + (getCantCil()*0.6);
	}


	@Override
	public String toString() {
		return "Motocicleta [toString()=" + super.toString() + "]";
	}
	
	
	
	
}
