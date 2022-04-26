package Ex2N1;

public class TrabajadorPrescencial extends Trabajador{

	private int kmRecorridos,precioKm=3;
	
	
	
	
	public TrabajadorPrescencial(String Nombre , String Apellido ) {
		
		this.kmRecorridos=kmRecorridos;
	}

	



	@Override
	
	public void getSueldo(int kmRecorridos1,int totalHora) {
		
		kmRecorridos = kmRecorridos1;
		
		precioHora=8;
		
		int totalKmprice = (kmRecorridos*precioKm);
		
		int sueldo = ((precioHora * totalHora) + totalKmprice );
		
		System.out.println("Sueldo total es " +sueldo);
	}
	
	@Deprecated
	public void metD1() {
		System.out.println("Metodo Obsoleto 2");
		
	}

}
