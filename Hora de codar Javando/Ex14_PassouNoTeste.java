import java.util.Scanner;

public class Ex14_PassouNoTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aprovados = 0;
        String resposta = "S";

        while (resposta.equalsIgnoreCase("S")) {
            double soma = 0;

            for (int i = 1; i <= 6; i++) {
                System.out.print("Informe a nota " + i + ": ");
                double nota = scanner.nextDouble();
                soma = soma + nota;
            }

            double media = soma / 6;
            System.out.println("Media final: " + media);

            if (media >= 6.5) {
                System.out.println("Aluno APROVADO!");
                aprovados++;
            } else {
                System.out.println("Aluno REPROVADO.");
            }

            System.out.print("Calcular a media de outro aluno? Sim/Nao (S/N): ");
            resposta = scanner.next();
        }

        System.out.println("Total de alunos aprovados: " + aprovados);

        scanner.close();
    }
}
