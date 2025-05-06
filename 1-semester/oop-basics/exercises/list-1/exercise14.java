import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma quantidade de minutos:");
        int entradaMinutos = sc.nextInt();

        sc.close();

        int horas = entradaMinutos / 60;
        int minutos = entradaMinutos - horas * 60;

        System.out.println(String.format("%s minutos => %s horas e %s minutos.", entradaMinutos, horas, minutos));
    }
}
