import java.util.Scanner;
import java.time.LocalDate;

public class exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento:");
        int anoNascimentoUsuario = sc.nextInt();

        sc.close();

        int anoAtual = LocalDate.now().getYear();

        int idadeUsuario = anoAtual - anoNascimentoUsuario;

        System.out.printf("Sua idade é: %s.", idadeUsuario);
    }
}
