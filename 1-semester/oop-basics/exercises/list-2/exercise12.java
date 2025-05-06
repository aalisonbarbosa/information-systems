import java.util.ArrayList;
import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Float> notas = new ArrayList<>();

        while (notas.size() < 3) {
            System.out.println("Digite uma nota (entre 0 e 100):");
            float nota = sc.nextFloat();

            if (nota >= 1 && nota <= 100) {
                notas.add(nota);
            } else {
                System.out.println("Nota inválida!");
            }
        }

        float somaDasNotas = 0;
        for (float nota : notas) {
            somaDasNotas += nota;
        }

        float mediaDasNotas = somaDasNotas / notas.size();

        String situacaoAluno;

        if (mediaDasNotas >= 70) {
            situacaoAluno = "Aprovado";
        } else if (mediaDasNotas <= 40) {
            situacaoAluno = "Reprovado";
        } else {
            situacaoAluno = "Final";
        }

        System.out.println(String.format("Situação do aluno: %s.", situacaoAluno));

        sc.close();
    }
}
