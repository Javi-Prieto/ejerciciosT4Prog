package ejercicio6MasGuachi;

public class CuentaEmpresa extends Cuenta{
	//Fields
	private double precio = 1;
	//Constructor

	public CuentaEmpresa(double saldo) {
		super( false, saldo);
		// TODO Auto-generated constructor stub
	}
	//Getter and setter

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	//toString

	@Override
	public String toString() {
		return "CuentaEmpresa [precio=" + precio + ", toString()=" + super.toString() + "]";
	}
	//Methods
	@Override
	public void ingresarDinero(double ingreso) {
		super.setSaldo(super.getSaldo() + ingreso);
		
	}

	@Override
	public void retirarDinero(double retirada) {
		super.setSaldo(super.getSaldo() - retirada - precio);
		
	}
	
}
