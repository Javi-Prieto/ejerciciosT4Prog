package ejercicio1;

public class Sobremesa extends Ordenador{
	//Fields
	private double precioMont;
	
	//Constructor

	public Sobremesa(double precioB, double capacidaDisc, double frecPr, String marca, double precioMont) {
		super(precioB, capacidaDisc, frecPr, marca);
		this.precioMont = precioMont;
	}
	//Getter and Setter

	public double getPrecioMont() {
		return precioMont;
	}

	public void setPrecioMont(double precioMont) {
		this.precioMont = precioMont;
	}

	
	//toString
	@Override
	public String toString() {
		return "Sobremesa [precioMont=" + precioMont + ", toString()=" + super.toString() + "]";
	}
	//Methods
	public double calcularPrecio(double desc) {
		return super.calcularPrecio(desc) + precioMont;
	}
}
