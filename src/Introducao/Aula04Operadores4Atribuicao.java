package Introducao;

public class Aula04Operadores4Atribuicao {
    public static void main(String[] args) {

        // = += -= *= /= %=

        double bonus = 1800; // 1800
        bonus += 1000; // resultado -> 2800
        bonus -= 1000; // resultado -> 1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);
        System.out.println("------------------");

        // ++ --
        int contador = 0;
        contador +=1; // contador = contador + 1;
        contador ++; // mesmo resultado que a operação acima
        contador --;
        System.out.println(contador);
    }
}
