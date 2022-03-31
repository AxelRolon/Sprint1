package tasca4;

import java.util.Scanner;

public class Comprobar {

	static String nombre;
	
	static Scanner entrada = new Scanner(System.in);
	public Comprobar(String nombre) {
		
		this.nombre = nombre ;
		
	}
	public static void main(String[] args) {
		main objet = new main();
		
		try {
			comprobarNombre();
		}
		catch(Exception e) {
			System.out.println(" " + e );
		}
		
		
		
	}
	
	public static void comprobarNombre () throws comprobar {
		
		System.out.println("Introduce un nombre con mas de 3 letras");
		nombre=entrada.next();
		
	
		
		
		if(nombre.length()>3 ) {
	System.out.println("Comprobado correctamente ");

		}
		else if(nombre.length()<3) {
			System.out.println("");
			//llamada al constructor con parametro
			throw new comprobar("Error = debe introducir un nombre con mas de 3 caracteres");
		}
		
	}
	public static class comprobar extends Exception{
		public comprobar() {}
		
		public comprobar(String msj_error) {
			super(msj_error);
		}
	}

	}


