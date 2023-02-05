package ejercicio6;

public class Oficina {
	//Fields
	private Cuenta[] lista;
	private double dineroGanado = 0, dineroPerdido = 0;
	//Constructor

	public Oficina(Cuenta[] lista) {
		super();
		this.lista = lista;
	}
	//Getter and setter
	
	public double getDineroGanado() {
		return dineroGanado;
	}

	public void setDineroGanado(double dineroGanado) {
		this.dineroGanado = dineroGanado;
	}
	
	
	public double getDineroPerdido() {
		return dineroPerdido;
	}

	public void setDineroPerdido(double dineroPerdido) {
		this.dineroPerdido = dineroPerdido;
	}

	//Methods
	public void mostrarCuentas() {
		for(int i = 0; i < lista.length; i++) {
			
			if(lista[i ] == null) {
				System.out.println((i + 1) + ". Cuenta libre");
			}else {
				System.out.println((i+1) + ". " + lista[i]);
			}
		}
	}
	public void ingresarDinero(double ingreso, String dni) {
		lista[findByDNI(dni)].ingresarDinero(ingreso);
		System.out.println("Dinero ingresado correctamente");
		if(lista[findByDNI(dni)] instanceof CuentaJoven) {
			dineroPerdido ++;
		}
	}
	public void retirarDinero(double retirada, String dni) {
		lista[findByDNI(dni)].retirarDinero(retirada);
		System.out.println("Dinero retirado correctamente");
		if(lista[findByDNI(dni)] instanceof CuentaEmpresa) {
			dineroGanado ++;
		}
	}
	public void mostrarSaldo(String dni) {
		System.out.printf("El saldo actual de su cuenta es: %.2f\n", lista[findByDNI(dni)].getSaldo());
	}
	public int findByDNI(String dni) {
		boolean encontrado = false;
		int i = 0;
		while (i < lista.length && !encontrado) {
			if(lista[i].getCl().getDni().equalsIgnoreCase(dni)) {
				encontrado = true;
			}else {
				i++;
			}
		}
		if(i > lista.length) {
			return -1;
		}else {
			return i;
		}
	}
	public void addCuenta(Cuenta cu, int posi) {
		
		if(posi > lista.length){
			System.out.println("No quedan cuentas disponibles");
		}else {
			lista[posi] = cu;
		}
	}
}
