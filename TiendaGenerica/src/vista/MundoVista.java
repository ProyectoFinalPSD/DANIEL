package vista;


public class MundoVista {
	
	private JFrameVentanaPrincipal vp;
	private JFrameRegistroProveedores rpv;
	private JFrameFacturaVenta fv;
	private JFrameDatosTienda dt;
	private JFrameFormasPago fp;
	private JFrameCompraEfectivo ce;
	private JFrameRegistroClientes rcl;
	private JFrameRegistroProductos rpro;
	private JFrameCheque che;
	private JFrameCuotas ctas;
	
	public MundoVista()
	{
		ctas =  new JFrameCuotas();
		che =  new JFrameCheque();
		rpro =  new JFrameRegistroProductos();
		rcl =  new JFrameRegistroClientes();
		vp = new JFrameVentanaPrincipal();		
		rpv = new JFrameRegistroProveedores();
		dt = new JFrameDatosTienda();
		fv = new JFrameFacturaVenta();
		fp = new JFrameFormasPago();
		ce = new JFrameCompraEfectivo();
		
	}

	public JFrameVentanaPrincipal getVp() {
		return vp;
	}

	public JFrameRegistroProveedores getRpv() {
		return rpv;
	}

	public void setRpv(JFrameRegistroProveedores rp) {
		this.rpv = rp;
	}

	public JFrameFacturaVenta getFv() {
		return fv;
	}

	public void setFv(JFrameFacturaVenta fv) {
		this.fv = fv;
	}

	public JFrameDatosTienda getDt() {
		return dt;
	}

	public void setDt(JFrameDatosTienda dt) {
		this.dt = dt;
	}

	public JFrameFormasPago getFp() {
		return fp;
	}

	public void setFp(JFrameFormasPago fp) {
		this.fp = fp;
	}

	public JFrameCompraEfectivo getCe() {
		return ce;
	}

	public void setCe(JFrameCompraEfectivo ce) {
		this.ce = ce;
	}

	public JFrameRegistroClientes getRcl() {
		return rcl;
	}

	public void setRcl(JFrameRegistroClientes rcl) {
		this.rcl = rcl;
	}

	public JFrameRegistroProductos getRpro() {
		return rpro;
	}

	public void setRpro(JFrameRegistroProductos rpro) {
		this.rpro = rpro;
	}

	public void setVp(JFrameVentanaPrincipal vp) {
		this.vp = vp;
	}

	public JFrameCheque getChe() {
		return che;
	}

	public void setChe(JFrameCheque che) {
		this.che = che;
	}

	public JFrameCuotas getCtas() {
		return ctas;
	}

	public void setCtas(JFrameCuotas ctas) {
		this.ctas = ctas;
	}
	

}
