import java.util.Scanner;

public class Ex25_InvertendoTudo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] valores = new String[12];

        System.out.println("Informe 12 valores (letras ou numeros):");
        for (int i = 0; i < 12; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = scanner.next();
        }

        System.out.print("\nSaida 1 (invertido): ");
        for (int i = 11; i >= 0; i--) {
            System.out.print(valores[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        String numeros = "";
        String letras = "";

        for (int i = 11; i >= 0; i--) {
            try {
                Integer.parseInt(valores[i]);
                if (!numeros.isEmpty()) {
                    numeros = numeros + ", ";
                }
                numeros = numeros + valores[i];
            } catch (NumberFormatException e) {
                if (!letras.isEmpty()) {
                    letras = letras + ", ";
                }
                letras = letras + valores[i];
            }
        }

        System.out.println("Saida 2 (invertido por tipo): " + numeros + " - " + letras);

        scanner.close();
    }
}
