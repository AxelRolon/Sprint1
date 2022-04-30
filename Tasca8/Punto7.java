package Ex1n1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Punto7 {

public static void main(String[] args) {
		
		List<String> cadenas = Arrays.asList("hola","carola","caballo","sapo","hjpuet","pescues0");
		
		System.out.println("Nueva lista ordenada del reves " + ordenar(cadenas));
	}
	
	public static List<String> ordenar(List<String> cadenas) {
        return cadenas.stream()
        		.sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());
       }
}

