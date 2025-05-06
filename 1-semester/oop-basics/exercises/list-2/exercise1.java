import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idadeUsuario = sc.nextInt();

        sc.close();

        String faixaEtaria;

        if (idadeUsuario >= 0) {
            if (idadeUsuario <= 12) {
                faixaEtaria = "Criança";
            } else if (idadeUsuario <= 17) {
                faixaEtaria = "Adolescente";
            } else if (idadeUsuario <= 59) {
                faixaEtaria = "Adulto";
            } else {
                faixaEtaria = "Idoso";
            }

            System.out.println(String.format("Sua faixa etária é: %s.", faixaEtaria));
        } else {
            System.out.println("Idade inválida!");
        }
    }
}
