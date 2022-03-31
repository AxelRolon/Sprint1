package Tasca2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Month mes1 = new Month("Enero");
		Month mes2 = new Month("Febrero");
		Month mes3 = new Month("Marzo");
		Month mes4 = new Month("Abril");
		Month mes5 = new Month("Mayo"
		Month mes6 = new Month("Junio");
		Month mes7 = new Month("Julio");
		
		Month mes9 = new Month("Septiembre");
		Month mes10= new Month("Octubre");
		Month mes11 = new Month("Noviembre");
		Month mes12 = new Month("Diciembre");
		Month.add(new Month( (index:8,"Agosto"))*/
		
		Set <Month> meses = new HashSet<>();
		
		meses.add(new Month("Enero"));
		meses.add(new Month("Febrero"));
		meses.add( new Month("Marzo"));
		meses.add( new Month("Abril"));
		meses.add(new Month("Mayo"));
		meses.add(new Month("Junio"));
		meses.add(new Month("Julio"));
		meses.add(new Month("Septiembre"));
		meses.add(new Month("Noviembre"));
		meses.add(new Month("Diciembre"));
		
		
		
		for (Month month : meses) {
			System.out.println(month.getName());
		}
		System.out.println("------------------------------------------------------------------------");
		meses.add(new Month("Diciembre"));
		for (Month month : meses) {
			System.out.println(month.getName());
		}
	}

}
