package Ex1n1;

import java.util.ArrayList;
import java.util.List;

public class Punto1 {

	

	public static void main(String[] args) {
		//punto 1
		
		List<String> lista = new ArrayList<String>();
		lista.add("otto");
		lista.add("anastacia");
		lista.add("rocio");
		lista.add("axel");
		lista.add("miguel");
		lista.add("Antonio");
		
		System.out.println("Strings que incluyen la letra O : ");
		lista.stream().filter(z -> z.contains("o"))
		.forEach(System.out::println);
	}
	
	
}
