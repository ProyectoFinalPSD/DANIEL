package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class panelCliente extends JPanel
{

	private   static   final   long serialVersionUID =   1L ;
	private JLabel cedula, nombre, direccion, telefono, correoElectronico;
	private JTextField ce,nom,dir,tel,cE,resul;
	private JButton agregarCliente;
	private static final String AGREGAR_CLIENTE =  "AGREGAR CLIENTE";

	public panelCliente()
	{
		setLayout( new GridLayout(6,2));
		
		TitledBorder titulo = BorderFactory.createTitledBorder("Desea ser nuestro cliente?" + "  Registrese aquí!");
		titulo.setTitleColor(Color.BLACK);
		setBorder(titulo);
		
		cedula =  new JLabel();
		cedula.setText("Cedula");
		
		ce = new  JTextField ();
		ce.setBackground ( Color.WHITE );
		ce.setForeground ( Color.BLACK );
		
		nombre =  new JLabel();
		nombre.setText("Nombre");
		
		nom = new  JTextField ();
		nom.setBackground ( Color.WHITE );
		nom.setForeground ( Color.BLACK  );
		
		direccion =  new JLabel();
		direccion.setText("Dirección");
		
		dir = new  JTextField ();
		dir.setBackground ( Color.WHITE );
		dir.setForeground ( Color.BLACK  );
		
		telefono =  new JLabel();
		telefono.setText("Telefono");
		
		tel = new  JTextField ();
		tel.setBackground ( Color.WHITE );
		tel.setForeground ( Color.BLACK  );
		
		correoElectronico =  new JLabel();
		correoElectronico.setText("Correo Electronico");
		
		cE = new  JTextField ();
		cE.setBackground ( Color.WHITE );
		cE.setForeground ( Color.BLACK  );
		
		agregarCliente = new   JButton ( "REGISTRARSE" );
		agregarCliente. setActionCommand (AGREGAR_CLIENTE );
		
		add(cedula);
		add(ce); 
		
		add(nombre);		
		add(nom);
		
		add(direccion);		
		add(dir);
		
		add(telefono);		
		add(tel);
		
		add(correoElectronico);		
		add(cE);
		
		add(agregarCliente);
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

	public JLabel getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(JLabel correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public JTextField getCe() {
		return ce;
	}

	public void setCe(JTextField ce) {
		this.ce = ce;
	}

	public JTextField getNom() {
		return nom;
	}

	public void setNom(JTextField nom) {
		this.nom = nom;
	}

	public JTextField getDir() {
		return dir;
	}

	public void setDir(JTextField dir) {
		this.dir = dir;
	}

	public JTextField getTel() {
		return tel;
	}

	public void setTel(JTextField tel) {
		this.tel = tel;
	}

	public JTextField getcE() {
		return cE;
	}

	public void setcE(JTextField cE) {
		this.cE = cE;
	}

	public JTextField getResul() {
		return resul;
	}

	public void setResul(JTextField resul) {
		this.resul = resul;
	}

	public JButton getAgregarCliente() {
		return agregarCliente;
	}

	public void setAgregarCliente(JButton agregarCliente) {
		this.agregarCliente = agregarCliente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
