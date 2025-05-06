import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano da primeira dose da vacina:");
        int anoPrimeiraDoseVacina = sc.nextInt();

        System.out.println("Digite o intervalo em anos entre as doses (periodicidade):");
        int intervaloEntreDoses = sc.nextInt();

        sc.close();

        int anoVacina = anoPrimeiraDoseVacina;

        System.out.println("Calendário de Vacinação Infantil.");
        System.out.println(String.format("1° dose será no ano: %s.", anoVacina));
        for (int c = 2; c <= 4; c++) {
            anoVacina += intervaloEntreDoses;

            System.out.println(String.format("%s° dose será no ano: %s.", c, anoVacina));
        }
    }
}
