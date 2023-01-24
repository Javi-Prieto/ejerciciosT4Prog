package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		Documento doc;
		Tarjeta tar;
		Carta car;
		String name, address, city, number, email, date;
		int op;
		
		System.out.println("Diga el nombre de la empresa");
		name = Leer.dato();
		System.out.println("Diga la ciudad perteneciente");
		city = Leer.dato();
		System.out.println("Diga la dirección");
		address = Leer.dato();
		doc = new Documento(name, city, address);
		System.out.println("Diga el número de teléfono");
		number = Leer.dato();
		System.out.println("Diga el email");
		email = Leer.dato();
		tar = new Tarjeta(doc.getNombreEmp(), doc.getCiudad(), doc.getDireccion(), 
				number, email);
		System.out.println("Diga la fecha");
		date = Leer.dato();
		car = new Carta(doc.getNombreEmp(), doc.getCiudad(), doc.getDireccion(), 
				date);
		
		do {
			System.out.println("-------------MENU-------------");
			System.out.println("1. Mostrar documento general");
			System.out.println("2. Mostrar tarjeta de visita");
			System.out.println("3. Mostrar carta");
			System.out.println("0. Salir");
			System.out.println("------------------------------");
			System.out.println("¿Qué desea hacer?");
			op = Leer.datoInt();
			switch(op) {
				case 1:
					doc.imprimirDoc();
					break;
				case 2:
					tar.imprimirDoc();
					break;
				case 3:
					car.imprimirDoc();
					break;
				case 0:
					System.out.println("Gracias por usarme");
					break;
			}
		}while(op != 0);

	}

}
