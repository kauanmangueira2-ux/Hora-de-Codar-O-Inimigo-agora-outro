import java.util.Scanner;

public class Ex19_EoQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o lado A do triangulo: ");
        double a = scanner.nextDouble();

        System.out.print("Informe o lado B do triangulo: ");
        double b = scanner.nextDouble();

        System.out.print("Informe o lado C do triangulo: ");
        double c = scanner.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Os lados formam um TRIANGULO!");
        } else {
            System.out.println("Os lados NAO formam um triangulo.");
        }

        scanner.close();
    }
}
