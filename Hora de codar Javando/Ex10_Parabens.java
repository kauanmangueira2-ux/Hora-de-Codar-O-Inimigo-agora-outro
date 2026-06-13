import java.util.Scanner;

public class Ex10_Parabens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Informe a nota " + i + ": ");
            double nota = scanner.nextDouble();
            soma = soma + nota;
        }

        double media = soma / 4;

        System.out.println("Media do semestre: " + media);

        if (media >= 6.0) {
            System.out.println("PARABENS! Voce foi aprovado!");
        }

        scanner.close();
    }
}
