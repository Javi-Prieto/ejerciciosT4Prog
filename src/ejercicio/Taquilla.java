package ejercicio;

public class Taquilla {
	//Fields
	private EntradaNormal [] lista;
	//Constructor

	public Taquilla(EntradaNormal[] lista) {
		super();
		this.lista = lista;
	}
	//Methods
	public int findBySeatRow(int seat, int row) {
		int i = 0;
		boolean encontrado = false;
		while(i < lista.length && !encontrado && lista[i] != null) {
				if(seat == lista[i].getnAsiento() && row == lista[i].getnFila()) {
					encontrado = true;
				}else {
					i++;
				}
			
		}
		if(encontrado) {
			return i;
		}else {
			return -1;
		}
	}
	public double calcularPrecio(int seat, int row, double desc, double cantF) {
		if(findBySeatRow(seat,row) >= 0) {
			return lista[findBySeatRow(seat,row)].calcularPrecio(desc, cantF);
		}else {
			return 0;
		}
	}
	public void mostrarPrecio(int seat, int row, double desc, double cantF) {
		if(calcularPrecio(seat, row, desc, cantF) == 0) {
			System.out.println("Entrada inexistente");
		}else {
			System.out.printf("El precio de la entrada es: %.2f\n", calcularPrecio(seat, row, desc, cantF));
		}
	}
	public double calcularRecaudacionTotal(double desc, double cantF) {
		double precioT = 0;
		for(int i = 0; i < lista.length; i++) {
			if(lista[i] == null) {
				
			}else {
				precioT += lista[i].calcularPrecio(desc, cantF);
			}
		}
		return precioT;
	}
	public void mostrarRecaudacionTotal(double desc, double cantF) {
		System.out.printf("El precio total recaudado: %.2f\n", calcularRecaudacionTotal(desc, cantF));
	}
	public double calcularRecaudacionZ1(double desc, double cantF) {
		double precioT= 0;
		for(int  i = 0; i < lista.length; i++) {
			if(lista[i] == null) {
				
			}else {
				if(lista[i].getZona() == 1) {
					precioT += lista[i].calcularPrecio(desc, cantF);
				}
			}
		}
		return precioT;
	}
	public void mostrarRecaudacionZ1(double desc, double cantF) {
		System.out.printf("El dinero total recaudado es: %.2f\n", calcularRecaudacionZ1(desc,cantF));
	}
	public void imprimirRegaloVIP() {
		for(int i = 0; i < lista.length; i++) {
			if(lista[i] == null) {
				
			}else {
				if(lista[i] instanceof EntradaVIP) {
					EntradaVIP vip= (EntradaVIP) lista[i];
					System.out.println((i+1) + ". " + vip);
					vip.imprimirRegalo();
					System.out.println();
				}
			}
		}
	}
	public void mostrarPagoIVA(double desc, double porcentajeIVA, double cantFija) {
		for(int i = 0; i<lista.length; i++) {
			if(lista[i] == null);
			else {
				System.out.printf((i+1) + ". %.2f\n", lista[i].calcularIVA(desc, porcentajeIVA, cantFija));
			}
		}
	}
}
