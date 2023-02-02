package ejercicio3;

public abstract class Vehiculo {
	//Fields
	private double cantCil, caball;
	private String emi;
	
	//Constructor
	public Vehiculo(double cantCil, double caball, String emi) {
		super();
		this.cantCil = cantCil;
		this.caball = caball;
		this.emi = emi;
	}
	//Getter and setter
	
	
	public abstract double calcularImp(int cas);
	
	public double cantEmi(int cas) {
		switch(cas) {
			case 1:
				return 50;
				
			case 2:
				return 70;
				
			case 3:
				return 90;
				
			case 4:
				return 100;
			default:
				return 100;
		}
	}

	public double getCantCil() {
		return cantCil;
	}

	public void setCantCil(double cantCil) {
		this.cantCil = cantCil;
	}

	public double getCaball() {
		return caball;
	}


	public void setCaball(double caball) {
		this.caball = caball;
	}


	public String getEmi() {
		return emi;
	}


	public void setEmi(String emi) {
		this.emi = emi;
	}
	//toString


	@Override
	public String toString() {
		return "Vehiculo [cantCil=" + cantCil + ", caball=" + caball + ", emi=" + emi + "]";
	}
	
}
