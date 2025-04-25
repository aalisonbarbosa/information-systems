import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do círculo:");
        float raioCirculo = sc.nextFloat();

        sc.close();

        float areaCirculo = 3.14f * raioCirculo * raioCirculo;
        float perimetroCirculo = 2 * 3.14f * raioCirculo;

        System.out.println(String.format("A área do círculo é: %s", areaCirculo));
        System.out.println(String.format("O perímetro do círculo é: %s", perimetroCirculo));
        System.out.println(raioCirculo * raioCirculo);
    }
}
