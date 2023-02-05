package ejercicio6;

public class Mostrar {
	public Mostrar() {
		
	}
	public void mostrarMenu() {
		System.out.println("----------------MENU----------------");
		System.out.println("1. Añadir Cuenta");
		System.out.println("2. Ingresar o retirar dinero");
		System.out.println("3. Mostrar cuentas");
		System.out.println("4. Dinero ganado con CE");
		System.out.println("5. Dinero perdido con CJ");
		System.out.println("0. Salir");
		System.out.println("------------------------------------");
	}
	public void mostrarSubMenuDin() {
		System.out.println("-------------MENU-------------");
		System.out.println("1. Ingresar dinero");
		System.out.println("2. Retirar dinero");
		System.out.println("0. Volver al ménu");
		System.out.println("------------------------------");
	}
	public void mostrarSubMenuCue() {
		System.out.println("-------------MENU-------------");
		System.out.println("1. Cuenta Corriente");
		System.out.println("2. Cuenta Joven");
		System.out.println("3. Cuenta Empresa");
		System.out.println("0. Volver al ménu");
		System.out.println("------------------------------");
	}
}

