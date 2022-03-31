package tasca5;

import java.util.Scanner;

public class adivinaNumero {
	
	public adivinaNumero() {
		
	}

    public static void main(String[] args) {
        // TODO code application logic here
     
    try {
    	
    	Adivina();
    	
    	
    }catch(Exception e) {
    	System.out.println("Error: debes acertar " + e);
    }
    	
    	
    }
    	
    public static void Adivina () throws comprobar{
    	double  alea = Math.ceil((Math.random() * 10));
    	boolean y=true;
        //int intentos = 5 ;
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Acerta el numero");
        
        int x = Integer.parseInt(entrada.next());
        
        while(x <  alea || x> alea && y == true ){
        
        	System.out.println("intenta de nuevo");
        	
        	x = entrada.nextInt();
        	 
        	 throw new comprobar();
        	
           // intentos--;
            
        }
        if(x==alea){
            System.out.println("has acertado");
            y=true;
            
        }
        else{
            System.out.println("No quedan oportunidades");
        }
       
        
    }
	public static class comprobar extends Exception{
		public comprobar() {}
		
		public comprobar(String msj_error) {
			super(msj_error);
		}
    
}
    }