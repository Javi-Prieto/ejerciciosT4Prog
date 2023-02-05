package ejercicio6;

public class CuentaJoven extends Cuenta{
	//Fields
	private double regalo = 1;
	//Constructor

	public CuentaJoven(Cliente cl, double saldo) {
		super(cl, false, saldo);
	}
	//Getter and setter

	public double getRegalo() {
		return regalo;
	}

	public void setRegalo(double regalo) {
		this.regalo = regalo;
	}
	//toString

	@Override
	public String toString() {
		return "CuentaJoven [regalo=" + regalo + ", toString()=" + super.toString() + "]";
	}
	//Methods
	@Override
	public void ingresarDinero(double ingreso) {
		super.setSaldo(super.getSaldo() + ingreso + regalo);
	}

	@Override
	public void retirarDinero(double retirada) {
		super.setSaldo(super.getSaldo() - retirada);
		
	}
	
}
