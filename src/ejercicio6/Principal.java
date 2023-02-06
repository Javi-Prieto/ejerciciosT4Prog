package ejercicio6;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		Cuenta [] lista;
		Cuenta cu;
		Cliente cl;
		Oficina of;
		Mostrar mo = new Mostrar();
		int tam, op, posi = 0;
		String nombre, apellidos, dni;
		double saldo, ingr, ret;
		System.out.println("Bienvenido");
		System.out.println("Diga la cantidad de cuentas de las que dispone el banco");
		tam = Leer.datoInt();
		lista = new Cuenta[tam];
		of = new Oficina(lista);
		do {
			mo.mostrarMenu();
			System.out.println("¿Qué desea hacer?");
			op = Leer.datoInt();
			switch(op) {
				case 1:
					mo.mostrarSubMenuCue();
					System.out.println("¿Qué desea hacer?");
					op = Leer.datoInt();
					switch(op) {
						case 1:
							System.out.println("Indique el nombre del cliente");
							nombre = Leer.dato();
							System.out.println("Indique los apellidos del cliente");
							apellidos = Leer.dato();
							System.out.println("Indique el dni del cliente");
							dni = Leer.dato();
							cl = new Cliente(nombre, apellidos, dni);
							System.out.println("Indique el saldo inicial de la cuenta");
							saldo = Leer.datoDouble();
							cu = new CuentaCorriente(cl, saldo);
							of.addCuenta(cu, posi);
							posi ++;
							break;
						case 2:
							System.out.println("Indique el nombre del cliente");
							nombre = Leer.dato();
							System.out.println("Indique los apellidos del cliente");
							apellidos = Leer.dato();
							System.out.println("Indique el dni del cliente");
							dni = Leer.dato();
							cl = new Cliente(nombre, apellidos, dni);
							System.out.println("Indique el saldo inicial de la cuenta");
							saldo = Leer.datoDouble();
							cu = new CuentaJoven(cl, saldo);
							of.addCuenta(cu, posi);
							posi ++;
							break;
						case 3:
							System.out.println("Indique el nombre del cliente");
							nombre = Leer.dato();
							System.out.println("Indique los apellidos del cliente");
							apellidos = Leer.dato();
							System.out.println("Indique el dni del cliente");
							dni = Leer.dato();
							cl = new Cliente(nombre, apellidos, dni);
							System.out.println("Indique el saldo inicial de la cuenta");
							saldo = Leer.datoDouble();
							cu = new CuentaEmpresa(cl, saldo);
							of.addCuenta(cu, posi);
							posi ++;
							break;
						case 0:
							System.out.println("Volviendo al menu");
							break;
					}
					break;
				case 2:
					mo.mostrarSubMenuDin();
					System.out.println("¿Qué desea hacer?");
					op = Leer.datoInt();
					switch(op) {
						case 1:
							System.out.println("Diga el dni perteneciente a la cuenta");
							dni = Leer.dato();
							System.out.println("Diga el dinero a ingresar");
							ingr = Leer.datoDouble();
							of.ingresarDinero(ingr, dni);
							of.mostrarSaldo(dni);
							break;
						case 2:
							System.out.println("Diga el dni perteneciente a la cuenta");
							dni = Leer.dato();
							System.out.println("Diga el dinero a retirar");
							ret = Leer.datoDouble();
							of.retirarDinero(ret, dni);
							of.mostrarSaldo(dni);
							break;
						case 0:
							System.out.println("Volviendo al menú");
							break;
					}
					break;
				case 3:
					of.mostrarCuentas();
					break;
				case 4:
					System.out.printf("El dinero que ha ganado es: %.2f\n", of.getDineroGanado());
					break;
				case 5:
					System.out.printf("El dinero que ha perdido es: %.2f\n", of.getDineroPerdido());
					break;
				case 0:
					System.out.println("Gracias por usar el programa");
					break;
				default:
					System.out.println("Error: Número incorrect");
			}
		}while(op != 0);

	}

}
