package Introducao;

public class Aula04OperadoresLogicos {
    public static void main(String[] args) {

        // && -> And

        int idade = 28;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);
        System.out.println("--------------------------------------------------------------");

        // || -> Or

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 1000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorTotalContaPoupanca;

        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);
    }
}
