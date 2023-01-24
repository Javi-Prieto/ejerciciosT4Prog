package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		Ordenador ord = new Ordenador(1000, 500, 3.2, "Hp");
		Sobremesa sob = new Sobremesa(1500, 500, 3.4, "Msi", 15.2);
		Portatil por = new Portatil(1700, 250, 2.3, "Acer", 20.2);
		double gan;
		
		System.out.println("Indique la ganancia");
		gan = Leer.datoDouble();
		System.out.printf("El precio de un ordenador sobre mesa es %.2f€\n", sob.calcularPrecio(gan));
		System.out.printf("El precio de un portatil es %.2f€\n", por.calcularPrecio(gan));
	}

}
