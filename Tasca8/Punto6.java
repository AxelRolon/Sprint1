package Ex1n1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Punto6 {

	public static void main(String[] args) {
		
		List<String> cadenas = Arrays.asList("hola","carola","caballo","sapo","hjpuet","pescues0");
		
		System.out.println("Nueva lista ordenada " + ordenar(cadenas));
	}
	
	public static List<String> ordenar(List<String> cadenas) {
        return cadenas.stream()
                .sorted(Comparator.comparing(l -> l.length()))
                .collect(Collectors.toList());
       }
}
