import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor em dólar:");
        float valorDolares = sc.nextFloat();

        sc.close();

        float valorReais = valorDolares * 5.1f;

        System.out.println(String.format("O valor em reais é: R$ %s.", valorReais));
    }
}
