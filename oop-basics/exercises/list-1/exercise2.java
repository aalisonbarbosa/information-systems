import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 números:");

        float numero1 = sc.nextFloat();
        float numero2 = sc.nextFloat();
        float numero3 = sc.nextFloat();

        sc.close();

        float mediaNumeros = (numero1 + numero2 + numero3) / 3;

        System.out.printf("A média dos números é: %s.", mediaNumeros);
    }
}
