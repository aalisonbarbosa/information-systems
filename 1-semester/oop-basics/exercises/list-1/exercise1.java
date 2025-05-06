import java.util.Scanner;

class exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        sc.close();

        System.out.printf("Olá, %s!", nome);
    }
}