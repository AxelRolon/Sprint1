package Ex1n2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassMatcher {

	    public static void main(String[] args) {
	        int contador = 0;
	        String cadena = "Mordor";
	        Pattern pattern = Pattern.compile("Mordor", Pattern.CASE_INSENSITIVE);
	        Matcher matcher = pattern.matcher(cadena);

	        while (matcher.find()){
	            contador++;
	            System.out.println("Coincidenadecia Nº: " + contador + " star " + matcher.start() + " end " + matcher.end());
	        }
	    }
	}



