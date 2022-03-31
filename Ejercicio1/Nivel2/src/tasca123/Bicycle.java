package tasca123;

public class Bicycle extends Cycle {

	public Bicycle() {
		super(2);
		
	}
	
	public void montar() {
		super.montar();
		System.out.println("Estas montando una bicicleta");
	}
}
