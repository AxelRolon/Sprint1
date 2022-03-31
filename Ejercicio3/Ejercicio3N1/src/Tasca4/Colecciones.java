package Tasca4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

public class Colecciones {
	
	
	public static void main(String[] args) {
	
		ArrayList coleccion1 = new ArrayList();
		
		coleccion1.add("Hola1");
		coleccion1.add("Hola2");
		coleccion1.add("Hola3");
		coleccion1.add("Hola4");
		
		 Set coleccion2 = new HashSet(); 
		 
		 coleccion2.add("Chau");
		 coleccion2.add("Chau2");
		 coleccion2.add("Chau3");
		 coleccion2.add("Chau4");
		 
		
		LinkedList<String> coleccion3 = new LinkedList<>();
		coleccion3.add("axel");
		coleccion3.add("carol");
		coleccion3.add("belen");
		
		TreeSet<String> coleccion4 = new TreeSet<>();
		coleccion4.add("Soy axel");
		coleccion4.add("raton");
		
		
		it(coleccion1);
		it(coleccion2);
		it(coleccion3);
		it(coleccion4);
		
	}
	
	public static void it (Collection c) {
		
		Iterator it1 = c.iterator();
		
		while(it1.hasNext()) {
			
			String imp = it1.next().toString();
			
			System.out.println(imp);
			
		}System.out.println("_______________________________________________________________________________________________________________________________________________");
		
		
	}
	
	

}
