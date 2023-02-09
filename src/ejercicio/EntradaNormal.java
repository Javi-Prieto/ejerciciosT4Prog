package ejercicio;

public class EntradaNormal implements IDesglosable{
	//Fields
	private int nAsiento, nFila, zona;
	//COnstructor

	public EntradaNormal(int nAsiento, int nFila, int zona) {
		super();
		this.nAsiento = nAsiento;
		this.nFila = nFila;
		this.zona = zona;
	}
	//Getter and Setter

	public int getnAsiento() {
		return nAsiento;
	}

	public void setnAsiento(int nAsiento) {
		this.nAsiento = nAsiento;
	}

	public int getnFila() {
		return nFila;
	}

	public void setnFila(int nFila) {
		this.nFila = nFila;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}
	//toString

	@Override
	public String toString() {
		return "EntradaNormal [nAsiento=" + nAsiento + ", nFila=" + nFila + ", zona=" + zona + "]";
	}
	//Methods
	public double calcularIVA(double desc, double porcentajeIVA, double cantFija) {
		return porcentajeIVA * calcularPrecio(desc, cantFija)/100;
	}
	public double calcularPrecio(double desc, double cantFija) {
		switch(zona) {
			case 1:
				return 40.00;
			case 2:
				return 70.00;
			default:
				return 0;
		}
	}
	
}
