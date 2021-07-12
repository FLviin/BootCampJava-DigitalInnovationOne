
import java.util.function.UnaryOperator;

public class aula {
    public static void main(String[] args) {
        
        UnaryOperator<Integer> calcular = valor -> valor*3; // conceito de paradigma funcional
        int valor = 10;
        System.out.println("Resultado : "+calcular.apply(10));
    }   
}
    

