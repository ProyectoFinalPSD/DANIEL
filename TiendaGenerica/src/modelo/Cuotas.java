package modelo;

public class Cuotas {

	private double periodo, interes, inversion, tasaEfect, anualidad, cuota;
	
	public Cuotas()
	{
		double periodo = 0;
		double interes = 0;
		double inversion = 0;
		double tasaEfect = 0;
		double anualidad = 0;
		double cuota = 0;
	}

	public double getPeriodo() {
		return periodo;
	}

	public void setPeriodo(double periodo) {
		this.periodo = periodo;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getInversion() {
		return inversion;
	}

	public void setInversion(double inversion) {
		this.inversion = inversion;
	}

	public double getTasaEfect() {
		return tasaEfect;
	}

	public void setTasaEfect(double tasaEfect) {
		this.tasaEfect = tasaEfect;
	}

	public double getAnualidad() {
		return anualidad;
	}

	public void setAnualidad(double anualidad) {
		this.anualidad = anualidad;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	
	
}
