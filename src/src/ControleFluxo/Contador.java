package ControleFluxo;
import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parametro");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch(ParametrosInvalidosException exception) {
            // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("Erro" + exception.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        } else {
            int contagem = parametroDois - parametroUm;
            for (int c = 0; c < contagem; c++){
                System.out.println(c);
            }
        }

        // int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
    }
}
