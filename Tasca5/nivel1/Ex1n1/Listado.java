package Ex1n1;

import java.io.File;
import java.util.Arrays;

public class Listado {
	
	

	
	public static void main(String[] args) {
		
		
		//TYpe file , indicar ruta
		
		File ruta = new File("C:\\Users\\PC\\Documents\\Java Back End");
		
		//imprime la ruta especificada usando el metodo getAbsolutePath
		
		System.out.println(ruta.getAbsolutePath());
		
		//Creo un array para recorrer los elementos dentro de la ruta especificada
		
		String[] listado = ruta.list();
		Arrays.sort(listado);
		for (int i = 0 ; i <= listado.length; i++) {
			
			System.out.println(listado[i]);
			
		
			}
			
		}
		
		
	}
	
	
	

	

