import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idadeUsuario = sc.nextInt();

        sc.close();

        int diasNoAno = 365;
        int segundosNoDia = 86400;

        int idadeUsuarioEmSegundos = idadeUsuario * diasNoAno * segundosNoDia;

        System.out.println(String.format("Você já viveu %s segundos.", idadeUsuarioEmSegundos));
    }
}
