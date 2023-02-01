package ejercicio4;

public class Venta {
	//Fields
	private LineaDeVenta[] lista;
	//Constructor

	public Venta(LineaDeVenta[] lista) {
		super();
		this.lista = lista;
	}
	
	//Methods
	public double precioTotal() {
		double precioT = 0;
		for(int i = 0 ; i < lista.length; i++) {
			precioT += lista[i].precioTotal();
		}
		return precioT;
	}
}
