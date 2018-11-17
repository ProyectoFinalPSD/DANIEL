package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class JFrameRegistroClientes extends JFrame
{

	public static final String AGREGAR = "Agregar";
	public static final String ELIMINAR = "Eliminar";
	private JButton agregar, eliminar, borrar;/*declaramos el objeto Boton*/
	private JLabel labelTitulo, mensaje;
	private JTextField textCed, textNombre, textDireccion, textTelefono,textCorreo;
	private JLabel cedula, nombre, direccion, telefono, correo;
	private DefaultTableModel model;
	private JTable miTabla2 = new JTable();// creamos la instancia de la tabla


	public JFrameRegistroClientes()
	{

		setSize(480, 500);
		setTitle("CoDejaVu : Componentes JTable");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);



		cedula = new JLabel();
		cedula.setText("Cedula");
		cedula.setBounds(20, 80, 80, 25);
		add(cedula);

		nombre = new JLabel();
		nombre.setText("Nombre");
		nombre.setBounds(20, 120, 80, 25);
		add(nombre);

		telefono = new JLabel();
		telefono.setText("Telefono");
		telefono.setBounds(285, 160, 80, 25);
		add(telefono);

		direccion = new JLabel();
		direccion .setText("Direccion");
		direccion .setBounds(285, 120, 80, 25);
		add(direccion);

		correo = new JLabel();
		correo.setText("Correo");
		correo.setBounds(20, 160, 80, 25);
		add(correo);

		textCed = new JTextField();
		textCed.setBounds(80, 80, 80, 25);
		add(textCed);

		textNombre = new JTextField();
		textNombre.setBounds(80, 120, 190, 25);
		add(textNombre);

		textTelefono = new JTextField();
		textTelefono.setBounds(340, 160, 80, 25);
		add(textTelefono);

		textDireccion = new JTextField();
		textDireccion.setBounds(340, 120, 80, 25);
		add(textDireccion);

		textCorreo = new JTextField();
		textCorreo.setBounds(80, 160, 190, 25);
		add(textCorreo);



		/*Propiedades del boton, lo instanciamos, posicionamos y
		 * activamos los eventos*/
		agregar= new JButton();
		agregar.setText("Agregar");
		agregar.setBounds(50, 230, 80, 23);


		eliminar= new JButton();
		eliminar.setText("Eliminar");
		eliminar.setBounds(330, 230, 80, 23);


		borrar= new JButton();
		borrar.setText("Borrar Lista");
		borrar.setBounds(170, 230, 120, 23);


		/*Propiedades del Label, lo instanciamos, posicionamos y
		 * activamos los eventos*/
		labelTitulo= new JLabel();
		labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 20));
		labelTitulo.setText("Registro de Clientes");
		labelTitulo.setBounds(143, 10, 180, 43);

		mensaje= new JLabel();
		mensaje.setBounds(20, 250, 280, 23);

		model = new DefaultTableModel();// definimos el objeto tableModel
		miTabla2.setModel(model);
		model.addColumn("Nº Documento");
		model.addColumn("Nombre");
		model.addColumn("Direccion");
		model.addColumn("Correo");
		model.addColumn("Telefono");

		JScrollPane miBarra2 = new JScrollPane();
		miBarra2.setBounds(40, 300, 400, 130);
		miBarra2.setViewportView(miTabla2);


		/*Agregamos los componentes al Contenedor*/
		add(labelTitulo);
		add(agregar);
		add(eliminar);
		add(borrar);
		add(mensaje);
		add(miBarra2);
		//add(scrollLista);
		//contenedor.add(botonCam);


	}

	public void agregarNombre() {
		String cedula =textCed.getText();
		String nombre=textNombre.getText();
		String direccion =textDireccion.getText();
		String correo=textCorreo.getText();
		String telefono=textTelefono.getText();
		Object[] o = {cedula, nombre, direccion, correo, telefono};
		model.addRow(o);
		//listaNombres.setModel(modelo);
		limpiar();
	}

	public void eliminarNombre(int indice) {
		if (indice>=0) {
			model.removeRow(indice);	
			mensaje.setText("Se eliminó un elemento en la posición "+indice);
		}else{
			JOptionPane.showMessageDialog(null, "Debe seleccionar un indice"
					,"Error", JOptionPane.ERROR_MESSAGE);

			mensaje.setText("NO se seleccionó ningún elemento");
		}

	}

	private void borrarLista()
	{
		//model.clear();
	}
	public void limpiar()
	{
		textCed.setText("");
		textNombre.setText("");
		textDireccion.setText("");
		textTelefono.setText("");
		textCorreo.setText("");
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

	public JTextField getTextCed() {
		return textCed;
	}

	public void setTextCed(JTextField textCed) {
		this.textCed = textCed;
	}

	public JTextField getTextNombre() {
		return textNombre;
	}

	public void setTextNombre(JTextField textNombre) {
		this.textNombre = textNombre;
	}

	public JTextField getTextDireccion() {
		return textDireccion;
	}

	public void setTextDireccion(JTextField textDireccion) {
		this.textDireccion = textDireccion;
	}

	public JTextField getTextTelefono() {
		return textTelefono;
	}

	public void setTextTelefono(JTextField textTelefono) {
		this.textTelefono = textTelefono;
	}

	public JTextField getTextCorreo() {
		return textCorreo;
	}

	public void setTextCorreo(JTextField textCorreo) {
		this.textCorreo = textCorreo;
	}

	public JLabel getCedula() {
		return cedula;
	}

	public void setCedula(JLabel cedula) {
		this.cedula = cedula;
	}

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JLabel getDireccion() {
		return direccion;
	}

	public void setDireccion(JLabel direccion) {
		this.direccion = direccion;
	}

	public JLabel getTelefono() {
		return telefono;
	}

	public void setTelefono(JLabel telefono) {
		this.telefono = telefono;
	}

	public JLabel getCorreo() {
		return correo;
	}

	public void setCorreo(JLabel correo) {
		this.correo = correo;
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

}


