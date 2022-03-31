package Tasca5;

import java.util.*;

public class Listt {
	
	List<Integer> lista = new ArrayList<Integer>();
	
	
	List<Integer> lista2 = new ArrayList<>();

	public Listt() {
	}

	public Listt(List<Integer> lista, List<Integer> lista2) {
		this.lista = lista;
		this.lista2 = lista2;

	}



	public void imprimir() {
		ListIterator<Integer> iterador = this.lista.listIterator();

		
		while (iterador.hasNext()) {
	
			System.out.println(iterador.next());

			// System.out.println(lista2);
	
		}
		
		ListIterator<Integer> iterador2 = lista.listIterator(lista.size());
		
		while(iterador2.hasPrevious()) {
			
			lista2.add(iterador2.previous());
			System.out.println(iterador2.previous());
		}
		
	}
}
		/*for (int i = lista.size()- 1; i >= 0; i--){
        id.add(lista.get(i));OTRA FORMA DE RESOLVER EL ENUNCIADO*/
    

	

