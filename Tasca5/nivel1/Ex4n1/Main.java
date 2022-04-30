package Ex4n1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("C:/Users/PC/eclipse-workspace/Tasca5/src/Ex3n1/fichero.txt");
		FileReader fe = new FileReader("C:/Users/PC/eclipse-workspace/Tasca5/src/Ex3n1/fichero.txt");
		File ruta = new File("C:\\Users\\PC\\Documents\\Java Back End");

		// Creo un file para recorrer los elementos dentro de la ruta especificada

		File[] listado = ruta.listFiles();

		Arrays.sort(listado);
		
		for(int i = 0 ; i<listado.length; i++) {
			
			if(listado[i].isFile()) {
				
				fw.write(" F : "  + listado[i].getName()+ new Date(ruta.lastModified()));
				fw.flush();
			}
			
			else if(listado[i].isDirectory()) {
				
				fw.write(" D : "  + listado[i].getName());
				fw.flush();
			}
	}
		int valor=fe.read();
        while(valor!=-1){
            System.out.print((char)valor);
            valor=fe.read();
        }
        //Cerramos el stream
        fe.close();

	}
}
