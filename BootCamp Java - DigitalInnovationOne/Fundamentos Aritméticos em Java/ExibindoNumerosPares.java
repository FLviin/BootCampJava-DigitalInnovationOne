import java.io.IOException;
import java.util.Scanner;
public class ExibindoNumerosPares{
	
    public static void main(String[] args) throws IOException {
    	
    	Scanner leia = new Scanner(System.in);
        double n ;
    	n = leia.nextDouble();
    	for (int i = 1 ; i <= n ; i++) {
    		if (i % 2 == 0 ) System.out.println(i);
    	}
    }	
}
