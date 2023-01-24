package ejercicio1;

public class Ordenador {
	//Fields
	private double precioB, capacidaDisc, frecPr;
	private String marca;
	
	//Constructor
	public Ordenador(double precioB, double capacidaDisc, double frecPr, String marca) {
		super();
		this.precioB = precioB;
		this.capacidaDisc = capacidaDisc;
		this.frecPr = frecPr;
		this.marca = marca;
	}
	//Getter and setter

	public double getPrecioB() {
		return precioB;
	}

	public void setPrecioB(double precioB) {
		this.precioB = precioB;
	}

	public double getCapacidaDisc() {
		return capacidaDisc;
	}

	public void setCapacidaDisc(double capacidaDisc) {
		this.capacidaDisc = capacidaDisc;
	}

	public double getFrecPr() {
		return frecPr;
	}

	public void setFrecPr(double frecPr) {
		this.frecPr = frecPr;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	//toString

	@Override
	public String toString() {
		return "Ordenador [precioB=" + precioB + ", capacidaDisc=" + capacidaDisc + ", frecPr=" + frecPr + ", marca="
				+ marca + "]";
	}
	//Methods
	public double calcularPrecio(double desc) {
		return precioB * (1 + desc/100);
	}
	
}
