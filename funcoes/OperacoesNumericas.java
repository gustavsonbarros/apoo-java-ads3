package funcoes;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class OperacoesNumericas {
    public static BiFunction<Integer, Integer, Integer> somar = (a, b) -> a + b;

    public static final Function<Integer, Integer> fatorial = n -> {
        if (n < 0) throw new IllegalArgumentException("n < 0");
        int resultado = 1;
        for (int i = 1; i <= n; i++) resultado *= i;
        return resultado;
    };

    public static Predicate<Integer> isPrimo = numero -> {
        int divisores = 0;
        for(int i = 1; i <= numero; i++){
            if(numero % i == 0) divisores++;
        }
        return divisores == 2;
    };

    public static Predicate<String> isInteiroValido = texto -> texto.matches("-?\\d+");

    public static final Function<double[], Double> calcularMedia = vetor -> {
        if (vetor.length == 0) throw new IllegalArgumentException("vetor.length == 0");
        double soma = 0;
        for (double v : vetor) soma += v;
        return soma / vetor.length;
    };

    public static final Consumer<double[]> imprimirMaiorNumero = vetor -> {
        if (vetor.length == 0) throw new IllegalArgumentException("vetor.length == 0");
        double maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) maior = vetor[i];
        }
        System.out.println("Maior número = " + maior);
    };
}
