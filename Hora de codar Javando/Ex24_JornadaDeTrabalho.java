import java.util.Scanner;

public class Ex24_JornadaDeTrabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o numero de horas trabalhadas no mes: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Informe o salario por hora: R$ ");
        double salarioPorHora = scanner.nextDouble();

        double horasNormaisMes = 40 * 4;

        double salarioTotal = 0;

        if (horasTrabalhadas <= horasNormaisMes) {
            salarioTotal = horasTrabalhadas * salarioPorHora;
            System.out.println("\nNenhuma hora extra trabalhada.");
        } else {
            double horasExtras = horasTrabalhadas - horasNormaisMes;
            double salarioHoraExtra = salarioPorHora * 1.50;

            double salarioNormal = horasNormaisMes * salarioPorHora;
            double salarioExtra = horasExtras * salarioHoraExtra;
            salarioTotal = salarioNormal + salarioExtra;

            System.out.println("\n--- Detalhamento ---");
            System.out.printf("Horas normais: %.0f h x R$ %.2f = R$ %.2f%n", horasNormaisMes, salarioPorHora, salarioNormal);
            System.out.printf("Horas extras: %.0f h x R$ %.2f = R$ %.2f%n", horasExtras, salarioHoraExtra, salarioExtra);
        }

        System.out.printf("Salario total: R$ %.2f%n", salarioTotal);

        scanner.close();
    }
}
