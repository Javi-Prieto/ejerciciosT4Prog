package ejercicio4;

public class Mostrar {
	public Mostrar() {
		
	}
	//Methods
	public void mostrarMenu() {
		System.out.println("----------------MENU----------------");
		System.out.println("1. Imprmir ticket");
		System.out.println("2. Mostrar todos los productors");
		System.out.println("-----------------------------------");
	}
	public void mostrarProductos(LineaDeVenta [] lista) {
		for(int i = 0; i < lista.length; i++) {
			if(lista[i] == null) {
				System.out.println((i+1) + ". Sin datos");
			}else {
				System.out.println((i+1) + ". " + lista[i].getPr());
			}
		}
	}
	public void mostrarTicket(Venta ven, LineaDeVenta [] lista, String fecha) {
		System.out.println("---------------------------------------------------");
		System.out.println("Att Don Ramones Supermecado");
		System.out.println("Dia " + fecha);
		System.out.println("---------------------------------------------------");
		System.out.println("Cant \t Producto \t Precio \t Total");
		for(int i = 0; i< lista.length; i++) {
			if(lista[i] == null) {
				
			}else {
				System.out.println(lista[i].getCant() + " \t " + lista[i].getPr().getNombre() + " \t " + lista[i].precioTotal());
			}
		}
		System.out.println("---------------------------------------------------");
		System.out.printf("Precio total: %.2f \n", ven.precioTotal());
		System.out.println("Gracias por su visita");
		System.out.println("---------------------------------------------------");
		
	}
}
