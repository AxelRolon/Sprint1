package Ex2n1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Main {


    @Test
    void testLetra(){
        Logica calculoDNI = new Logica();
        assertEquals(calculoDNI.obtenerLetra(12345678), "Z");
    
	
	
}
}
