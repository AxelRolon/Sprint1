package Tasca7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;

public class Logica {

	HashMap<String, Integer> personas = new HashMap<String, Integer>();

	public void llenar() {

		personas.put("Axel", 25);
		personas.put("Norma", 40);
		personas.put("Daysi", 35);
		personas.put("Raul", 70);

		for (String t : personas.keySet()) {
			System.out.println("Lista de claves desordenadas : " + t);
		}

		System.out.println();
		

		TreeMap<String, Integer> personas1 = new TreeMap<String, Integer>(personas); // se pasa personas como parametro
																						// de constructor

		for (String s : personas1.keySet()) {

			System.out.println("Lista de claves ordenada : " + s);

		}
		System.out.println();

		System.out.println("Verificar si se mantiene el orden");

		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>(personas);
		LinkedHashMap<String, Integer> lhm1 = new LinkedHashMap<>(personas1);

		System.out.println(lhm + "\n" + lhm1);

		HashSet<String> hs = new HashSet<>();
		LinkedHashSet<String> lhs = new LinkedHashSet<>();

		for (Map.Entry<String, Integer> key : personas1.entrySet()) {

			hs.add(key.getKey());
			lhs.add(key.getKey());

		}
		System.out.println();
		System.out.println(hs + "\n" + lhs);
		System.out.println();
		System.out.println("Si se mantiene el orden");
	}

}
