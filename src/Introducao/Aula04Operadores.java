package Introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores Aritméticos
        // + - / *

        int numero01 = 10;
        int numero02 = 20;
        int soma = numero01 + numero02;
        int diferenca = numero01 - numero02;
        int produto = numero01 * numero02;
        double divisao = numero01 / (double) numero02;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A diferença dos números é: " + diferenca);
        System.out.println("O produto dos números é: " + produto);
        System.out.println("A divisão entre os números é: " + divisao);
    }
}
