package Ex5n1;

import java.util.Scanner;

public class WeedClub {

	private String nombre, apellido, nacionalidad;
	private int edad, ficha;
	private int permitido=24;
	private static Scanner sc = new Scanner (System.in);
	private int cantidad ;
	
	
	public WeedClub() {
		this.nombre=nombre;
		this.apellido=apellido;
		this.nacionalidad=nacionalidad;
		this.edad=edad;
		this.ficha=ficha;
		this.permitido=permitido;
		this.cantidad=cantidad;
	}
	
	public WeedClub(String nom,String apel,String nac,int edad,int ficha) {
		this.nombre=nom;
		this.apellido=apellido;
		this.nacionalidad=nac;
		this.edad=edad;
		this.ficha=ficha;
		
		
	}

	public double getPermitido() {
		return permitido;
	}

	public void setPermitido(int permitido) {
		this.permitido = permitido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getFicha() {
		return ficha;
	}

	public void setFicha(int ficha) {
		this.ficha = ficha;
	}
	
	public int retirar() {
		System.out.println("Ingrese la cantidad a retirar");
		cantidad = sc.nextInt();
		
		if(cantidad <= 4) {
			permitido = permitido - cantidad;
			System.out.println("Le queda "+permitido+" , enjoy ;)");
		}else {
			System.out.println("No puedes retirar tanto en un dia, caralimon");
		}
		return permitido;
	}
	
	
}
