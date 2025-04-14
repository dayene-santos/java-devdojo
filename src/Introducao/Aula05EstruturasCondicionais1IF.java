package Introducao;

public class Aula05EstruturasCondicionais1IF {
    public static void main(String[] args) {

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        //!
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcóolica");
        } else {
            System.out.println("Não Autorizado a comprar bebida alcóolica");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcóolica");
        }

        System.out.println("Fora do IF");
    }
}
