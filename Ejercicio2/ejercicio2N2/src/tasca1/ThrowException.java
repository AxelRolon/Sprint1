package tasca1;

public class ThrowException {

	public void f ()  {
		 g();
	}
	
	public void g() throws RuntimeException {
		int i=0, j=0, k;

        k = i/j;    // Origina un error de division-by-zero
	}
	
}
