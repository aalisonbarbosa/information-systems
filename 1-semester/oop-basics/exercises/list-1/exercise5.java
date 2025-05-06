import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números inteiros:");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        sc.close();

        int somaNumeros = numero1 + numero2;
        int subtracaoNumeros = numero1 - numero2;
        float divisaoNumeros = (float) numero1 / (float) numero2;
        int multiplicacaoNumeros = numero1 * numero2;

        System.out.println(String.format("A soma dos números é: %s.", somaNumeros));
        System.out.println(String.format("A subtração dos números é: %s.", subtracaoNumeros));
        System.out.println(String.format("A divisão dos números é: %s.", divisaoNumeros));
        System.out.println(String.format("A multiplicação dos números é: %s.", multiplicacaoNumeros));
    }
}
