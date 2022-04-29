package Ex2N1;

public class Trabajador {

	private String Nombre, Apellido;
	protected int precioHora;

	
	public Trabajador(){
		
	}
	
	
	public Trabajador(String Nombre, String Apellido ) {
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		
		
	}

	public int getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(int precioHora) {
		this.precioHora = precioHora;
	}

	

	

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getSueldoHora() {
		return precioHora;
	}

	public void setSueldoHora(int sueldoHora) {
		this.precioHora = precioHora;
	}

	public void getSueldo(int d,int c) {

	}

	@Override
	public String toString() {
		return "Trabajador [Nombre=" + Nombre + ", Apellido=" + Apellido  ;
	}
	
	

}
