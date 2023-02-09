package ejercicio6MasGuachi;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		Cliente [] listaCl;
		Cuenta [] listaCu;
		Cuenta cu;
		Cliente cl;
		Oficina of;
		Mostrar mo = new Mostrar();
		int tam, op, posiCl = 0, posiCu = 0, opCu;
		String nombre, apellidos, dni;
		double saldo, ingr, ret;
		System.out.println("Bienvenido");
		System.out.println("Diga la cantidad de clientes de las que dispone el banco");
		tam = Leer.datoInt();
		listaCl = new Cliente[tam];
		of = new Oficina(listaCl);
		do {
			mo.mostrarMenu();
			System.out.println("¿Qué desea hacer?");
			op = Leer.datoInt();
			switch(op) {
				case 1:
					System.out.println("Indique la cantidad de cuentas que va a tener el cliente");
					tam = Leer.datoInt();
					System.out.println("Indique el nombre del cliente");
					nombre = Leer.dato();
					System.out.println("Indique los apellidos del cliente");
					apellidos = Leer.dato();
					System.out.println("Indique el dni del cliente");
					dni = Leer.dato();
					listaCu = new Cuenta[tam];
					cl = new Cliente(nombre, apellidos, dni, listaCu);
					of.addCliente(cl, posiCl);
					posiCl ++;
					break;
				case 2:
					System.out.println("Indique el dni del cliente");
					dni = Leer.dato();
					mo.mostrarSubMenuCue();
					System.out.println("¿Qué desea hacer?");
					op = Leer.datoInt();
					switch(op) {
						case 1:
							
							System.out.println("Indique el saldo inicial de la cuenta");
							saldo = Leer.datoDouble();
							cu = new CuentaCorriente(saldo);
							of.addCuenta(dni ,cu, posiCu);
							posiCu ++;
							break;
						case 2:
							System.out.println("Indique el saldo inicial de la cuenta");
							saldo = Leer.datoDouble();
							cu = new CuentaJoven(saldo);
							of.addCuenta(dni ,cu, posiCu);
							posiCu ++;
							break;
						case 3:
							System.out.println("Indique el saldo inicial de la cuenta");
							saldo = Leer.datoDouble();
							cu = new CuentaEmpresa(saldo);
							of.addCuenta(dni ,cu, posiCu);
							posiCu ++;
							break;
						case 0:
							System.out.println("Volviendo al menu");
							break;
					}
					break;
				case 3:
					System.out.println("Diga el dni del cliente");
					dni = Leer.dato();
					of.mostrarCuentas(dni);
					System.out.println("Diga la cuenta a la que realizar la operacion");
					opCu = Leer.datoInt();
					mo.mostrarSubMenuDin();
					System.out.println("¿Qué desea hacer?");
					op = Leer.datoInt();
					switch(op) {
						case 1:
							System.out.println("Diga el dinero a ingresar");
							ingr = Leer.datoDouble();
							of.ingresarDinero(ingr, opCu, dni);
							of.mostrarSaldo(dni, posiCu);
							break;
						case 2:
							System.out.println("Diga el dinero a ingresar");
							ret = Leer.datoDouble();
							of.retirarDinero(ret, opCu, dni);
							of.mostrarSaldo(dni, posiCu);
							break;
						case 0:
							System.out.println("Volviendo al menú");
							break;
					}
					break;
				case 4:
					
					of.mostrarClientes();
					break;
				case 5:
					System.out.println("Diga el dni del cliente");
					dni = Leer.dato();
					of.mostrarCuentas(dni);
					break;
				case 6:
					System.out.printf("El dinero que ha ganado es: %.2f\n", of.getDineroGanado());
					break;
				case 7:
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
