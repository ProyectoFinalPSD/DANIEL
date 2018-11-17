package modelo;

import java.util.ArrayList;

public class ModCompra
{
	private ArrayList<Proveedor>proveedores;
	private ArrayList<Producto>productos;
	private Proveedor p;
	private Producto pro;
	private double valorIVA;
	private double valorTotalconIVA;
	

	public ModCompra()
	{
		proveedores = new ArrayList<Proveedor>();
	}

	public String buscarProveedor(String NIT)
	{
		String encontró = "";
		for (int i = 0; i < proveedores.size(); i++) 
		{
			if (proveedores.get(i).getNIT() == NIT)
			{
				 encontró = proveedores.get(i).getNombre();	
			}
		}
		return encontró;
	}
	
	public String buscarProducto(String codigo)
	{
		String encontró = "";
		for (int i = 0; i < productos.size(); i++) 
		{
			if (productos.get(i).getCodigo() == codigo)
			{
				 encontró = productos.get(i).getNombreProducto();	
			}
		}
		return encontró;
	}
	
	public void consolidarCompra(double IVA)
	{
		
	}

}