package modelo;

public class ModCuota {

	private Cuotas c;
	
	public ModCuota()
	{
		c = new Cuotas();
	}
	
	public void calcularTasaEfectiva()
	{
		double resultado = Math.pow(1.0+(c.getInteres()), (1.0/12.0));
		 c.setTasaEfect(resultado-1.0); 
	}
	public void calcularAnualidad()
	{	
		double tasaE = c.getTasaEfect();
		double parte1 = 1 + c.getTasaEfect();
		double parte2 = Math.pow(parte1, - c.getPeriodo());
		double parte3 = 1 - parte2;
		c.setAnualidad((double)(parte3 / c.getTasaEfect()));
	}
	public void calcularCuota()
	{
		c.setCuota(c.getInversion()/ c.getAnualidad());
	}
}
