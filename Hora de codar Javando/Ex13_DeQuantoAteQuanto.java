import java.util.Scanner;

public class Ex13_DeQuantoAteQuanto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro numero (menor): ");
        int primeiro = scanner.nextInt();

        System.out.print("Informe o segundo numero (maior): ");
        int segundo = scanner.nextInt();

        double soma = 0;
        int quantidade = 0;

        for (int i = primeiro; i <= segundo; i++) {
            soma = soma + i;
            quantidade++;
        }

        double media = soma / quantidade;

        System.out.println("Media aritmetica dos numeros de " + primeiro + " ate " + segundo + ": " + media);

        scanner.close();
    }
}
