package Tasca1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			Logica t = new Logica();
			t.g();
		}
		
		catch(Exception e) {
			//System.out.println(e);
			throw new NumberFormatException("Formato no valido");
			//imprime de salida la excepcion lanzada en el catch antes que la excepcion de Aritmetica del metodo g
		}
		
	}

}
