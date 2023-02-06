package ejercicio6;

public class CuentaCorriente extends Cuenta {
	//Fields
	private int cantPuntos = 0;
	//Constructor

	public CuentaCorriente(Cliente cl, double saldo) {
		super(cl, true, saldo);
	}
	//Getter and setter

	public int getCantPuntos() {
		return cantPuntos;
	}

	public void setCantPuntos(int cantPuntos) {
		this.cantPuntos = cantPuntos;
	}
	//toString

	@Override
	public String toString() {
		return "CuentaCorriente [cantPuntos=" + cantPuntos + ", toString()=" + super.toString() + "]";
	}
	//Methods
	@Override
	public void ingresarDinero(double ingreso) {
		cantPuntos ++;
		super.setSaldo(super.getSaldo()+ ingreso);
		
	}

	@Override
	public void retirarDinero(double retirada) {
		if(super.getSaldo() > retirada) {
			cantPuntos ++;
			super.setSaldo(super.getSaldo() - retirada);
		}
	}
	
}
