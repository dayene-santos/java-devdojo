package Introducao;

public class Aula05EstruturasCondicionais2IfElse {
    public static void main(String[] args) {

        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 17;
        String categoria = " ";

        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria Adulto");
        }
        System.out.println(categoria);
    }
}
