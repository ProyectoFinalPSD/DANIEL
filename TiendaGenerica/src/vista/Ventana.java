package vista;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class Ventana extends JFrame
{

	private static final long serialVersionUID = 1L;

	private PanelProveedor panel;
	private panelCliente panel_Cliente;
	
	
	public Ventana()
	{
		setSize(300,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 2));
		setResizable(true);
		setTitle("Tienda generica");
		panel = new PanelProveedor();
		panel_Cliente = new panelCliente();
		
		add(panel);
		add(panel_Cliente);
	}
	public PanelProveedor getPanel() {
		return panel;
	}

	public void setPanel(PanelProveedor panel) {
		this.panel = panel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
