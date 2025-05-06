import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = sc.nextInt();

        sc.close();

        if (numero > 0) {
            System.out.println("O número informado é positivo.");
        } else if (numero < 0) {
            System.out.println("O número informado é negativo.");
        } else {
            System.out.println("O número informado é neutro.");
        }
    }
}
