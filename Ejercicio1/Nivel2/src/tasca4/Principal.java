package tasca4;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		raton raton1 = new raton();
		jerbu jerbu1 = new jerbu();
		hamster hamster1 = new hamster();
	
		Roedores [] tipos = new Roedores[]{raton1, jerbu1,hamster1};
		
		for(int i =0; i<=tipos.length;i++) {
			if(tipos[i] instanceof raton) {
				raton1.correr();
				raton1.morder();
				raton1.oler();
			}else if(tipos[i] instanceof jerbu) {
				jerbu1.oler();
				jerbu1.correr();
				jerbu1.morder();
			}else if(tipos[i] instanceof hamster) {
				hamster1.correr();
				hamster1.oler();
				hamster1.morder();
			}
		}
	}

}
