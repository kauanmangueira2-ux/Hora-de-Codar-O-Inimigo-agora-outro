import java.util.Scanner;

public class Ex04_BitOfGeometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== A Bit of Geometry ===");
        System.out.println("Escolha a forma geometrica:");
        System.out.println("1 - Circulo");
        System.out.println("2 - Quadrado");
        System.out.println("3 - Retangulo");
        System.out.println("4 - Trapezio");
        System.out.println("5 - Triangulo");
        System.out.print("Opcao: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Informe o raio do circulo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = Math.PI * raio * raio;
                System.out.println("Area do circulo: " + areaCirculo);
                break;

            case 2:
                System.out.print("Informe o lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Area do quadrado: " + areaQuadrado);
                break;

            case 3:
                System.out.print("Informe a base do retangulo: ");
                double base = scanner.nextDouble();
                System.out.print("Informe a altura do retangulo: ");
                double altura = scanner.nextDouble();
                double areaRetangulo = base * altura;
                System.out.println("Area do retangulo: " + areaRetangulo);
                break;

            case 4:
                System.out.print("Informe a base maior do trapezio: ");
                double baseMaior = scanner.nextDouble();
                System.out.print("Informe a base menor do trapezio: ");
                double baseMenor = scanner.nextDouble();
                System.out.print("Informe a altura do trapezio: ");
                double alturaTrapezio = scanner.nextDouble();
                double areaTrapezio = ((baseMaior + baseMenor) * alturaTrapezio) / 2;
                System.out.println("Area do trapezio: " + areaTrapezio);
                break;

            case 5:
                System.out.print("Informe a base do triangulo: ");
                double baseTriangulo = scanner.nextDouble();
                System.out.print("Informe a altura do triangulo: ");
                double alturaTriangulo = scanner.nextDouble();
                double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
                System.out.println("Area do triangulo: " + areaTriangulo);
                break;

            default:
                System.out.println("Opcao invalida!");
        }

        scanner.close();
    }
}
