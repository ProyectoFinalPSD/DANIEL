package vista;

import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CHEPanel extends JPanel
{  
	private static final long serialVersionUID = 1L;
	private Calendar calendario;
	private JLabel nomBanco,etiquetaCheque,numCheque, a�o, mes, dia, pagueseA, sumaDe,firma,
	signo,totalmasIVA,nomCliente,montoEscrito, fecha,espacioFirma,numCuenta,nomProveedor,espacioProveedor;

	public CHEPanel()
	{
		setLayout(null);
		
		calendario = Calendar.getInstance();
		
		fecha = new JLabel(String.valueOf(calendario.DAY_OF_MONTH+"     /11/     2018"));
		fecha.setBounds(550,55, 400,10);
		
		nomBanco =  new JLabel(" ");
		nomBanco.setBounds(5, 1, 150,50);

		etiquetaCheque =  new JLabel("Cheque No.");
		etiquetaCheque.setBounds(600, 1, 150, 50);

		numCheque =  new JLabel(" ");
		numCheque.setBounds(665, 1, 100, 50);

		a�o =  new JLabel("A�o");
		a�o.setBounds(610, 35, 40, 20); 
		
		mes =  new JLabel("Mes");
		mes.setBounds(575, 35, 40, 20);
		
		dia =  new JLabel("D�a");
		dia.setBounds(550, 35, 40, 20);
		
		signo =  new JLabel("$");
		signo.setBounds(5, 65, 20, 20);

		totalmasIVA =  new JLabel(" ");
		totalmasIVA.setBounds(20, 60, 80, 30);

		pagueseA =  new JLabel("PAGUESE A LA ORDEN DE");
		pagueseA.setBounds(5, 100, 150, 30);

		nomCliente =  new JLabel(" ");
		nomCliente.setBounds(5, 130, 250, 30);

		sumaDe =  new JLabel("LA SUMA DE");
		sumaDe.setBounds(5,170,100,20);

		montoEscrito =  new JLabel(" ");
		montoEscrito.setBounds(5, 185, 150, 50);
		
		firma =  new JLabel("FIRMA");
		firma.setBounds(550,235,50,20);
		
		espacioFirma =  new JLabel("_________");
		espacioFirma.setBounds(470,200,200, 50);
		
		//nomProveedor =  new JLabel("PROVEEDOR");
		//nomProveedor.setBounds(150,65,100,20);
		
		//espacioProveedor =  new JLabel(" ");
		//espacioProveedor.setBounds(250, 65, 100, 20);
		
		numCuenta =  new JLabel("2906122404182209");
		numCuenta.setBounds(190,250,220, 50);
		
		add(nomBanco);
		add(etiquetaCheque);
		add(numCheque);
		add(a�o);
		add(mes);
		add(dia);
		add(fecha);
		add(signo);
		add(totalmasIVA);
		add(pagueseA);
		add(nomCliente);
		add(sumaDe);
		add(montoEscrito);
		add(firma);
		add(espacioFirma);
		add(numCuenta);
		//add(nomProveedor);
		//add(espacioProveedor);
	}
}