package tasca1;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			ThrowException t = new ThrowException();
			t.g();
		}
		
		catch(Exception e) {
			//System.out.println(e);
			throw new NumberFormatException("Formato no valido");
			//imprime de salida la excepcion lanzada en el catch antes que la excepcion de Aritmetica del metodo g
		}
		
	}

}
