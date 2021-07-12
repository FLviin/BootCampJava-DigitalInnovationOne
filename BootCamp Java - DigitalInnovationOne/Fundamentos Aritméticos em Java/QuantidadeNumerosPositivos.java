import java.io.IOException;
import java.util.Scanner;
public class QuantidadeNumerosPositivos {
	
	public static void main(String[] args) throws IOException {
       
		Scanner leia = new Scanner(System.in);
        double numero ;
        int positivos = 0;
		
		for(int i = 0; i < 6; i++){

			numero = leia.nextDouble();
			if(numero > 0){
				positivos++;
			}
		}
		System.out.println(positivos+" valores positivos");
	}
}

