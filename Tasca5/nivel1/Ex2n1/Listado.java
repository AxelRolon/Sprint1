package Ex2n1;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class Listado {

	public static void main(String[] args) {

		// TYpe file , indicar ruta

		File ruta = new File("C:\\Users\\PC\\Documents\\Java Back End");

		// Creo un file para recorrer los elementos dentro de la ruta especificada

		File[] listado = ruta.listFiles();

		Arrays.sort(listado);
		
		for(int i = 0 ; i<listado.length; i++) {
			
			if(listado[i].isFile()) {
				
				System.out.println(" F : " + listado[i].getName()+ new Date(ruta.lastModified()));
			}
			
			else if(listado[i].isDirectory()) {
				
				System.out.println(" D : " + listado[i].getName());
				
			}
			
			
		}

	}
}
