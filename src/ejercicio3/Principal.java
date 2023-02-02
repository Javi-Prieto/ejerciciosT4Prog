package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		double cil, caballos;
		int op;
		String []emis = {"cero", "ECO", "Tipo B", "Tipo C"};
		Coche coc;
		Motocicleta mot;
		Furgoneta fur;
		
		System.out.println("Indique la cilindrada del coche");
		cil = Leer.datoDouble();
		System.out.println("Indique los caballos del coche ");
		caballos = Leer.datoDouble();
		menuEmisiones();
		System.out.println("Pulse el número correspondiente a la emisión del coche");
		op = Leer.datoInt();
		coc = new Coche(cil, caballos, emis[op -1]);
		System.out.println(coc);
		System.out.printf("La cantidad de impuestos que paga por su coche es %.2f\n\n" , 
				coc.calcularImp(op));
		
		System.out.println("Indique la cilindrada de la motocicleta");
		cil = Leer.datoDouble();
		System.out.println("Indique los caballos de la motocicleta");
		caballos = Leer.datoDouble();
		menuEmisiones();
		System.out.println("Pulse el número correspondiente a la emisión de la motocicleta");
		op = Leer.datoInt();
		mot = new Motocicleta(cil, caballos, emis[op -1]);
		System.out.println(mot);
		System.out.printf("La cantidad de impuestos que paga por su motocicleta es %.2f\n\n" , 
				mot.calcularImp(op));
		System.out.println("Indique la cilindrada de la furgoneta");
		cil = Leer.datoDouble();
		System.out.println("Indique los caballos de la furgoneta");
		caballos = Leer.datoDouble();
		menuEmisiones();
		System.out.println("Pulse el número correspondiente a la emisión de la furgoneta");
		op = Leer.datoInt();
		fur = new Furgoneta(cil, caballos, emis[op -1]);
		System.out.println(fur);
		System.out.printf("La cantidad de impuestos que paga por su coche es %.2f\n\n" , 
				fur.calcularImp(op));
	}
	public static void menuEmisiones() {
		
		System.out.println("1. cero");
		System.out.println("2. ECO");
		System.out.println("3. Tipo B");
		System.out.println("4. Tipo C");
	}

}
