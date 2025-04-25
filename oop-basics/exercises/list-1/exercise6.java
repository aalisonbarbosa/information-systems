import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distância da viagem (em km):");
        float distanciaViagem = sc.nextFloat();

        System.out.println("Digite a velocidade média (em km/h):");
        int velocidadeMediaViagem = sc.nextInt();

        sc.close();

        float tempoViagem = distanciaViagem / velocidadeMediaViagem;

        System.out.println(String.format("O tempo estimado de viagem é: %s horas.", tempoViagem));
    }
}
