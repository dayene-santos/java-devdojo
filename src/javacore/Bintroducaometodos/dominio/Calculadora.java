package javacore.Bintroducaometodos.dominio;

import org.w3c.dom.ls.LSOutput;

public class Calculadora {

    // public -> modificador de acesso | void -> não retorna nada mas há uma saída
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    // métodos simples
    public void subtraiDoisNumeros() {
        System.out.println(20 - 10);
    }
    // métodos com parâmetros
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }
    // métodos com retorno
    public double divideDoisNumeros(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1 / num2;
    }
}
