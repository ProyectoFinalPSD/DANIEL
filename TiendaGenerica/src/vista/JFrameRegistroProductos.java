package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class JFrameRegistroProductos extends JFrame 
{

	public static final String AGREGAR = "Agregar";
	public static final String ELIMINAR = "Eliminar";
	public static final String CONTINUAR_COMPRA = "Continuar Compra";
	public static final String CANCELAR_COMPRA = "Cancelar Compra";
	private static final long serialVersionUID = 1L;
	private JButton agregar, eliminar, borrar,continuar,cancelar;
	private JLabel labelTitulo, mensaje;
	private JTextField textCodigo, textNombre, textNITP, textPrecioVenta,textPrecioCompra;
	private JLabel codigo, nombre, NITp, precioVenta, precioCompra;
	private DefaultTableModel model;
	private JTable miTabla2 = new JTable();
	
	
	
	public JFrameRegistroProductos()
	{
		
		setSize(480, 480);
		setTitle("Productos");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		
		codigo = new JLabel();
		codigo.setText("C�digo");
		codigo.setBounds(20, 80, 80, 25);
		add(codigo);

		nombre = new JLabel();
		nombre.setText("Nombre");
		nombre.setBounds(20, 120, 80, 25);
		add(nombre);
		
		NITp = new JLabel();
		NITp.setText("NITP");
		NITp.setBounds(290, 120, 80, 25);
		add(NITp);
		
		precioCompra = new JLabel();
		precioCompra.setText("Precio Compra");
		precioCompra.setBounds(5, 160, 90, 25);
		add(precioCompra);

		precioVenta = new JLabel();
		precioVenta.setText("Precio Venta");
		precioVenta.setBounds(280, 160, 80, 25);
		add(precioVenta);	

		textCodigo = new JTextField();
		textCodigo.setBounds(80, 80, 80, 25);
		add(textCodigo);

		textNombre = new JTextField();
		textNombre.setBounds(80, 120, 190, 25);
		add(textNombre);
		
		textNITP = new JTextField();
		textNITP.setBounds(340, 120, 80, 25);
		add(textNITP);
		
		textPrecioCompra = new JTextField();
		textPrecioCompra.setBounds(110, 160, 100, 25);
		add(textPrecioCompra);
		
		textPrecioVenta = new JTextField();
		textPrecioVenta.setBounds(360, 160, 100, 25);
		add(textPrecioVenta);		
		
		agregar= new JButton();
		agregar.setText("Agregar");
		agregar.setBounds(20, 210, 80, 23);
		agregar.setActionCommand(AGREGAR);
		
		eliminar= new JButton();
		eliminar.setText("Eliminar");
		eliminar.setBounds(260, 210, 80, 23);
		eliminar.setActionCommand(ELIMINAR);
		
		continuar= new JButton();
		continuar.setText("Continuar Compra");
		continuar.setBounds(260, 400, 150, 23);
		continuar.setActionCommand(CONTINUAR_COMPRA);
		
		cancelar= new JButton();
		cancelar.setText("Cancelar Compra");
		cancelar.setBounds(100, 400, 150, 23);
		cancelar.setActionCommand(CANCELAR_COMPRA);
		
		borrar= new JButton();
		borrar.setText("Borrar Lista");
		borrar.setBounds(120, 210, 120, 23);
		
		labelTitulo= new JLabel();
		labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 20));
		labelTitulo.setText("Registro de Productos");
		labelTitulo.setBounds(130, 20, 250, 43);
		
		mensaje= new JLabel();
		mensaje.setBounds(20, 240, 280, 23);
		
		model = new DefaultTableModel();// definimos el objeto tableModel
		miTabla2.setModel(model);
		model.addColumn("C�digo");
		model.addColumn("Nombre");
		model.addColumn("NITProveedor");
		model.addColumn("PrecioCompra");
		model.addColumn("PrecioVenta");

		JScrollPane miBarra2 = new JScrollPane();
		miBarra2.setBounds(20, 260, 400, 130);
		miBarra2.setViewportView(miTabla2);		
		
		add(labelTitulo);
		add(agregar);
		add(eliminar);
		add(borrar);
		add(mensaje);
		add(continuar);
		add(cancelar);
		add(miBarra2);
		//add(scrollLista);
		//contenedor.add(botonCam);
	
	}

	public void agregarProducto() 
	{	
		String cod = getTextCodigo().getText();
		String nom = getTextNombre().getText();
		String nit = getTextNITP().getText();
		String preCom = getTextPrecioCompra().getText();
		String preVen = getTextPrecioVenta().getText();
		Object[] o = {cod,nom, nit, preCom, preVen};
		getModel().addRow(o);
		limpiar();
		getMensaje().setText("Se agreg� un nuevo elemento");
	}
	
	public void eliminarProducto(int indice) {
		if (indice>=0) {
			model.removeRow(indice);	
			mensaje.setText("Se elimin� un elemento en la posici�n "+indice);
		}else{
			JOptionPane.showMessageDialog(null, "Debe seleccionar un indice"
					,"Error", JOptionPane.ERROR_MESSAGE);
			
				mensaje.setText("NO se seleccion� ning�n elemento");
		}
		
	}
	
	public void borrarLista() {
		//model.clear();
	}
	
	public void limpiar() {
		textCodigo.setText("");
		textNombre.setText("");
		textNITP.setText("");
		textPrecioVenta.setText("");
		textPrecioCompra.setText("");
	}

	public JButton getAgregar() {
		return agregar;
	}

	public void setAgregar(JButton agregar) {
		this.agregar = agregar;
	}

	public JButton getEliminar() {
		return eliminar;
	}

	public void setEliminar(JButton eliminar) {
		this.eliminar = eliminar;
	}

	public JButton getBorrar() {
		return borrar;
	}

	public void setBorrar(JButton borrar) {
		this.borrar = borrar;
	}

	public JLabel getLabelTitulo() {
		return labelTitulo;
	}

	public void setLabelTitulo(JLabel labelTitulo) {
		this.labelTitulo = labelTitulo;
	}

	public JLabel getMensaje() {
		return mensaje;
	}

	public void setMensaje(JLabel mensaje) {
		this.mensaje = mensaje;
	}

	public JTextField getTextCodigo() {
		return textCodigo;
	}

	public void setTextCodigo(JTextField textCodigo) {
		this.textCodigo = textCodigo;
	}

	public JTextField getTextNombre() {
		return textNombre;
	}

	public void setTextNombre(JTextField textNombre) {
		this.textNombre = textNombre;
	}

	public JTextField getTextNITP() {
		return textNITP;
	}

	public void setTextNITP(JTextField textNITP) {
		this.textNITP = textNITP;
	}

	public JTextField getTextPrecioVenta() {
		return textPrecioVenta;
	}

	public void setTextPrecioVenta(JTextField textPrecioVenta) {
		this.textPrecioVenta = textPrecioVenta;
	}

	public JTextField getTextPrecioCompra() {
		return textPrecioCompra;
	}

	public void setTextPrecioCompra(JTextField textPrecioCompra) {
		this.textPrecioCompra = textPrecioCompra;
	}

	public JLabel getCodigo() {
		return codigo;
	}

	public void setCodigo(JLabel codigo) {
		this.codigo = codigo;
	}

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JLabel getNITp() {
		return NITp;
	}

	public void setNITp(JLabel nITp) {
		NITp = nITp;
	}

	public JLabel getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(JLabel precioVenta) {
		this.precioVenta = precioVenta;
	}

	public JLabel getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(JLabel precioCompra) {
		this.precioCompra = precioCompra;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}

	public JTable getMiTabla2() {
		return miTabla2;
	}

	public void setMiTabla2(JTable miTabla2) {
		this.miTabla2 = miTabla2;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JButton getContinuar() {
		return continuar;
	}

	public void setContinuar(JButton continuar) {
		this.continuar = continuar;
	}

	public JButton getCancelar() {
		return cancelar;
	}

	public void setCancelar(JButton cancelar) {
		this.cancelar = cancelar;
	}

	
}