package ejercicio6MasGuachi;

public class Oficina {
	//Fields
	private Cliente[] lista;
	private double dineroGanado = 0, dineroPerdido = 0;
	

	//Constructor

	public Oficina(Cliente[] lista) {
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
	public void mostrarCuentas(String dni) {
		for(int i = 0; i < lista[findByDNI(dni)].getLista().length; i++) {
			if(lista[findByDNI(dni)].getLista()[i] == null) {
				System.out.println((i+1)+". Aún sin rellenar");
			}else {
				System.out.println((i+1)+". " + lista[findByDNI(dni)].getLista()[i]);
			}
			
		}
	}
	public void mostrarClientes() {
		for(int i = 0; i < lista.length; i++) {
					if(lista[i] == null) {
						System.out.println((i + 1) + ". No hay cliente");
					}else {
						System.out.println((i+1) + ". " + lista[i]);
					}
				}
	}
	public void ingresarDinero(double ingreso, int posi, String dni) {
		if(lista[findByDNI(dni)].getLista()[posi-1] instanceof CuentaJoven) {
			lista[findByDNI(dni)].getLista()[posi-1].setSaldo(lista[findByDNI(dni)].getLista()[posi-1].getSaldo() + ingreso);
			dineroPerdido ++;
		}else {
			lista[findByDNI(dni)].getLista()[posi-1].setSaldo(lista[findByDNI(dni)].getLista()[posi-1].getSaldo() + ingreso);
		}
	}
	public void retirarDinero(double retirada, int posi, String dni) {
		if(lista[findByDNI(dni)].getLista()[posi-1] instanceof CuentaEmpresa) {
			lista[findByDNI(dni)].getLista()[posi-1].setSaldo(lista[findByDNI(dni)].getLista()[posi-1].getSaldo() - retirada);
			dineroGanado ++;
		}else {
			lista[findByDNI(dni)].getLista()[posi-1].setSaldo(lista[findByDNI(dni)].getLista()[posi-1].getSaldo() - retirada);
		}
	}
	
	public int findByDNI(String dni) {
		boolean encontrado = false;
		int i = 0;
		while (i < lista.length && !encontrado) {
			if(lista[i].getDni().equalsIgnoreCase(dni)) {
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
	public void addCliente(Cliente cl, int posi) {
		
		if(posi > lista.length){
			System.out.println("No quedan clientes disponibles");
		}else {
			lista[posi] = cl;
		}
	}
	public void addCuenta(String dni, Cuenta cu, int posi) {
		if(posi > lista.length){
			System.out.println("No quedan clientes disponibles");
		}else {
			lista[findByDNI(dni)].getLista()[posi] = cu;
		}
	}
	public void mostrarSaldo(String dni, int posi) {
		System.out.println("El saldo es: " + lista[findByDNI(dni)].getLista()[posi-1].getSaldo());
	}
}
