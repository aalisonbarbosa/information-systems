import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da base do retângulo:");
        float baseRetangulo = sc.nextFloat();

        System.out.println("Digite o valor da altura do retângulo:");
        float alturaRetangulo = sc.nextFloat();

        sc.close();

        float areaRetangulo = baseRetangulo * alturaRetangulo;

        System.out.println(String.format("A área do retângulo é: %s.", areaRetangulo));
    }
}
