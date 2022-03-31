package tasca1;

public class tasca1 {
	
	public static void main(String[] args) {
		
		int a =5 , b = 0;
		
		
		
		try {
			System.out.println("Conjunto de declaraciones que puede generar una exepcion");
			int resultado = 5/0;
		}
		catch(Exception e) {
			//capturar el tipo de error
			System.out.println("Error.....rr.r.r.r.r." + e);
		}
		finally {
			System.out.println("Este bloque de codigo siempre se ejecuta");
		}
	}

}
