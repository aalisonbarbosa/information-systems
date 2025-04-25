import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float raioEsfera;

        while (true) {
            System.out.println(("Digite o raio da esfera (entre 1.0 e 50.0):"));
            raioEsfera = sc.nextFloat();

            if (raioEsfera >= 1 && raioEsfera <= 50){
                break;
            }

            System.out.println("Erro! Digite um raio entre 1.0 e 50.0.");
        }

        sc.close();

        float volumeEsfera = (4/3) * 3.14f * (float) Math.pow(raioEsfera, 3);
        
        System.out.println(String.format("O volume da esfera é: %.2f.", volumeEsfera));

    }
}
