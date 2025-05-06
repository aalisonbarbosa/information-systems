import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do PH:");
        float valorPH = sc.nextFloat();

        sc.close();

        String classificacaoPH;

        if (valorPH < 7) {
            classificacaoPH = "Ácida";
        } else if (valorPH == 7) {
            classificacaoPH = "Neutra";
        } else {
            classificacaoPH = "Básica";
        }

        System.out.println(String.format("Classificação do pH: %s.", classificacaoPH));
    }
}
