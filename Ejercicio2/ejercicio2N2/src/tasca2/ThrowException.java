package tasca2;

public class ThrowException {

	public void f ()  {
		 g();
	}
	
	public void g() throws ArithmeticException {
		int i=0, j=0, k;

        k = i/j;    // Origina un error de division-by-zero
	}
	
}
