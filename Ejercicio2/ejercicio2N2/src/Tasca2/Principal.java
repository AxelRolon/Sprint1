package Tasca2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			Logica t = new Logica();
			t.g();
		}
		
		catch(RuntimeException e) {
			//System.out.println(e);
			throw new NumberFormatException("Formato no valido");
		
		}
		
	}

}
