package ejercicio5;

public class Oficina {
	//Fields
	private Empleado [] lista;
	//COnstructor
	public Oficina(Empleado[] lista) {
		super();
		this.lista = lista;
	}
	//Methods
	public int findByNEmp(int nEmp) {
		boolean encontrado = false;
		int i = 0;
		while(i < lista.length && !encontrado) {
			if(lista[i].getnEmpleado() == nEmp) {
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
	public double calcularSueldo(Empleado emp) {
		return emp.calcularSueldoF();
	}
	public double calcularSueldo(int nEmp) {
		if(findByNEmp(nEmp)> 0) {
			return lista[findByNEmp(nEmp)].calcularSueldoF();
		}else {
			return -1;
		}
	}
	public double gastoTotal() {
		double gasto = 0;
		for(int i = 0; i < lista.length; i++) {
			gasto += lista[i].calcularSueldoF();
		}
		return gasto;
	}
}
