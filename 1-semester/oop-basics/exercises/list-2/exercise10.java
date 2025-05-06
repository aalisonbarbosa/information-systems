import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma escala de temperatura:\nC - Celsius.\nF - Fahrenheit.\nK - Kelvin.");
        String escalaSelecionada = sc.nextLine().toUpperCase();

        float temperaturaCelsius;
        float temperaturaFahrenheit;
        float temperaturaKelvin;

        if ("CFK".contains(escalaSelecionada)) {
            System.out.println("Digite o valor da temperatura:");

            if (escalaSelecionada.equals("C")) {
                temperaturaCelsius = sc.nextFloat();

                temperaturaFahrenheit = (temperaturaCelsius * (9 / 5)) + 32;
                temperaturaKelvin = temperaturaCelsius + 273.15f;

            } else if (escalaSelecionada.equals("F")) {
                temperaturaFahrenheit = sc.nextFloat();

                temperaturaCelsius = (temperaturaFahrenheit - 32) * (5 / 9);
                temperaturaKelvin = (temperaturaFahrenheit - 32) * (5 / 9) + 273.15f;

            } else {
                temperaturaKelvin = sc.nextFloat();

                temperaturaCelsius = temperaturaKelvin - 273.14f;
                temperaturaFahrenheit = (temperaturaKelvin - 273.15f) * (5 / 9) + 32;
            }

            System.out.println(String.format("Temperatura em graus celsius: %s.", temperaturaCelsius));
            System.out.println(String.format("Temperatura em graus fahrenheit: %s.", temperaturaFahrenheit));
            System.out.println(String.format("Temperatura em graus kelvin: %s.", temperaturaKelvin));
        } else {
            System.out.println("Escala inválida!");
        }

        sc.close();
    }
}
