package Tasca6;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class InsertarMitad {

	private int x = 10;
	private int contador;
	LinkedList<Integer> lista = new LinkedList<Integer>();

	ListIterator<Integer> it = lista.listIterator();

	public void Insertar() {

		Scanner entrada = new Scanner(System.in);

		while(contador<10) {
		for (int i = 0; i < x; i++) {
			if((lista.size() % 2 != 0)  ) {
				
				System.out.println("*Ingresar un numero");
				
				it.previous();
				
				it.add(entrada.nextInt());
				
				System.out.println(lista);
			} 
			
			else if((lista.size() % 2 == 0)){
				
				System.out.println("/Ingresa un numero");
				
				it.add(entrada.nextInt());
				
				System.out.println(lista);
			}

		}
		
		System.out.println(lista);

	}
	}

}
