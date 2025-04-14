package Introducao;

public class Aula05EstruturasCondicionais3 {
    public static void main(String[] args) {

        // Doar se salário > 5000

        double salario = 3000;
        String mensagemDoar = "Eu vou doar 500 para DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";

        // (condição) ? verdadeiro : falso

        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
    }
}
