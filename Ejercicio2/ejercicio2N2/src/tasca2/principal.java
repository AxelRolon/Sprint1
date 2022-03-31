package tasca2;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			ThrowException t = new ThrowException();
			t.g();
		}
		
		catch(RuntimeException e) {
			//System.out.println(e);
			throw new NumberFormatException("Formato no valido");
		
		}
		
	}

}
