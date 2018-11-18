package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Properties;

public class ModDetalleVentas {


	private String ruta = "/.data";
	private String archivoDetalleVenta;
	private ModProducto producto;
	private DetalleVentas[] dv;
	
	public void archivoDetalleVenta()
	{
		File in = new File(ruta+"/DetallesVenta.txt");
		File out = new File(ruta+"/DetallesVenta.txt");
		int i =0;
		try {
			in.createNewFile();
			out.createNewFile();
			FileReader fr = new FileReader(in);
			FileWriter fw = new FileWriter(out, true);
			BufferedReader br = new BufferedReader(fr);
			PrintWriter pw = new PrintWriter(fw);
			String linea = br.readLine();

			while(linea == null)
			{
				for (i = 0; i < 1; i++) {
					dv[i] = new DetalleVentas();

					this.dv[i].getCodigoDetalleVenta();
					this.dv[i].getCodigoProducto();;
					this.dv[i].getCantidad();
					this.dv[i].getValorUnitario();
					this.dv[i].getValorTotal();
					linea = br.readLine();
					i++;
				}
			}
			linea = br.readLine();
			fr.close();
			fw.close();
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}
