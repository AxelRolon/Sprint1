package Ex1n2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stubç
		
		GenericMethods obj = new GenericMethods();
		
		obj.types(new Persona("Axel","Duarte",25), "carola", 2);
		
		obj.types(125, new Persona("Rocio","Diaz",25),3);
		
		
		
		
		
		// Paso un argumento no genercico
		
		//obj.types(true, "JAJA", new Persona("Antonio","Diee",85)); error chaval !!!!!!!!
	}

}
