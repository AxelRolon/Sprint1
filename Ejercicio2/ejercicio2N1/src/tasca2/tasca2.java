package tasca2;

public class tasca2 {

public static void main(String[] args) {
	
	
try {	tasca2 objeto = new tasca2();
	
	objeto = null;
	
	objeto.saludar();
	}
	catch(Exception e) {
		System.out.println("Error = " + e);
	}
}


public void saludar() {
	
	System.out.println("HOLA");
}




}
