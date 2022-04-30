package Ex5n1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class AsoAdmin implements Serializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WeedClub[] socios = new WeedClub[3];
	
		WeedClub asociado1 = new WeedClub("Miguel","LOco","Finlandes",40,001);
		WeedClub asociado2 = new WeedClub("Maria","Chichona","Argentina",18,002);
		WeedClub asociado3 = new WeedClub("Rocio","Parachoques","Brasil",21,003);
	
		socios[0] = asociado1;
		socios[1] = asociado2;
		socios[2] = asociado3;
		
		
	asociado1.retirar();
	
	try {
		ObjectOutputStream fichero_byte = new ObjectOutputStream(new FileOutputStream("C:/Users/PC/eclipse-workspace/Tasca5/src/Ex5n1/WeedClub.dat"));
		
		fichero_byte.writeObject(socios);
		fichero_byte.close();
		
		ObjectInputStream  recuperar_fichero = new ObjectInputStream(new FileInputStream("C:/Users/PC/eclipse-workspace/Tasca5/src/Ex5n1/WeedClub.dat"));
		
		WeedClub[] fichero_recuperado =(WeedClub[]) recuperar_fichero.readObject();
		recuperar_fichero.close();
		
		for(WeedClub e : fichero_recuperado) {
			System.out.println(e);
		}
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
	}

}
