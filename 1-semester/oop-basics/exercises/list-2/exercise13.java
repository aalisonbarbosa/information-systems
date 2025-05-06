import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua temperatura (em graus Celsius):");
        float temperatura = sc.nextFloat();
        sc.nextLine(); // Consome a quebra de linha

        System.out.println("Está com secreção nasal (S ou N):");
        String secrecaoNasal = sc.nextLine().toUpperCase();

        System.out.println("Está com tosse (S ou N):");
        String tosse = sc.nextLine().toUpperCase();

        System.out.println("Está com dor no corpo (S ou N):");
        String dorNoCorpo = sc.nextLine().toUpperCase();

        sc.close();

        String exameRecomendado = "";

        if (temperatura >= 37) {
            if (secrecaoNasal.equals("S") && tosse.equals("S") && dorNoCorpo.equals("S")) {
                exameRecomendado = "Exames Especiais";
            } else if (secrecaoNasal.equals("N") && tosse.equals("N") && dorNoCorpo.equals("N")) {
                exameRecomendado = "Exames Básicos";
            } else {
                System.out.println("Entrada inválida!");
            }
        } else {
            if (secrecaoNasal.equals("N") && tosse.equals("N") && dorNoCorpo.equals("N")) {
                exameRecomendado = "Liberado";
            } else if (secrecaoNasal.equals("S") || tosse.equals("S") || dorNoCorpo.equals("S")) {
                exameRecomendado = "Exames Básicos";
            } else {
                System.out.println("Entrada inválida!");
            }
        }

        if (exameRecomendado.length() > 0) {
            System.out.println(String.format(
                    "Sistomas do usuário:\nTemperatura: %s.\nSecreção nasal: %s.\nTosse: %s.\nDor no corpo: %s.\nExames recomendados: %s.",
                    temperatura, secrecaoNasal, tosse, dorNoCorpo, exameRecomendado));
        }
    }
}
