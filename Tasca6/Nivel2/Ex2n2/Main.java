package Ex2n2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stubç

		GenericMethods obj = new GenericMethods();

		ArrayList<String> A = new ArrayList<>();
		A.add("ASDAD");

		
		
		
		ArrayList<Integer> B = new ArrayList<>();
		B.add(2);
		
		obj.types(new Persona("Axel", "Duarte", 25), "carola", B);
		
		
		ArrayList<Persona> C = new ArrayList<>();
		C.add(new Persona("LUIS","gOMEZ",4));
		
		obj.types(new Persona("Axel", "Duarte", 25), "carola", C);

	}

}
