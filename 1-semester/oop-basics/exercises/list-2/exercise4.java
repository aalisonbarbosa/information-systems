import java.util.Random;
import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        int numeroEscolhido;

        System.out.println("Jogo de Adivinhação!");
        System.out.println("Descubra o número (entre 1 e 100).");

        do {
            System.out.println("Digite um número:");
            numeroEscolhido = sc.nextInt();

            if (numeroAleatorio > numeroEscolhido) {
                System.out.println(String.format("O número aleatório é maior que %s.", numeroEscolhido));
            } else if (numeroAleatorio < numeroEscolhido) {
                System.out.println(String.format("O número aleatório é menor que %s.", numeroEscolhido));
            } else {
                System.out.println("Parabéns você acertou!");
            }
        } while (numeroAleatorio != numeroEscolhido);

        sc.close();
    }
}
