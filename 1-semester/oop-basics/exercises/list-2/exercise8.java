import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro em reais (entre 1 e 1000):");
        int valor = sc.nextInt();

        sc.close();

        if (valor < 1 && valor > 1000) {
            System.out.println("Valor inválido. Digite um valor entre 1 e 1000.");
        } else {
            int nota100 = valor / 100;
            valor %= 100;

            int nota50 = valor / 50;
            valor %= 50;

            int nota20 = valor / 20;
            valor %= 20;

            int nota10 = valor / 10;
            valor %= 10;

            int nota5 = valor / 5;
            valor %= 5;

            int nota2 = valor / 2;
            valor %= 2;

            System.out.println("Notas necessárias:");
            if (nota100 > 0)
                System.out.println("R$100: " + nota100);
            if (nota50 > 0)
                System.out.println("R$50: " + nota50);
            if (nota20 > 0)
                System.out.println("R$20: " + nota20);
            if (nota10 > 0)
                System.out.println("R$10: " + nota10);
            if (nota5 > 0)
                System.out.println("R$5: " + nota5);
            if (nota2 > 0)
                System.out.println("R$2: " + nota2);
            if (valor > 0)
                System.out.println("Não é possível sacar R$" + valor + " com as notas disponíveis.");
        }
    }
}
