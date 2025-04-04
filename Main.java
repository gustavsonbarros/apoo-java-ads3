import funcoes.OperacoesNumericas;

public class Main {
    public static void main(String[] args) {

        System.out.println(OperacoesNumericas.somar.apply(10, 15));
        System.out.println(OperacoesNumericas.somar.apply(187, 18));

        System.out.println(OperacoesNumericas.fatorial.apply(5));
        System.out.println(OperacoesNumericas.fatorial.apply(7));

        System.out.println(OperacoesNumericas.isPrimo.test(13));
        System.out.println(OperacoesNumericas.isPrimo.test(14));

        System.out.println(OperacoesNumericas.isInteiroValido.test("157"));
        System.out.println(OperacoesNumericas.isInteiroValido.test("15a7"));

        double[] array1 = {1, 10, 6.5, 189.5};
        double[] array2 = {10, 58.9, 6.5, 18};

        System.out.println(OperacoesNumericas.calcularMedia.apply(array1));
        System.out.println(OperacoesNumericas.calcularMedia.apply(array2));

        OperacoesNumericas.imprimirMaiorNumero.accept(array1);
        OperacoesNumericas.imprimirMaiorNumero.accept(array2);
    }
}
