package Ex2n1;

public class Logica {
	 private int numeroDNI;
	    private char letraDNI;
	    private final char [] listaDeLetra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z',
	            'S','Q','V','H','L','C','K','E'};

	    public Logica() {
	        numeroDNI = 0;
	    }

	    public Logica(int numeroDNI) {
	        this.numeroDNI = numeroDNI;
	    }


	    public void setNumeroDNI(int nuevoNumeroDNI) {
	        this.numeroDNI = nuevoNumeroDNI;
	    }

	    public String obtenerLetra(int numeroDNI){
	        int resto;
	        resto = numeroDNI % 23;
	        System.out.println("Número DNI: " + numeroDNI + " - " + listaDeLetra[resto]);
	        char letra = listaDeLetra[resto];
	        System.out.println(letra);
	        return letra + "";
}
}