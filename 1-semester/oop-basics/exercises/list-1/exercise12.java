import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do cateto A:");
        float catetoA = sc.nextFloat();

        System.out.println("Digite o valor do cateto B:");
        float catetoB = sc.nextFloat();

        sc.close();

        float hipotenusa = (float) Math.sqrt(catetoA * catetoA + catetoB * catetoB);

        System.out.println(String.format("O valor da hipotenusa é: %s.", hipotenusa));
    }
}
