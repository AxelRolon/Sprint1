package Ex1n1;

public class Main {

	public static void main(String[] args) {
		
		
		NoGenericMethods metodos = new NoGenericMethods(new Persona("Axel",25), new Persona("Miguel",26),new Persona("Ana",27));

		System.out.println(metodos.getPersona1().getNombre());
		
	}
	
	
	
		
	
}
