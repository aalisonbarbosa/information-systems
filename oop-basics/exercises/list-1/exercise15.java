import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da refeição:");
        float valorRefeicao = sc.nextFloat();

        sc.close();

        float taxaDeServico = 0.1f;

        float valorRefeicaoComTaxa = valorRefeicao * (taxaDeServico + 1);

        System.out.println(String.format("Valor da refeição com a taxa de serviço: R$%.2f", valorRefeicaoComTaxa));
    }
}
