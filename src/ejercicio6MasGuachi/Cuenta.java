package ejercicio6MasGuachi;

public abstract class Cuenta {
	
	//Fields
	private boolean mantenimiento;
	private double saldo;
	//Constructor
	public Cuenta(boolean mantenimiento, double saldo) {
		super();
		this.mantenimiento = mantenimiento;
		this.saldo = saldo;
	}
	//Getter and setter
	public boolean isMantenimiento() {
		return mantenimiento;
	}
	public void setMantenimiento(boolean mantenimiento) {
		this.mantenimiento = mantenimiento;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//toString
	@Override
	public String toString() {
		return "Cuenta [mantenimiento=" + mantenimiento + ", saldo=" + saldo + "]";
	}
	//Methods
	public abstract void ingresarDinero(double ingreso);
	public abstract void retirarDinero(double retirada);
	
}
