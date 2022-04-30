package Ex1n2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;

public class Main {

	public static final String archivo = "C:/Users/PC/eclipse-workspace/Tasca5/src/Ex2n1/configuracion.properties";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw = new FileWriter("C:/Users/PC/eclipse-workspace/Tasca5/src/Ex3n1/fichero.txt");
		File ruta = new File("C:\\Users\\PC\\Documents\\Java Back End");

		// Creo un file para recorrer los elementos dentro de la ruta especificada

		File[] listado = ruta.listFiles();

		Arrays.sort(listado);

		Properties propiedades = new Properties();

		for (int i = 0; i < listado.length; i++) {

			if (listado[i].isFile()) {

				fw.write(" F : " + listado[i].getName() + new Date(ruta.lastModified()));
				fw.flush();
			}

			else if (listado[i].isDirectory()) {
				fw.write(" D : " + listado[i].getName());
				fw.flush();
			}
		}
		
		try (OutputStream salida = new FileOutputStream(archivo))

		{
			propiedades.setProperty("directorio", "C:\Users\PC\Documents\Java Back End");
			propiedades.store(salida, null);
			
		} catch (Exception e) {
			
			// TODO: handle exception
		}

	}
}
