import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas moedas de R$0,25 você tem:");
        int moedas25centavos = sc.nextInt();

        System.out.println("Digite quantas moedas de R$0,50 você tem:");
        int moedas50centavos = sc.nextInt();

        System.out.println("Digite quantas moedas de R$1,0 você tem:");
        int moedas1real = sc.nextInt();

        sc.close();

        float valorTotalEconomizado = moedas25centavos * 0.25f + moedas50centavos * 0.5f + moedas1real;

        System.out.println(String.format("Valor total economizado: %.2f.", valorTotalEconomizado));
    }
}
