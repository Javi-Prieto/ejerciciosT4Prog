package ejercicio4;

public class Alimentacion extends Producto {
	//Fields
	private int diaCaducidad;
	private boolean descontado;
	//Constructor

	public Alimentacion(double precioUnit, String nombre, String id, int caducidad, boolean des) {
		super(precioUnit, nombre, id);
		this.diaCaducidad = caducidad;
		this.descontado = des;
	}
	//Getter and setter

	public int getCaducidad() {
		return diaCaducidad;
	}

	public void setCaducidad(int caducidad) {
		this.diaCaducidad = caducidad;
	}
	//toString

	@Override
	public String toString() {
		return "Alimentacion [caducidad=" + diaCaducidad + ", toString()=" + super.toString() + "]";
	}
	//Methods
	public void comprobarCad(int diaFecha) {
		if((diaCaducidad - diaFecha) <= 2) {
			descontado = true;
		}else {
			descontado = false;
		}
	}
	public void mostrarAviso(int diaFecha) {
		if(descontado) {
			System.out.println("Al producto le quedan 2 días o menos para caducar");
		}else {
			System.out.println("El producto tiene un margen amplio de caducidad");
		}
	}
	public double calcularPVP() {
		double desc = 0.15;
		if(descontado) {
			return super.getPrecioUnit() *(1-desc);
		}else {
			return super.getPrecioUnit();
		}
	}
}
