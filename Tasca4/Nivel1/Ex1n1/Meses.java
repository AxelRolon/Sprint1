package Ex1n1;

import  java.util.ArrayList;
import java.util.ListIterator;
import static org.junit.Assert.assertTrue;

import junit.framework.*;

public class Meses {

	private boolean x;

	ArrayList<String> meses = new ArrayList<String>();
	ListIterator<String> it = meses.listIterator();

	public Meses() {
	}

	public Meses(Boolean x) {
		this.x = x;
	}

	public boolean add() {
		
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

		if ((meses.size() == 12) && (meses.isEmpty()) == false && (meses.get(7)) == "Agosto") {
			x = true;
		} else {
			x = false;
		}
		return x;
	}
}
