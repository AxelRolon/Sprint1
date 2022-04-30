package Ex1n1;

public class Punto8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface8 reversa = (str) -> {
			String resultado = "";
			for(int i = str.length() -1; i>=0 ; i--)
				resultado += str.charAt(i);
			return resultado;
		};
		
		System.out.println(reversa.reverse("ME Llamo Cancion"));

	}

}
