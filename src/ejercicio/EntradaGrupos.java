package ejercicio;

public class EntradaGrupos extends EntradaNormal {
	//Fields
	private int nPersonas;
	//COnstructor

	public EntradaGrupos(int nAsiento, int nFila, int zona, int nPersonas) {
		super(nAsiento, nFila, zona);
		this.nPersonas = nPersonas;
	}
	//Getter and setter

	public int getnPersonas() {
		return nPersonas;
	}

	public void setnPersonas(int nPersonas) {
		this.nPersonas = nPersonas;
	}
	//toString

	@Override
	public String toString() {
		return "EntradaGrupos [nPersonas=" + nPersonas + ", toString()=" + super.toString() + "]";
	}
	//Methods
	public double calcularPrecio(double desc, double cantFija) {
		if(nPersonas > 10) {
			return (super.calcularPrecio(desc, cantFija) * (1-desc/100))*nPersonas;
		}else {
			return super.calcularPrecio(desc, cantFija) * nPersonas;
		}
	}
}
