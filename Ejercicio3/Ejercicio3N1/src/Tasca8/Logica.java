package Tasca8;

import java.util.*;

public class Logica {

	LinkedHashMap<String,Integer> lhm = new LinkedHashMap<String,Integer>();
	
		
	public void agregar() {
		
		lhm.put("Carlos", 25);
		lhm.put("Helena", 30);
		lhm.put("Tato", 55);
		lhm.put("Ana",5);
		
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>> (lhm.entrySet());
		
		
	
	Collections.sort(
            list,
            new Comparator<Map.Entry<String, Integer> >() {
            												// comparacion de entradas por valor
                public int compare(
                    Map.Entry<String, Integer> entrada1,
                    Map.Entry<String, Integer> entrada2)
                {
 
                    // Sustraer los calores
                    return entrada1.getValue()
                        - entrada2.getValue();
                }
            });
	for (Map.Entry<String, Integer> l : list) {
		 
       
        System.out.println("Key ->"
                           + " " + l.getKey()
                           + ": Value ->"
                           + l.getValue());
    }
}
}
