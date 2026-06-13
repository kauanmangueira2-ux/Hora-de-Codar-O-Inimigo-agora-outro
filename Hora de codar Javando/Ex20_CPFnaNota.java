import java.util.Scanner;

public class Ex20_CPFnaNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Quantidade adquirida: ");
        int quantidade = scanner.nextInt();

        System.out.print("Preco unitario: R$ ");
        double precoUnitario = scanner.nextDouble();

        double valorVenda = quantidade * precoUnitario;

        double percentualDesconto = 0;

        if (quantidade <= 5) {
            percentualDesconto = 0.02;
        } else if (quantidade <= 10) {
            percentualDesconto = 0.03;
        } else {
            percentualDesconto = 0.05;
        }

        double valorDesconto = valorVenda * percentualDesconto;
        double imposto = valorVenda * 0.20;
        double totalAPagar = valorVenda - valorDesconto;

        System.out.println("\n========================================");
        System.out.println("             NOTA FISCAL                ");
        System.out.println("========================================");
        System.out.println("Produto: " + nomeProduto);
        System.out.printf("Quantidade: %d%n", quantidade);
        System.out.printf("Preco unitario: R$ %.2f%n", precoUnitario);
        System.out.printf("Valor da venda: R$ %.2f%n", valorVenda);
        System.out.printf("Desconto (%.0f%%): R$ %.2f%n", percentualDesconto * 100, valorDesconto);
        System.out.printf("Imposto fixo (20%%): R$ %.2f%n", imposto);
        System.out.printf("Total a pagar: R$ %.2f%n", totalAPagar);
        System.out.println("========================================");

        scanner.close();
    }
}
