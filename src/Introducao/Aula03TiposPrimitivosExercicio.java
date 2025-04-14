package Introducao;
/*
Prática
Crie variáveis para os campos descritos abaixo entre <> e imrima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>,
confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

        String nome = "Dayene";
        String endereco = "Rua Joviano Naves, 342/101, Palmares. Belo Horizonte - MG";
        double salario = 2500.00;
        String dataRecebimento = "13/04/2025 - Domingo";

        System.out.println("Eu " + nome + ", morando no endereço: " + endereco + ", confirmo que recebi o salário de R$" + salario + ", na data: " + dataRecebimento);

    }
}
