package tasca123;

public class Cycle {
	int nRuedas;
	//CONSTRUCTOR
	public Cycle (int nRuedas) {
		
		this.nRuedas = nRuedas ;
		
	}
	public static void ride() {
		System.out.println("Montando ");
	}
    public int nRuedas() {
        return this.nRuedas; }

    public void montar(){
        System.out.println("El numero de ruedas es  : " + this.nRuedas+ ".");
    }
    public void balance() {
        System.out.println(" ");
    }




}
