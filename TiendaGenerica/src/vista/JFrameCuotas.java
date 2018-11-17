package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class JFrameCuotas extends JFrame
{

	private JLabel monto, tasaInteres, plazo;
	private JTextField Monto, tasa, Plazo;
	private JTable tablaAmortizacion;
	private DefaultTableModel model;
	private JButton confirmar, nuevo;
	public final static String CONFIRMAR = "confirmar";
	public final static String NUEVO = "nuevo";
	
	
	public JFrameCuotas()
	{
		setSize(500,380);
		setTitle("Registro de cuotas");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
	
		tablaAmortizacion = new JTable();
		
		monto = new JLabel();
		monto.setText("Monto a financiar");
		monto.setBounds(20, 80, 100, 25);
		add(monto);
		
		Monto = new JTextField();
		Monto.setBounds(150, 80, 100, 25);
		add(Monto);
		
		tasaInteres = new JLabel();
		tasaInteres.setText("Tasa de interés");
		tasaInteres.setBounds(20, 50, 100, 25);
		
		tasa = new JTextField();
		tasa.setBounds(150, 50, 100, 25);
		add(tasa);
		
		plazo = new JLabel();
		plazo.setText("Plazo");
		plazo.setBounds(20, 20, 80, 25);
		
		Plazo = new JTextField();
		Plazo.setBounds(150, 20, 100, 25);
		add(Plazo);
		
		confirmar = new JButton("Confirmar");
		confirmar.setActionCommand(CONFIRMAR);
		confirmar.setBounds(20, 290, 100, 20);
		add(confirmar);
		
		nuevo = new JButton("Nuevo crédito");
		nuevo.setActionCommand(NUEVO);
		nuevo.setBounds(160, 290, 180, 20);
		add(nuevo);
		
		
		model = new DefaultTableModel();// definimos el objeto tableModel
		tablaAmortizacion.setModel(model);
		model.addColumn("N° Cuota");
		model.addColumn("Saldo");
		model.addColumn("Valor cuota");
		model.addColumn("Intereses");
		model.addColumn("Capital");
		
		JScrollPane Barra = new JScrollPane();
		Barra.setBounds(20, 140, 400, 130);
		Barra.setViewportView(tablaAmortizacion);
		
		
		add(monto);
		add(tasaInteres);
		add(plazo);
		add(Barra);
		
	}
	
}
