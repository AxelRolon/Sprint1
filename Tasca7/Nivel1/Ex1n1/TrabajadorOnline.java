package Ex1n1;



public class TrabajadorOnline extends Trabajador{

	
	
	
	
	public TrabajadorOnline(String Nombre, String Apellido ) {
		
	}

	
	
	
	@Override 
	
	public void getSueldo(int totalHora,int c) {
		totalHora = totalHora;
		precioHora=7;
		int sueldo = (precioHora * totalHora)  ;
		
		System.out.println("Sueldo total , es "+sueldo);
	
	}
	
	
}
