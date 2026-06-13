import java.util.Scanner;

public class Ex08_EnquantoIsso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        double primeiroValor = scanner.nextDouble();

        double segundoValor = 0;

        while (segundoValor <= 0) {
            System.out.print("Informe o segundo valor (deve ser maior que zero): ");
            segundoValor = scanner.nextDouble();

            if (segundoValor <= 0) {
                System.out.println("Valor invalido! Informe um valor positivo.");
            }
        }

        double resultado = primeiroValor / segundoValor;

        System.out.println("Resultado da divisao: " + resultado);

        scanner.close();
    }
}
