package modelo;

import java.util.ArrayList;

public class ModuloFactura {
	
	private ArrayList<Factura>f;
	private int consecutivo;
	
	public ModuloFactura()
	{
		f = new ArrayList<Factura>();
		consecutivo = 0;
	}
	
	//M�todo que permite administrar el consecutivo factura
	public int darConsecutivo()
	{
		return consecutivo = f.size()+1;
	}
	
	

}
