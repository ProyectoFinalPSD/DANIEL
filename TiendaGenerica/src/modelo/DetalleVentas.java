package modelo;

public class DetalleVentas 
{
	private int codigoDetalleVenta;
	private int codigoProducto;
	private int cantidad;
	private double valorUnitario;
	private double valorTotal;

	public DetalleVentas()
	{
		this.codigoDetalleVenta = 0;
		this.codigoProducto = 0;
		this.cantidad = 0;
		this.valorUnitario = 0;
		this.valorTotal = 0;

	}

	public int getCodigoDetalleVenta() 
	{
		return codigoDetalleVenta;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setCodigoDetalleVenta(int codigoDetalleVenta) 
	{
		this.codigoDetalleVenta = codigoDetalleVenta;
	}
	public int getCodigoProducto() 
	{
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) 
	{
		this.codigoProducto = codigoProducto;
	}
	public int getCantidad() 
	{
		
		return cantidad;
	}
}