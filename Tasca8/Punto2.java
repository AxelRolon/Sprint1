package Ex1n1;

import java.util.ArrayList;
import java.util.List;

public class Punto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//punto2
		
		List<String> lista = new ArrayList<String>();
		lista.add("otto");
		lista.add("anastacia");
		lista.add("rocio");
		lista.add("axel");
		lista.add("miguel");
		lista.add("Antonio");
		
		System.out.println("Strings que incluyen la letra O y mas de 5 letras: ");
		lista.stream() .filter(x -> x.contains("0") || x.length() >= 5 ).forEach(System.out::println);
		
	}
	

}


