import java.io.IOException;
import java.util.Scanner;

public class AnaliseDeNumeros {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;
        int n;
        
//continue a solução
        for (int i = 1 ; i <= 5 ; i++) {
                n = leitor.nextInt();
                if( n % 2 == 0){ pares++;}
                if( n % 2 != 0){ impares++;}
                if(n > 0){positivos++;}
                if(n < 0){negativos++;}
                
          
        	
        }
//insira suas variaveis corretamente
        System.out.println( pares + " valor(es) par(es)");
        System.out.println( impares + " valor(es) impar(es)");
        System.out.println( positivos + " valor(es) positivo(s)");
        System.out.println( negativos + " valor(es) negativo(s)");
    }
	
}
