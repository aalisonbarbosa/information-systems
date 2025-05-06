import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senhaBD = "senha12345";

        String senhaUsuario;

        while (true) {
            System.out.println("Digite sua senha:");
            senhaUsuario = sc.nextLine();

            if (senhaBD.equals(senhaUsuario)) {
                System.out.println("Acesso permitido.");
                break;
            }

            System.out.println("Senha incorreta. Tente novamente!");
        }

        sc.close();
    }
}
