package ejercicio5;

public class Mostrar {
	public void mostrarMenu() {
		System.out.println("---------------------MENU---------------------");
		System.out.println("1. Calcular sueldo de un empleado externo");
		System.out.println("2. Calcular sueldo de un empleado interno");
		System.out.println("0. Salir");
		System.out.println("----------------------------------------------");
		
	}
	public void mostrarSubMenu() {
		System.out.println("---------------------MENU---------------------");
		System.out.println("1. Vendedor");
		System.out.println("2. Gerente");
		System.out.println("0. Salir");
		System.out.println("----------------------------------------------");
	}
	public void mostrarEmpleados(Empleado [] list) {
		for(int i = 0; i < list.length; i++) {
			if(list[i] == null) {
				System.out.println((i+1)+". Aún si conocer");
			}else {
				System.out.println((i+1)+". " + list[i]);
			}
		}
	}
}
