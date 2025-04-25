import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso:");
        float pesoUsuario = sc.nextFloat();

        System.out.println("Digite sua altura:");
        float alturaUsuario = sc.nextFloat();

        sc.close();

        float imc = pesoUsuario / (alturaUsuario * alturaUsuario);

        System.out.println(String.format("Seu imc é: %s.", imc));
    }
}
