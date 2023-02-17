package Ex1n1;

import java.util.ArrayList;

public class Punto4 {

	public static void main(String[] args) {
		
		ArrayList<String> meses = new ArrayList<>();

        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        meses.add("Mayo");
        meses.add("Junio");
        meses.add("Julio");
        meses.add("Agosto");
        meses.add("Septiembre");
        meses.add("Octubre");
        meses.add("Noviembre");
        meses.add("Diciembre");
		
		
		
		System.out.println("Lista con método reference:");
        meses.forEach(System.out::println);
	}
	
	
}
