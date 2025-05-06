import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = sc.nextInt();

        sc.close();

        System.out.println(String.format("Números pares de 1 até %s:", numero));
        for (int num = 1; num <= numero; num++) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
