package Introducao;

public class Aula07Arrays2 {
    public static void main(String[] args) {
        // valores iniciais por padrão:
        // byte, short, int, long, float e double ->  0
        // char -> '\u0000' ' '
        // boolean -> false
        // String -> null

        String[] nomes = new String[6];
        nomes[0] = "Rachel";
        nomes[1] = "Chandler";
        nomes[2] = "Mônica";
        nomes[3] = "Phoebe";
        nomes[4] = "Joey";
        nomes[5] = "Ross";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
