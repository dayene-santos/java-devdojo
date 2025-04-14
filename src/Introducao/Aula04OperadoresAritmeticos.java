package Introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores Aritméticos
        // + - / * -> soma, subtração, divisão, multiplicação

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
        System.out.println("---------------------------------------------");

        // % -> Resto da divisão
        int resto = 21 % 7;
        System.out.println("Resto da divisão: " + resto);
        System.out.println("-----------------------------");
        // < > <= >= == !=  -> menor, maior, menor ou igual, maior ou igual, igual, diferente de

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);
    }
}
