package tasca3;

public class tasca3 {

	public static void main(String[] args) {
		
		
		try {
		int [] array = new int [2];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		
		System.out.println(array[3]);
		}
		
		catch(Exception e){
			System.out.println("El nombre de la excepcion es = " + e);
		}finally {
			System.out.println("Programa terminado");
		}
	
		
		
		
		
		
		
	}
	
	
	
}
