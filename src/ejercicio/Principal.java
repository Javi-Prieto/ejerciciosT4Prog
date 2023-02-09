package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntradaNormal [] list;
		Taquilla taq;
		EntradaNormal nor1, nor2, vip, vip2, grup1, grup2;
		int tam, op, seat, row;
		double desc, IVA, cantF;
		System.out.println("Diga la cantidad de entradas disponibles(Mínimo 6 y serán las únicas mostradas)");
		tam = Leer.datoInt();
		while(tam < 6) {
			System.out.println("La cantidad de entradas es mínimo 6");
			tam = Leer.datoInt();
		}
		list = new EntradaNormal[tam];
		nor1 = new EntradaNormal(1, 1, 1);
		nor2 = new EntradaNormal(2, 1, 2);
		vip = new EntradaVIP(1, 2, 2, "Juan");
		vip2 = new EntradaVIP(4,2, 1, "Marilo");
		grup1 = new EntradaGrupos(1, 3, 1, 15);
		grup2 = new EntradaGrupos(2, 3, 2, 7);
		list[0] = nor1;
		list[1] = nor2;
		list[2] = vip;
		list[3] = grup1;
		list[4] = grup2;
		list[5] = vip2;
		taq = new Taquilla(list);
		System.out.println("Diga el descuento para las entradas grupales con más de diez personas");
		desc = Leer.datoDouble();
		System.out.println("Diga la cantidad fija añadida para las entradas VIP");
		cantF = Leer.datoDouble();
		do {
			System.out.println("---------------------MENU---------------------");
			System.out.println("1. Calcular el precio de una entrada");
			System.out.println("2. Calcular el total recaudado");
			System.out.println("3. Calcular el total recaudado en la Zona 1");
			System.out.println("4. Imprimir los regalos de los VIP");
			System.out.println("5. Calcular el pago de IVA");
			System.out.println("0. Salir");
			System.out.println("----------------------------------------------");
			System.out.println("¿Qué desea hacer?");
			op = Leer.datoInt();
			switch(op) {
				case 1:
					System.out.println("Diga el asiento de la entrada");
					seat = Leer.datoInt();
					System.out.println("Diga la fila de la entrada");
					row = Leer.datoInt();
					taq.mostrarPrecio(seat, row, desc, cantF);
					break;
				case 2:
					taq.mostrarRecaudacionTotal(desc, cantF);
					break;
				case 3:
					taq.mostrarRecaudacionZ1(desc, cantF);
					break;
				case 4:
					taq.imprimirRegaloVIP();
					break;
				case 5:
					System.out.println("Indique el IVA en el país del espéctaculo");
					IVA = Leer.datoDouble();
					taq.mostrarPagoIVA(desc, IVA, cantF);
					break;
				case 0:
					System.out.println("Gracias por usarme");
					break;
				default:
					System.out.println("Error: Número Inexistente");
			}
		}while(op != 0);
	}

}
