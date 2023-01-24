package ejercicio1;

public class Portatil extends Ordenador{
	//Fields
	private double precioSeg;
	
	//Constructor

	public Portatil(double precioB, double capacidaDisc, double frecPr, String marca, double precioSeg) {
		super(precioB, capacidaDisc, frecPr, marca);
		this.precioSeg = precioSeg;
	}
	//Getter and setter

	public double getPrecioSeg() {
		return precioSeg;
	}

	public void setPrecioSeg(double precioSeg) {
		this.precioSeg = precioSeg;
	}
	//To string

	@Override
	public String toString() {
		return "Portatil [precioSeg=" + precioSeg + ", toString()=" + super.toString() + "]";
	}
	//Methods
	public double calcularPrecio(double desc) {
		return super.calcularPrecio(desc) + precioSeg;
	}
}
