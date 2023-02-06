package ejercicio5;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		Empleado [] list;
		Oficina of;
		Empleado em, ven, ger;
		int tam = 3, nEmpleado, i = 0, op, cant;
		String nombre, apellidos;
		double sueldoB, incent;
		Mostrar mo = new Mostrar(); 
		
		list = new Empleado[tam];
		list[0] = new Vendedor("Juan", "Perez", 2000, 0, 10, 20);
		list[1] = new Gerente("Manolillo", "Gutierrez", 3000, 1);
		list[2] = new Gerente("Agapito", "Salmonete", 1500, 2);
		of = new Oficina(list);
		do {
			mo.mostrarMenu();
			op = Leer.datoInt();
			switch(op) {
				case 1:
					mo.mostrarSubMenu();
					System.out.println("Indique el tipo de empleado");
					op = Leer.datoInt();
					switch(op) {
						case 1:
							System.out.println("Diga el nombre");
							nombre = Leer.dato();
							System.out.println("Diga el apellido");
							apellidos = Leer.dato();
							System.out.println("Diga el sueldo");
							sueldoB = Leer.datoDouble();
							System.out.println("Diga el número de empleado");
							nEmpleado = Leer.datoInt();
							System.out.println("Diga la cantidad de ventas");
							cant = Leer.datoInt();
							System.out.println("Diga el incentivo recibido");
							incent = Leer.datoDouble();
							em = new Vendedor(nombre, apellidos, sueldoB, nEmpleado, cant, incent);
							System.out.printf("El sueldo final de dicho empleado es: %.2f\n", of.calcularSueldo(em));
							break;
						case 2:
							System.out.println("Diga el nombre");
							nombre = Leer.dato();
							System.out.println("Diga el apellido");
							apellidos = Leer.dato();
							System.out.println("Diga el sueldo");
							sueldoB = Leer.datoDouble();
							System.out.println("Diga el número de empleado");
							nEmpleado = Leer.datoInt();
							em = new Gerente(nombre, apellidos, sueldoB, nEmpleado);
							System.out.printf("El sueldo final de dicho empleado es: %.2f\n", of.calcularSueldo(em));
							break;
						case 0:
							System.out.println("Volviendo al menú");
							break;
						default:
							System.out.println("Número incorrecto");
					}
					break;
				case 2:
					mo.mostrarEmpleados(list);
					System.out.println("Diga el número del empleado a calcular");
					nEmpleado = Leer.datoInt();
					System.out.printf("El sueldo final de dicho empleado es: %.2f\n", of.calcularSueldo(nEmpleado));
					
					break;
				case 0:
					System.out.println("Gracias por usar el programa");
					break;
				default:
					System.out.println("Número inexistente");
					
			}
		}while (op != 0);
	}

}
