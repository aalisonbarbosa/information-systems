import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus celsius:");
        float temperaturaCelsius = sc.nextFloat();

        sc.close();

        float temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;

        System.out.printf("Temperatura em graus fahrenheit é: %s.", temperaturaFahrenheit);
    }
}
