package Tasca1;

import java.util.ArrayList;

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
		
		ArrayList<Month> meses = new ArrayList<>();
		
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
		
		
		
			for(int i = 0 ; i<meses.size(); i++) {
				System.out.println(meses.get(i).getName()+" ");
			}
			System.out.println("-----------------------------------------------------------------------------------------------");
		meses.add(7, new Month( "Agosto"));
		for(int i = 0 ; i<meses.size(); i++) {
			System.out.println(meses.get(i).getName()+" ");
		}
		
		
		
	}

}
